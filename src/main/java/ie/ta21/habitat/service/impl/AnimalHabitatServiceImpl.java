package ie.ta21.habitat.service.impl;

import ie.ta21.habitat.dao.AnimalHabitatDAO;
import ie.ta21.habitat.dao.AnimalInfoDAO;
import ie.ta21.habitat.entity.*;
import ie.ta21.habitat.service.AnimalHabitatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalHabitatServiceImpl implements AnimalHabitatService {
    @Autowired
    AnimalHabitatDAO animalHabitatDAO;
    AnimalInfoDAO animalInfoDAO;

    @Override
    public List<TopFiveVO> getCommonAnimals() {
        return animalHabitatDAO.getTopAnimals();
    }

    @Override
    public List<AnimalName> getAnimalName() { return animalHabitatDAO.getVernacularName();}

    @Override
    public List<AnimalInfo> getAnimalInfo(String name) { return animalInfoDAO.getAnimalInformation(name);}

    @Override
    public List<Coordinates> findCoordinatesByName(String name) {
        return animalHabitatDAO.getCoordinatesByName(name);
    }

    @Override
    public List<String> findAnimalByCoordinates(String latitude, String longitude) {
        return animalHabitatDAO.getAnimalByCoordinates(latitude,longitude);
    }

    @Override
    public List<Coordinates> findNearbyHabitat(String latitude, String longitude, String animalName) {
        return animalHabitatDAO.findNearbyHabitat(latitude,longitude,animalName);
    }
}
