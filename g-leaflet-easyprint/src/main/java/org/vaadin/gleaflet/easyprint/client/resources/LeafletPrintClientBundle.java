package org.vaadin.gleaflet.easyprint.client.resources;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.resources.client.DataResource.DoNotEmbed;
import com.google.gwt.resources.client.TextResource;

public interface LeafletPrintClientBundle extends ClientBundle {
 
    @Source("leaflet.easyPrint.js")
    @DoNotEmbed
    TextResource script();

    @Source("easyPrint.css")
    @CssResource.NotStrict
    CssResource css();

}
