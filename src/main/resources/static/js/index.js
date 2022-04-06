// Initialize and add the map
function initMap(data) {
	const VIC_BOUNDS = {
		north: -34.07,
		south: -39.12,
		west: 140.58,
		east: 149.57,
	};
	west: -36.007154
	// The location point
	const tourStops = [
		[{
			lat: -34.8791806,
			lng: 141.8265049
		}, "Pig"],
		[{
			lat: -34.8559195,
			lng: 142.7988186
		}, "Pig"],
		[{
			lat: -34.832149,
			lng: 143.7695277
		}, "Pig"],
		[{
			lat: -34.823736,
			lng: 144.8001857
		}, "Cow"],
		[{
			lat: -34.800326,
			lng: 145.7665047
		}, "Cow"],
	];

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
	const geocoder = new google.maps.Geocoder();
	const infowindow = new google.maps.InfoWindow();

	document.getElementById("submit").addEventListener("click", () => {
		geocodeLatLng(geocoder, map, infowindow);
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

	let infoWindow = new google.maps.InfoWindow({
		content: "Click the map to get Lat/Lng!",
	});

	infoWindow.open(map);
	// Configure the click listener.
	map.addListener("click", (mapsMouseEvent) => {
		// Close the current InfoWindow.
		infoWindow.close();
		// Create a new InfoWindow.
		infoWindow = new google.maps.InfoWindow({
			position: mapsMouseEvent.latLng,
		});
		infoWindow.setContent(
			JSON.stringify(mapsMouseEvent.latLng.toJSON(), null, 2)
		);
		infoWindow.open(map);
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
		});
	}
