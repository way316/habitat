// Initialize and add the map
function initMap(data) {
	const VIC_BOUNDS = {
		north: -34.07,
		south: -39.12,
		west: 140.58,
		east: 149.57,
	};
	west: -36.007154
	// const infoWindow = new google.maps.InfoWindow();
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

	let infoWindow = new google.maps.InfoWindow({
		content: "Click the map to get Lat/Lng!",
	});

	infoWindow.open(map);

	map.addListener("click", (mapsMouseEvent) => {
		// Close the current InfoWindow.
		infoWindow.close();
		// Create a new InfoWindow.
		infoWindow = new google.maps.InfoWindow({
			position: mapsMouseEvent.latLng,
		});
		console.log(infoWindow);
		infoWindow.setContent(
			JSON.stringify(mapsMouseEvent.latLng.toJSON(), null, 2)
		);
		infoWindow.open(map);
	});

	const geocoder = new google.maps.Geocoder();
	const infowindow = new google.maps.InfoWindow();

	document.getElementById("submit").addEventListener("click", () => {
		geocodeLatLng(geocoder, map, infowindow);
	});

	var positions = new Array();
	console.log(data);
	for (var i = 0; i < data.length; i++) {
		var position = new google.maps.LatLng(data[i].decimallatitude, data[i].decimalLongitude);
		positions.push(position)
	};
	console.log(positions);
	positions.forEach((position) => {
		const marker = new google.maps.Marker({
			position,
			map,
			fontColor: "blue",
			optimized: false,
		})
	});
}




function geocodeLatLng(geocoder, map, infowindow) {
	const input = document.getElementById("latlng").value;
	const latlngStr = input.split(",", 2);
	const latlng = {
		lat: parseFloat(latlngStr[0]),
		lng: parseFloat(latlngStr[1]),
	};

	geocoder
		.geocode({
			location: latlng
		})
		.then((response) => {
			if (response.results[0]) {
				map.setZoom(11);

				const marker = new google.maps.Marker({
					position: latlng,
					map: map,
				});

				infowindow.setContent(response.results[0].formatted_address);
				infowindow.open(map, marker);
			} else {
				window.alert("No results found");
			}
		})
		.catch((e) => window.alert("Geocoder failed due to: " + e));
	// Configure the click listener.


		/*	// The marker, positioned at ??
            tourStops.forEach(([position, title], i) => {
                const marker = new google.maps.Marker({
                    position,
                    map,
                    title: `${title}`,
                    label: `${title}`,
                    fontColor: "blue",
                    optimized: false,
                });*/


		// marker.addListener("click", () => {
		// 		infoWindow.close();
		// 		infoWindow.setContent(marker.getTitle());
		// 		infoWindow.open(marker.getMap(), marker);
		// 	});
	}
