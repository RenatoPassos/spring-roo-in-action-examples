// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

package org.rooinaction.coursemanager.client.managed.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.SpanElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.i18n.client.NumberFormat;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;
import java.util.Set;
import org.rooinaction.coursemanager.client.scaffold.place.ProxyDetailsView;
import org.rooinaction.coursemanager.client.scaffold.place.ProxyListView;
import org.rooinaction.coursemanager.web.gwt.proxies.CourseProxy;
import org.rooinaction.coursemanager.web.gwt.proxies.TrainingProgramProxy;

public abstract class TrainingProgramDetailsView_Roo_Gwt extends Composite implements ProxyDetailsView<TrainingProgramProxy> {

    @UiField
    SpanElement id;

    @UiField
    SpanElement name;

    @UiField
    SpanElement courses;

    @UiField
    SpanElement version;

    TrainingProgramProxy proxy;

    @UiField
    SpanElement displayRenderer;

    public void setValue(TrainingProgramProxy proxy) {
        this.proxy = proxy;
        id.setInnerText(proxy.getId() == null ? "" : String.valueOf(proxy.getId()));
        name.setInnerText(proxy.getName() == null ? "" : String.valueOf(proxy.getName()));
        courses.setInnerText(proxy.getCourses() == null ? "" : org.rooinaction.coursemanager.client.scaffold.place.CollectionRenderer.of(org.rooinaction.coursemanager.client.managed.ui.CourseProxyRenderer.instance()).render(proxy.getCourses()));
        version.setInnerText(proxy.getVersion() == null ? "" : String.valueOf(proxy.getVersion()));
        displayRenderer.setInnerText(TrainingProgramProxyRenderer.instance().render(proxy));
    }
}
