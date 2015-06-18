package org.vaadin.gleaflet.easyprint.client;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * options: {
     position: 'topleft',
     title: 'Print map'
 * }
 */
public class EasyPrintOptions extends JavaScriptObject {

    protected EasyPrintOptions() {}

    public static native EasyPrintOptions create() /*-{
        return {};
    }-*/;

    public native final void setTitle(String title)	/*-{
        this.title = title;
    }-*/;

    public native final void setId(String id) /*-{
        this.id = id;
    }-*/;

}
