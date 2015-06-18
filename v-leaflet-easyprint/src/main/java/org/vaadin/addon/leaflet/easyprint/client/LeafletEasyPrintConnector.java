package org.vaadin.addon.leaflet.easyprint.client;

import com.vaadin.client.communication.StateChangeEvent;
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
        if(getState().id != null) {
            options.setId(getState().id);
        }

        EasyPrint result = EasyPrint.create(options);
        getMap().addControl(result);
        return result;
    }

    @Override
    protected void doStateChange(StateChangeEvent stateChangeEvent) {
        super.doStateChange(stateChangeEvent);
    }

    @Override
    public LeafletEasyPrintState getState() {
        return (LeafletEasyPrintState) super.getState();
    }

    @Override
    protected EasyPrint getControl() {
        return (EasyPrint) super.getControl();
    }

}