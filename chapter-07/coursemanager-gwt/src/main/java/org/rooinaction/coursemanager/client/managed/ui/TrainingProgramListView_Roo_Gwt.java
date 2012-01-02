// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

package org.rooinaction.coursemanager.client.managed.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.i18n.client.NumberFormat;
import com.google.gwt.text.client.DateTimeFormatRenderer;
import com.google.gwt.text.shared.AbstractRenderer;
import com.google.gwt.text.shared.Renderer;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.HasKeyboardSelectionPolicy.KeyboardSelectionPolicy;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HTMLPanel;
import java.util.HashSet;
import java.util.Set;
import org.rooinaction.coursemanager.client.scaffold.place.AbstractProxyListView;
import org.rooinaction.coursemanager.web.gwt.proxies.CourseProxy;
import org.rooinaction.coursemanager.web.gwt.proxies.TrainingProgramProxy;

public abstract class TrainingProgramListView_Roo_Gwt extends AbstractProxyListView<TrainingProgramProxy> {

    @UiField
    CellTable<TrainingProgramProxy> table;

    protected Set<String> paths = new HashSet<String>();

    public void init() {
        paths.add("id");
        table.addColumn(new TextColumn<TrainingProgramProxy>() {

            Renderer<java.lang.Long> renderer = new AbstractRenderer<java.lang.Long>() {

                public String render(java.lang.Long obj) {
                    return obj == null ? "" : String.valueOf(obj);
                }
            };

            @Override
            public String getValue(TrainingProgramProxy object) {
                return renderer.render(object.getId());
            }
        }, "Id");
        paths.add("name");
        table.addColumn(new TextColumn<TrainingProgramProxy>() {

            Renderer<java.lang.String> renderer = new AbstractRenderer<java.lang.String>() {

                public String render(java.lang.String obj) {
                    return obj == null ? "" : String.valueOf(obj);
                }
            };

            @Override
            public String getValue(TrainingProgramProxy object) {
                return renderer.render(object.getName());
            }
        }, "Name");
        paths.add("courses");
        table.addColumn(new TextColumn<TrainingProgramProxy>() {

            Renderer<java.util.Set> renderer = org.rooinaction.coursemanager.client.scaffold.place.CollectionRenderer.of(org.rooinaction.coursemanager.client.managed.ui.CourseProxyRenderer.instance());

            @Override
            public String getValue(TrainingProgramProxy object) {
                return renderer.render(object.getCourses());
            }
        }, "Courses");
        paths.add("version");
        table.addColumn(new TextColumn<TrainingProgramProxy>() {

            Renderer<java.lang.Integer> renderer = new AbstractRenderer<java.lang.Integer>() {

                public String render(java.lang.Integer obj) {
                    return obj == null ? "" : String.valueOf(obj);
                }
            };

            @Override
            public String getValue(TrainingProgramProxy object) {
                return renderer.render(object.getVersion());
            }
        }, "Version");
    }
}
