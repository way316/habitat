// Initialize and add the map
function initMap() {
    const VIC_BOUNDS = {
        north: -34.07,
        south: -39.12,
        west: 140.58,
        east: 149.57,
    };
    west: -36.007154;
    const infoWindow = new google.maps.InfoWindow();
    // The map, centered at ??
    const map = new google.maps.Map(document.getElementById("map"), {
        restriction: {
            latLngBounds: VIC_BOUNDS,
            strictBounds: false,
        },
        zoom: 7,
        center: {
            lat: -37,
            lng: 144
        },
    });
    console.log(positionList);
    var positions = new Array();
    for(var i=0;i<positionList.length;i++){
        var position = new google.maps.LatLng(positionList[i].decimallatitude,positionList[i].decimalLongitude);
        positions.push(position);
    }

    positions.forEach((position) => {
        const marker = new google.maps.Marker({
            position,
            map,
            fontColor: "blue",
            optimized: false,
        });

        marker.addListener("click", () => {
            infoWindow.close();
            infoWindow.setContent(marker.getTitle());
            infoWindow.open(marker.getMap(), marker);
        });
    });
}

