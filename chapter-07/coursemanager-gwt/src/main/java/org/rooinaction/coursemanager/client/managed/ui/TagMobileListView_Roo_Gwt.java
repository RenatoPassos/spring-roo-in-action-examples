// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

package org.rooinaction.coursemanager.client.managed.ui;

import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.i18n.client.NumberFormat;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.text.client.DateTimeFormatRenderer;
import com.google.gwt.text.shared.AbstractRenderer;
import com.google.gwt.text.shared.AbstractSafeHtmlRenderer;
import com.google.gwt.text.shared.Renderer;
import com.google.gwt.text.shared.SafeHtmlRenderer;
import java.util.HashSet;
import java.util.Set;
import org.rooinaction.coursemanager.client.scaffold.ScaffoldMobileApp;
import org.rooinaction.coursemanager.client.scaffold.ui.MobileProxyListView;
import org.rooinaction.coursemanager.web.gwt.proxies.CourseProxy;
import org.rooinaction.coursemanager.web.gwt.proxies.TagProxy;

public abstract class TagMobileListView_Roo_Gwt extends MobileProxyListView<TagProxy> {

    protected Set<String> paths = new HashSet<String>();

    public TagMobileListView_Roo_Gwt(String buttonText, SafeHtmlRenderer<org.rooinaction.coursemanager.web.gwt.proxies.TagProxy> renderer) {
        super(buttonText, renderer);
    }

    public void init() {
        paths.add("tag");
        paths.add("description");
    }
}
