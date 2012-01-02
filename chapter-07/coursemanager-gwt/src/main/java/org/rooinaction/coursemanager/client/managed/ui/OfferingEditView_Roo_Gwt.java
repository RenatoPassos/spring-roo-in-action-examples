// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

package org.rooinaction.coursemanager.client.managed.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.DivElement;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.Style.Display;
import com.google.gwt.editor.client.EditorError;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.text.shared.AbstractRenderer;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DoubleBox;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.IntegerBox;
import com.google.gwt.user.client.ui.LongBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.ValueListBox;
import com.google.gwt.user.datepicker.client.DateBox;
import com.google.web.bindery.requestfactory.gwt.client.RequestFactoryEditorDriver;
import com.google.web.bindery.requestfactory.shared.RequestFactory;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import org.rooinaction.coursemanager.client.managed.activity.OfferingEditActivityWrapper;
import org.rooinaction.coursemanager.client.managed.activity.OfferingEditActivityWrapper.View;
import org.rooinaction.coursemanager.client.scaffold.place.ProxyEditView;
import org.rooinaction.coursemanager.client.scaffold.ui.*;
import org.rooinaction.coursemanager.web.gwt.proxies.CourseProxy;
import org.rooinaction.coursemanager.web.gwt.proxies.InstructorProxy;
import org.rooinaction.coursemanager.web.gwt.proxies.OfferingProxy;
import org.rooinaction.coursemanager.web.gwt.proxies.RegistrationProxy;

public abstract class OfferingEditView_Roo_Gwt extends Composite implements View<OfferingEditView> {

    @UiField
    DateBox runDate;

    @UiField(provided = true)
    ValueListBox<CourseProxy> course = new ValueListBox<CourseProxy>(org.rooinaction.coursemanager.client.managed.ui.CourseProxyRenderer.instance(), new com.google.web.bindery.requestfactory.gwt.ui.client.EntityProxyKeyProvider<org.rooinaction.coursemanager.web.gwt.proxies.CourseProxy>());

    @UiField
    RegistrationSetEditor registrations;

    @UiField(provided = true)
    ValueListBox<InstructorProxy> instructor = new ValueListBox<InstructorProxy>(org.rooinaction.coursemanager.client.managed.ui.InstructorProxyRenderer.instance(), new com.google.web.bindery.requestfactory.gwt.ui.client.EntityProxyKeyProvider<org.rooinaction.coursemanager.web.gwt.proxies.InstructorProxy>());

    public void setInstructorPickerValues(Collection<org.rooinaction.coursemanager.web.gwt.proxies.InstructorProxy> values) {
        instructor.setAcceptableValues(values);
    }

    public void setCoursePickerValues(Collection<org.rooinaction.coursemanager.web.gwt.proxies.CourseProxy> values) {
        course.setAcceptableValues(values);
    }

    public void setRegistrationsPickerValues(Collection<org.rooinaction.coursemanager.web.gwt.proxies.RegistrationProxy> values) {
        registrations.setAcceptableValues(values);
    }
}
