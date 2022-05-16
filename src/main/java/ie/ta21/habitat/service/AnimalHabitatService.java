package ie.ta21.habitat.service;

import ie.ta21.habitat.entity.*;

import java.util.List;

public interface AnimalHabitatService {
    List<AnimalDetail> getAnimalNames();

    List<Coordinates> findCoordinatesByName(String name);

    List<FindAnimalListByCoordinatesVO> findAnimalByCoordinates(String latitude, String longitude);

    List<Coordinates> findNearbyHabitat(String latitude, String longitude, String animalName);


    AnimalDetail getAnimalInfo(String name);
}
