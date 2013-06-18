// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.springsource.votesecure.web;

import com.springsource.votesecure.domain.Choice;
import com.springsource.votesecure.web.ChoiceController;
import java.io.UnsupportedEncodingException;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.util.UriUtils;
import org.springframework.web.util.WebUtils;

privileged aspect ChoiceController_Roo_Controller {
    
    @RequestMapping(method = RequestMethod.POST, produces = "text/html")
    public String ChoiceController.create(@Valid Choice choice, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            populateEditForm(uiModel, choice);
            return "choices/create";
        }
        uiModel.asMap().clear();
        choice.persist();
        return "redirect:/choices/" + encodeUrlPathSegment(choice.getId().toString(), httpServletRequest);
    }
    
    @RequestMapping(params = "form", produces = "text/html")
    public String ChoiceController.createForm(Model uiModel) {
        populateEditForm(uiModel, new Choice());
        return "choices/create";
    }
    
    @RequestMapping(value = "/{id}", produces = "text/html")
    public String ChoiceController.show(@PathVariable("id") Long id, Model uiModel) {
        uiModel.addAttribute("choice", Choice.findChoice(id));
        uiModel.addAttribute("itemId", id);
        return "choices/show";
    }
    
    @RequestMapping(produces = "text/html")
    public String ChoiceController.list(@RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, Model uiModel) {
        if (page != null || size != null) {
            int sizeNo = size == null ? 10 : size.intValue();
            final int firstResult = page == null ? 0 : (page.intValue() - 1) * sizeNo;
            uiModel.addAttribute("choices", Choice.findChoiceEntries(firstResult, sizeNo));
            float nrOfPages = (float) Choice.countChoices() / sizeNo;
            uiModel.addAttribute("maxPages", (int) ((nrOfPages > (int) nrOfPages || nrOfPages == 0.0) ? nrOfPages + 1 : nrOfPages));
        } else {
            uiModel.addAttribute("choices", Choice.findAllChoices());
        }
        return "choices/list";
    }
    
    @RequestMapping(method = RequestMethod.PUT, produces = "text/html")
    public String ChoiceController.update(@Valid Choice choice, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            populateEditForm(uiModel, choice);
            return "choices/update";
        }
        uiModel.asMap().clear();
        choice.merge();
        return "redirect:/choices/" + encodeUrlPathSegment(choice.getId().toString(), httpServletRequest);
    }
    
    @RequestMapping(value = "/{id}", params = "form", produces = "text/html")
    public String ChoiceController.updateForm(@PathVariable("id") Long id, Model uiModel) {
        populateEditForm(uiModel, Choice.findChoice(id));
        return "choices/update";
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = "text/html")
    public String ChoiceController.delete(@PathVariable("id") Long id, @RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, Model uiModel) {
        Choice choice = Choice.findChoice(id);
        choice.remove();
        uiModel.asMap().clear();
        uiModel.addAttribute("page", (page == null) ? "1" : page.toString());
        uiModel.addAttribute("size", (size == null) ? "10" : size.toString());
        return "redirect:/choices";
    }
    
    void ChoiceController.populateEditForm(Model uiModel, Choice choice) {
        uiModel.addAttribute("choice", choice);
    }
    
    String ChoiceController.encodeUrlPathSegment(String pathSegment, HttpServletRequest httpServletRequest) {
        String enc = httpServletRequest.getCharacterEncoding();
        if (enc == null) {
            enc = WebUtils.DEFAULT_CHARACTER_ENCODING;
        }
        try {
            pathSegment = UriUtils.encodePathSegment(pathSegment, enc);
        } catch (UnsupportedEncodingException uee) {}
        return pathSegment;
    }
    
}
