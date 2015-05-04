package org.vaadin.gleaflet.easyprint.client.resources;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.resources.client.DataResource.DoNotEmbed;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.resources.client.TextResource;

public interface LeafletEasyPrintClientBundle extends ClientBundle {

    @Source("jquery-1.11.2.min.js")
    TextResource jquery();

    @Source("jQuery.print.js")
    TextResource jQueryPrint();

    @Source("leaflet.easyPrint.js")
    @DoNotEmbed
    TextResource script();

    @Source("easyPrint.css")
    @CssResource.NotStrict
    CssResource css();

    @Source("print.png")
    ImageResource print();

}
