package org.vaadin.addon.leaflet.demoandtestapp;

import com.vaadin.ui.Component;
import com.vaadin.ui.HorizontalSplitPanel;
import com.vaadin.ui.Label;
import org.vaadin.addon.leaflet.LMap;
import org.vaadin.addon.leaflet.LOpenStreetMapLayer;
import org.vaadin.addon.leaflet.easyprint.LEasyPrint;
import org.vaadin.addon.leaflet.shared.ControlPosition;
import org.vaadin.addonhelpers.AbstractTest;

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
        leafletMap.setId("map");

        LEasyPrint easyPrint = new LEasyPrint();
        easyPrint.setPosition(ControlPosition.topleft);
//        easyPrint.setEnabled(false);
        leafletMap.addControl(easyPrint);

        HorizontalSplitPanel splitPanel = new HorizontalSplitPanel();
        splitPanel.setFirstComponent(leafletMap);
        splitPanel.setSecondComponent(new Label("Second Component"));
        return splitPanel;
    }

    @Override
    protected void setup() {
        super.setup();
    }

}
