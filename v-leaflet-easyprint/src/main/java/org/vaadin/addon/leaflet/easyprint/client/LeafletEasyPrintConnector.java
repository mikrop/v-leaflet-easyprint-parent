package org.vaadin.addon.leaflet.easyprint.client;

import com.vaadin.shared.ui.Connect;
import org.peimari.gleaflet.client.control.Control;
import org.vaadin.addon.leaflet.client.AbstractDefaultControl;
import org.vaadin.addon.leaflet.easyprint.LEasyPrint;

@Connect(LEasyPrint.class)
public class LeafletEasyPrintConnector<Print> extends AbstractDefaultControl {

    @Override
    protected Control createControl() {
        return org.vaadin.gleaflet.easyprint.client.EasyPrint.create();
    }

}