package ie.ta21.habitat.dao;

import ie.ta21.habitat.entity.*;
import ie.ta21.habitat.mapper.AnimalDetailMapper;
import ie.ta21.habitat.mapper.CleanDataMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AnimalHabitatDAO {
    @Autowired
    CleanDataMapper cleanDataMapper;


    public List<TopFiveVO> getTopAnimals() {
        return cleanDataMapper.selectTop20();
    }

    public List<AnimalName> getVernacularName() { return cleanDataMapper.selectAnimalName();}

    public List<Coordinates> getCoordinatesByName(String name) {
        return cleanDataMapper.getCoordinatesByName(name);
    }

    public List<String> getAnimalByCoordinates(String latitude, String longitude) {
        return cleanDataMapper.getAnimalByCoordinates(latitude,longitude);
    }

    public List<Coordinates> findNearbyHabitat(String latitude, String longitude, String animalName) {
        return cleanDataMapper.getNearbyHabitat(latitude,longitude,animalName);
    }
}
