// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

package org.rooinaction.coursemanager.client.managed.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
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
import org.rooinaction.coursemanager.client.scaffold.place.ProxyDetailsView;
import org.rooinaction.coursemanager.web.gwt.proxies.OfferingProxy;
import org.rooinaction.coursemanager.web.gwt.proxies.RegistrationProxy;
import org.rooinaction.coursemanager.web.gwt.proxies.StudentProxy;

public abstract class RegistrationMobileDetailsView_Roo_Gwt extends Composite implements ProxyDetailsView<RegistrationProxy> {

    @UiField
    Element id;

    @UiField
    Element student;

    @UiField
    Element offering;

    @UiField
    Element version;

    RegistrationProxy proxy;

    public void setValue(RegistrationProxy proxy) {
        this.proxy = proxy;
        id.setInnerText(proxy.getId() == null ? "" : String.valueOf(proxy.getId()));
        student.setInnerText(proxy.getStudent() == null ? "" : org.rooinaction.coursemanager.client.managed.ui.StudentProxyRenderer.instance().render(proxy.getStudent()));
        offering.setInnerText(proxy.getOffering() == null ? "" : org.rooinaction.coursemanager.client.managed.ui.OfferingProxyRenderer.instance().render(proxy.getOffering()));
        version.setInnerText(proxy.getVersion() == null ? "" : String.valueOf(proxy.getVersion()));
    }
}
