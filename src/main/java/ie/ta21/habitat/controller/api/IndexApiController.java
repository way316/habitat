package ie.ta21.habitat.controller.api;

import ie.ta21.habitat.entity.AnimalInfo;
import ie.ta21.habitat.entity.Coordinates;
import ie.ta21.habitat.service.AnimalHabitatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(("/api"))
public class IndexApiController {
    @Autowired
    AnimalHabitatService animalHabitatService;

    @RequestMapping("/findCoordinatesByAnimalName/{animalName}")
    public List<Coordinates> findCoordinatesByAnimalName (@PathVariable("animalName") String animalName) {
        List<Coordinates> coordinatesList = new ArrayList<>();
        if (animalName == null) {
            return coordinatesList;
        }
        coordinatesList = animalHabitatService.findCoordinatesByName(animalName);
        return coordinatesList;
    }

    @RequestMapping("/findInfoByName/{animalName}")
    public List<AnimalInfo> findInfoByName (@PathVariable("animalName") String animalName) {
        List<AnimalInfo> animalInfoList = new ArrayList<>();
        if (animalName == null) {
            return animalInfoList;
        }
        animalInfoList = animalHabitatService.getAnimalInfo(animalName);
        return animalInfoList;
    }

    @RequestMapping("/findAnimalNamesByLocation/{latitude}/{longitude}")
    public List<String> findAnimalListByCoordinates (@PathVariable("latitude") String latitude, @PathVariable("longitude") String longitude) {
        if (latitude == null | longitude == null) {
            return null;
        }
        List<String> animalList = animalHabitatService.findAnimalByCoordinates(latitude,longitude);
        return animalList;
    }

    @RequestMapping("/findNearbyHabitat/{latitude}/{longitude}/{animalName}")
    public List<Coordinates> findNearbyHabitat (@PathVariable("latitude") String latitude, @PathVariable("longitude") String longitude, @PathVariable("animalName") String animalName) {
        if (latitude == null | longitude == null |animalName == null) {
            return null;
        }
        List<Coordinates> animalList = animalHabitatService.findNearbyHabitat(latitude,longitude,animalName);
        return animalList;
    }
}
