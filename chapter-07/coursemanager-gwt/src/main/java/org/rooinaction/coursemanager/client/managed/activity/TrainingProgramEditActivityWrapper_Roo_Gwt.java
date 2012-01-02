// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

package org.rooinaction.coursemanager.client.managed.activity;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.web.bindery.requestfactory.shared.EntityProxyId;
import com.google.web.bindery.requestfactory.shared.Receiver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import org.rooinaction.coursemanager.client.managed.activity.TrainingProgramEditActivityWrapper.View;
import org.rooinaction.coursemanager.client.managed.request.ApplicationRequestFactory;
import org.rooinaction.coursemanager.client.managed.ui.CourseSetEditor;
import org.rooinaction.coursemanager.client.scaffold.activity.IsScaffoldMobileActivity;
import org.rooinaction.coursemanager.client.scaffold.place.ProxyEditView;
import org.rooinaction.coursemanager.client.scaffold.place.ProxyListPlace;
import org.rooinaction.coursemanager.client.scaffold.place.ProxyPlace;
import org.rooinaction.coursemanager.web.gwt.proxies.CourseProxy;
import org.rooinaction.coursemanager.web.gwt.proxies.TrainingProgramProxy;

public abstract class TrainingProgramEditActivityWrapper_Roo_Gwt implements Activity, IsScaffoldMobileActivity {

    protected Activity wrapped;

    protected View<?> view;

    protected ApplicationRequestFactory requests;

    @Override
    public void start(AcceptsOneWidget display, EventBus eventBus) {
        view.setCoursesPickerValues(Collections.<CourseProxy>emptyList());
        requests.courseRequest().findCourseEntries(0, 50).with(org.rooinaction.coursemanager.client.managed.ui.CourseProxyRenderer.instance().getPaths()).fire(new Receiver<List<CourseProxy>>() {

            public void onSuccess(List<CourseProxy> response) {
                List<CourseProxy> values = new ArrayList<CourseProxy>();
                values.add(null);
                values.addAll(response);
                view.setCoursesPickerValues(values);
            }
        });
        wrapped.start(display, eventBus);
    }
}
