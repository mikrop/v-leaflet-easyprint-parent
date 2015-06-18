package org.vaadin.gleaflet.easyprint.client;

import org.peimari.gleaflet.client.control.Control;
import org.vaadin.gleaflet.easyprint.client.resources.LeafletEasyPrintResourceInjector;

public class EasyPrint extends Control {

	static {
        LeafletEasyPrintResourceInjector.ensureInjected();
	}

	protected EasyPrint() {}

    public static native EasyPrint create(EasyPrintOptions options)
	/*-{
        return new $wnd.L.EasyPrint(options);
    }-*/;

}
