package org.vaadin.springboot.easyprint;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.annotations.Widgetset;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.HorizontalSplitPanel;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import org.vaadin.addon.leaflet.LMap;
import org.vaadin.addon.leaflet.LOpenStreetMapLayer;
import org.vaadin.addon.leaflet.easyprint.LEasyPrint;
import org.vaadin.addon.leaflet.shared.ControlPosition;
import org.vaadin.spring.annotation.VaadinUI;

@VaadinUI
@Theme("valo")
@Title("Easyprint SpringBoot App")
@Widgetset("org.vaadin.springboot.easyprint.AppWidgetset")
public class AppUI extends UI {

    private static final String MAP_ID = "map";

    private LMap leafletMap;

    @Override
    protected void init(VaadinRequest request) {

        leafletMap = new LMap();
        leafletMap.setCenter(60.4525, 22.301);
        leafletMap.setZoomLevel(15);
        leafletMap.addBaseLayer(new LOpenStreetMapLayer(), "OSM");
        leafletMap.setId(MAP_ID);

        LEasyPrint easyPrint = new LEasyPrint();
        easyPrint.setPosition(ControlPosition.topleft);
        easyPrint.setId(leafletMap.getId());
//        easyPrint.setEnabled(false);
        leafletMap.addControl(easyPrint);

        HorizontalSplitPanel splitPanel = new HorizontalSplitPanel();
        splitPanel.setFirstComponent(leafletMap);
        splitPanel.setSecondComponent(new Label("Second Component"));

        this.setContent(splitPanel);
    }

}
