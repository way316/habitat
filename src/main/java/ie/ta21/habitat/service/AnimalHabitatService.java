package ie.ta21.habitat.service;

import ie.ta21.habitat.entity.CleanData;
import ie.ta21.habitat.entity.Coordinates;
import ie.ta21.habitat.entity.TopFiveVO;

import java.util.List;

public interface AnimalHabitatService {
    List<TopFiveVO> getCommonAnimals();

    List<Coordinates> findCoordinatesByName(String name);

    List<String> findAnimalByCoordinates(String latitude, String longitude);

    List<Coordinates> findNearbyHabitat(String latitude, String longitude,String animalName);
}
