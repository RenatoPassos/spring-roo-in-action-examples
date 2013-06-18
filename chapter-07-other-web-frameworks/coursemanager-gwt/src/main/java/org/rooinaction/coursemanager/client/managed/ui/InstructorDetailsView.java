package org.rooinaction.coursemanager.client.managed.ui;
import org.rooinaction.coursemanager.client.scaffold.place.ProxyDetailsView;
import org.rooinaction.coursemanager.web.proxy.InstructorProxy;

public interface InstructorDetailsView extends ProxyDetailsView<InstructorProxy> {

    void setDelegate(Delegate delegate);

    interface Delegate extends org.rooinaction.coursemanager.client.scaffold.place.ProxyDetailsView.Delegate {
    }
}
