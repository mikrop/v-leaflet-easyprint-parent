
L.EasyPrint = L.Control.extend({
    options: {
        position: 'topleft',
        title: 'Print map'
    },

    onAdd: function (map) {
        var container = L.DomUtil.create('div', 'leaflet-control-easyPrint leaflet-bar leaflet-control');
        var id = (this.options.id) ? '"#' + this.options.id + '"' : document.body;

        this.link = L.DomUtil.create('a', 'leaflet-control-easyPrint-button leaflet-bar-part', container);
        this.link.href = 'javascript:void(0)($(' + id + ').print({stylesheet:"easyPrint.css"}))';

        return container;
    },

    _click: function (e) {
        L.DomEvent.stopPropagation(e);
        L.DomEvent.preventDefault(e);
    }
});

L.easyPrint = function() {
    return new L.EasyPrint();
};
