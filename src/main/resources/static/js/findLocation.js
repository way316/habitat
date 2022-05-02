// This sample uses the Place Autocomplete widget to allow the user to search
// for and select a place. The sample then displays an info window containing
// the place ID and other information about the place that the user has
// selected.
// This example requires the Places library. Include the libraries=places
// parameter when you first load the API. For example:
// <script src="https://maps.googleapis.com/maps/api/js?key=YOUR_API_KEY&libraries=places">
function initMap() {
    const VIC_BOUNDS = {
        north: -34.07,
        south: -39.12,
        west: 140.58,
        east: 149.57,
    };
    west: -36.007154
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
    const input = document.getElementById("pac-input");
    // Specify just the place data fields that you need.
    const autocomplete = new google.maps.places.Autocomplete(input, {
        fields: ["place_id", "geometry", "formatted_address", "name"],
    });

    autocomplete.bindTo("bounds", map);
    map.controls[google.maps.ControlPosition.TOP_LEFT].push(input);

    const infowindow = new google.maps.InfoWindow();
    const infowindowContent = document.getElementById("infowindow-content");

    infowindow.setContent(infowindowContent);

    const marker = new google.maps.Marker({map: map});

    marker.addListener("click", () => {
        infowindow.open(map, marker);
    });
    autocomplete.addListener("place_changed", () => {
        infowindow.close();

        const place = autocomplete.getPlace();

        if (!place.geometry || !place.geometry.location) {
            return;
        }

        if (place.geometry.viewport) {
            map.fitBounds(place.geometry.viewport);
        } else {
            map.setCenter(place.geometry.location);
            map.setZoom(17);
        }
        console.log(place.place_id);
        // Set the position of the marker using the place ID and location.
        marker.setPlace({
            placeId: place.place_id,
            location: place.geometry.location,
        });
        marker.setVisible(true);
        infowindowContent.children.namedItem("place-name").textContent = place.name;
        infowindowContent.children.namedItem("place-address").textContent =
            place.formatted_address;
        infowindow.open(map, marker);
        var googleUrl = "https://maps.googleapis.com/maps/api/geocode/json?place_id=" + place.place_id + "&key=AIzaSyBgJnK-1oUKm4c-2hbVMlxw5UHi0YsX3Ls"
        $.ajax({
            url: googleUrl,
            async: false,
            type: 'GET',
            success: function (data) {
                console.log(data.results[0].geometry);
                localStorage.setItem("lat", data.results[0].geometry.location.lat);
                localStorage.setItem("lng", data.results[0].geometry.location.lng);
            }
        });
        var lat = localStorage.getItem("lat");
        var lng = localStorage.getItem("lng");
        var animalListUrl = "/api/findAnimalNamesByLocation/" + lat + "/" + lng;
        console.log(animalListUrl);
        $.ajax({
            url: animalListUrl,
            type: 'GET',
            success: function (data) {
                console.log(data);
                $('thead').append("        <tr>\n" +
                    "            <th width=\"5%\">No</th>\n" +
                    "            <th>Animal Name</th>\n" +
                    "            <th>Animal Description</th>\n" +
                    "            <th>View button</th>\n" +
                    "            </tr>");
                for (var i = 0; i < data.length; i++) {
                    var number = i + 1;
                    var buttonUrl = "/findNearbyHabitat/" + lat + "/" + lng + "/" + data[i].animalName;
                    var nameUrl = "/findAnimalInfo/" + data[i].animalName;
                    var tableBody = "<tr><td>" + number + "</td>"  +"<td>" + "<a href ='" + nameUrl +"' class = 'text-dark'>" + data[i].animalName + "</a></td>" +"<td>" + data[i].animalDescription + "</td>" + "<td>" + "<a href = '" + buttonUrl + "'><button class='btn btn-dark'>Find Habitat Nearby</button></a>";
                    $('tbody').append(tableBody);
                }
            }
        });


    });
}