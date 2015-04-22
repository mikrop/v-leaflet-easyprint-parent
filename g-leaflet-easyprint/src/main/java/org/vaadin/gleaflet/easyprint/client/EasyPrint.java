package org.vaadin.gleaflet.easyprint.client;

import org.peimari.gleaflet.client.control.Control;
import org.vaadin.gleaflet.easyprint.client.resources.LeafletPrintResourceInjector;

public class EasyPrint extends Control {

	static {
        LeafletPrintResourceInjector.ensureInjected();
	}

	protected EasyPrint() {}
	
	public static native EasyPrint create()
	/*-{
		return new $wnd.L.Control.EasyPrint();
	}-*/;

}
