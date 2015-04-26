package org.vaadin.addon.leaflet.demoandtestapp;

import com.vaadin.ui.Component;
import org.vaadin.addon.leaflet.LMap;
import org.vaadin.addon.leaflet.LOpenStreetMapLayer;
import org.vaadin.addon.leaflet.demoandtestapp.util.AbstractTest;
import org.vaadin.addon.leaflet.easyprint.LEasyPrint;
import org.vaadin.addon.leaflet.shared.ControlPosition;

public class EasyPrintTest extends AbstractTest {

    @Override
    public String getDescription() {
        return "Test easyprint control";
    }

    private LMap leafletMap;

    @Override
    public Component getTestComponent() {
        leafletMap = new LMap();
        leafletMap.setCenter(60.4525, 22.301);
        leafletMap.setZoomLevel(15);
        leafletMap.addBaseLayer(new LOpenStreetMapLayer(), "OSM");

        LEasyPrint easyPrint = new LEasyPrint();
        easyPrint.setPosition(ControlPosition.topleft);
        // easyPrint.setEnabled(false);
        leafletMap.addControl(easyPrint);

        return leafletMap;
    }

    @Override
    protected void setup() {
        super.setup();
    }

}
