// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

package org.rooinaction.coursemanager.client.managed.activity;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.view.client.Range;
import com.google.web.bindery.requestfactory.shared.Receiver;
import com.google.web.bindery.requestfactory.shared.Request;
import java.util.List;
import org.rooinaction.coursemanager.client.managed.request.ApplicationRequestFactory;
import org.rooinaction.coursemanager.client.scaffold.ScaffoldMobileApp;
import org.rooinaction.coursemanager.client.scaffold.activity.IsScaffoldMobileActivity;
import org.rooinaction.coursemanager.client.scaffold.place.AbstractProxyListActivity;
import org.rooinaction.coursemanager.client.scaffold.place.ProxyListView;
import org.rooinaction.coursemanager.web.gwt.proxies.InstructorProxy;

public abstract class InstructorListActivity_Roo_Gwt extends AbstractProxyListActivity<InstructorProxy> implements IsScaffoldMobileActivity {

    protected ApplicationRequestFactory requests;

    public InstructorListActivity_Roo_Gwt(PlaceController placeController, ProxyListView<org.rooinaction.coursemanager.web.gwt.proxies.InstructorProxy> view, Class<org.rooinaction.coursemanager.web.gwt.proxies.InstructorProxy> proxyType) {
        super(placeController, view, proxyType);
    }

    protected void fireCountRequest(Receiver<java.lang.Long> callback) {
        requests.instructorRequest().countInstructors().fire(callback);
    }
}