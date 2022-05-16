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

    public List<AnimalDetail> getNameList() {
        return cleanDataMapper.selectNames();
    }

    public List<Coordinates> getCoordinatesByName(String name) {
        return cleanDataMapper.getCoordinatesByName(name);
    }

    public List<String> getAnimalByCoordinates(String latitude, String longitude) {
        return cleanDataMapper.getAnimalByCoordinates(latitude, longitude);
    }

    public List<Coordinates> findNearbyHabitat(String latitude, String longitude, String animalName) {
        return cleanDataMapper.getNearbyHabitat(latitude, longitude, animalName);
    }

    public int countAnimalsByYear(String animalName, int year) {
        CleanDataExample cleanDataExample = new CleanDataExample();
        CleanDataExample.Criteria criteria = cleanDataExample.createCriteria();
        criteria.andYearEqualTo(String.valueOf(year));
        criteria.andVernacularnameEqualTo(animalName);
        return cleanDataMapper.countByExample(cleanDataExample);
    }
}
