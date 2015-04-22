package org.vaadin.addon.leaflet.demoandtestapp;

import com.vaadin.ui.Component;
import org.vaadin.addon.leaflet.LMap;
import org.vaadin.addon.leaflet.LOpenStreetMapLayer;
import org.vaadin.addon.leaflet.control.LAttribution;
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
		/*
		 * Using nameless api, doesn't add layers control
		 */
        // leafletMap.addLayer(baselayer);

		/*
		 * Layers control can also be removed manually
		 */
        // leafletMap.getLayersControl().remove();

		/*
		 * DEFAULT CONTROLS These are on there by default, but can be customized
		 * and disabled if needed.
		 */

        LAttribution attribution = new LAttribution();
        attribution.setPrefix("Leaflet with Java in JVM");
        attribution.setPosition(ControlPosition.bottomleft);
        // attribution.setEnabled(false);
        leafletMap.addControl(attribution);

        LEasyPrint easyPrint = new LEasyPrint();
        easyPrint.setPosition(ControlPosition.topleft);
//        print.setEnabled(false);
        leafletMap.addControl(easyPrint);

        return leafletMap;
    }

    @Override
    protected void setup() {
        super.setup();
    }

}
