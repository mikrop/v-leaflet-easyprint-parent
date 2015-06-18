package org.vaadin.addon.leaflet.easyprint;

import org.vaadin.addon.leaflet.control.AbstractDefaultControl;
import org.vaadin.addon.leaflet.easyprint.client.LeafletEasyPrintState;

public class LEasyPrint extends AbstractDefaultControl {

    @Override
    protected LeafletEasyPrintState getState() {
        return (LeafletEasyPrintState) super.getState();
    }

    public String getId() {
        return getState().id;
    }

    public void setId(String id) {
        getState().id = id;
    }

}
