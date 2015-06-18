package org.vaadin.addon.leaflet.easyprint.client;

import com.vaadin.shared.ui.Connect;
import org.vaadin.addon.leaflet.client.AbstractDefaultControl;
import org.vaadin.addon.leaflet.easyprint.LEasyPrint;
import org.vaadin.gleaflet.easyprint.client.EasyPrint;
import org.vaadin.gleaflet.easyprint.client.EasyPrintOptions;

@Connect(LEasyPrint.class)
public class LeafletEasyPrintConnector extends AbstractDefaultControl {

    @Override
    protected EasyPrint createControl() {
        EasyPrintOptions options = EasyPrintOptions.create();
        options.setId("#map");

        EasyPrint result = EasyPrint.create(options);
        getMap().addControl(result);
        return result;
    }

    @Override
    protected EasyPrint getControl() {
        return (EasyPrint) super.getControl();
    }

}