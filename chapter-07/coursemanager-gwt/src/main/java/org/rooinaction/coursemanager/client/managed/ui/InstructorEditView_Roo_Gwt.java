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
import org.rooinaction.coursemanager.client.managed.activity.InstructorEditActivityWrapper;
import org.rooinaction.coursemanager.client.managed.activity.InstructorEditActivityWrapper.View;
import org.rooinaction.coursemanager.client.scaffold.place.ProxyEditView;
import org.rooinaction.coursemanager.client.scaffold.ui.*;
import org.rooinaction.coursemanager.web.gwt.proxies.InstructorProxy;

public abstract class InstructorEditView_Roo_Gwt extends Composite implements View<InstructorEditView> {

    @UiField
    TextBox fullName;

    @UiField
    TextBox firstName;

    @UiField
    TextBox middleNameOrInitial;

    @UiField
    TextBox lastName;

    @UiField
    TextBox addressLine1;

    @UiField
    TextBox addressLine2;

    @UiField
    TextBox city;

    @UiField
    TextBox stateCode;

    @UiField
    TextBox postalCode;

    @UiField
    TextBox emailAddress;

    @UiField
    TextBox taxNumber;
}
