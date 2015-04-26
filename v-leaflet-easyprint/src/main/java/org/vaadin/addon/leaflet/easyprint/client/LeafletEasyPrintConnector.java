package org.vaadin.addon.leaflet.easyprint.client;

import com.vaadin.shared.ui.Connect;
import org.vaadin.addon.leaflet.client.AbstractDefaultControl;
import org.vaadin.addon.leaflet.easyprint.LEasyPrint;
import org.vaadin.gleaflet.easyprint.client.EasyPrint;

@Connect(LEasyPrint.class)
public class LeafletEasyPrintConnector extends AbstractDefaultControl {

    @Override
    protected EasyPrint createControl() {
        EasyPrint result = EasyPrint.create();
        getMap().addControl(result);
        return result;
    }

    @Override
    protected EasyPrint getControl() {
        return (EasyPrint) super.getControl();
    }

}