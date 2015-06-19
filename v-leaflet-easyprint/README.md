# Leaflet.easyPrint wrappers for Vaadin & GWT

This project provides Java API for both client (GWT, with "g-" prefix) and server (Vaadin) side for the popular Leaflet add-on.

Realeases can be downloaded form [https://vaadin.com/directory](https://vaadin.com/directory)

### Vaadin API for Leaflet: [V-Leaflet](https://github.com/mstahv/v-leaflet)

During development you might need to have development version of v-leaflet, g-leaflet and possibly g-leaflet-draw as well.

### The original Leaflet add-on library: [Leaflet.easyPrint](https://github.com/rowanwins/leaflet-easyPrint)

### The core slippy map library: [LeafletJS](http://leafletjs.com)

### Manually running test server and test apps during development

The TServer class has a main method that you can launch. It opens an embedded jetty to port 9998. The main view lists all tests and clicking one opens it in a new window. The easiest method is usually running that from you IDE (e.g. open the class and then hit CTRL/CMD-F11 in Eclipse). 

From command line one can launch it with easily with correct classpath with maven exec plugin:
```
mvn -e exec:java -Dexec.mainClass="org.vaadin.addon.leaflet.demoandtestapp.util.UiRunner" -Dexec.classpathScope=test
```


