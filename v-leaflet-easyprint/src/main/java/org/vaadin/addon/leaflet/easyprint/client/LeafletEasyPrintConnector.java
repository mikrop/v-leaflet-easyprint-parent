package org.vaadin.addon.leaflet.easyprint.client;

import com.vaadin.shared.ui.Connect;
import org.peimari.gleaflet.client.control.Control;
import org.vaadin.addon.leaflet.client.AbstractDefaultControl;
import org.vaadin.addon.leaflet.easyprint.LEasyPrint;
import org.vaadin.gleaflet.easyprint.client.EasyPrint;

@Connect(LEasyPrint.class)
public class LeafletEasyPrintConnector<Print> extends AbstractDefaultControl {

    @Override
    protected Control createControl() {
        return EasyPrint.create();
    }

}