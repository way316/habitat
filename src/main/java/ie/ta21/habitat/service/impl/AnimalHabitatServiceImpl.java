package ie.ta21.habitat.service.impl;

import ie.ta21.habitat.dao.AnimalHabitatDAO;
import ie.ta21.habitat.dao.AnimalInfoDAO;
import ie.ta21.habitat.entity.*;
import ie.ta21.habitat.service.AnimalHabitatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Service
public class AnimalHabitatServiceImpl implements AnimalHabitatService {
    @Autowired
    AnimalHabitatDAO animalHabitatDAO;
    @Autowired
    AnimalInfoDAO animalInfoDAO;

    @Override
    public List<AnimalDetail> getAnimalNames() {
        return animalHabitatDAO.getNameList();
    }

    @Override
    public AnimalDetail getAnimalInfo(String name) {
        return animalInfoDAO.getAnimalInformation(name);
    }

    @Override
    public List<Coordinates> findCoordinatesByName(String name) {
        return animalHabitatDAO.getCoordinatesByName(name);
    }

    @Override
    public List<FindAnimalListByCoordinatesVO> findAnimalByCoordinates(String latitude, String longitude) {
        List<String> animalNameList = animalHabitatDAO.getAnimalByCoordinates(latitude, longitude);
        ArrayList<FindAnimalListByCoordinatesVO> animalListByCoordinatesVOS = new ArrayList<>();
        for (String animalName : animalNameList) {
            String animalDescription = animalInfoDAO.getAnimalInformation(animalName).getBriefDescription();
            FindAnimalListByCoordinatesVO findAnimalListByCoordinatesVO = new FindAnimalListByCoordinatesVO(animalName, animalDescription);
            animalListByCoordinatesVOS.add(findAnimalListByCoordinatesVO);
        }
        return animalListByCoordinatesVOS;
    }

    @Override
    public List<Coordinates> findNearbyHabitat(String latitude, String longitude, String animalName) {
        return animalHabitatDAO.findNearbyHabitat(latitude, longitude, animalName);
    }
}
