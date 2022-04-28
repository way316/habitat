package ie.ta21.habitat.dao;
import ie.ta21.habitat.entity.AnimalInfo;
import ie.ta21.habitat.mapper.AnimalDetailMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AnimalInfoDAO {
    @Autowired
    AnimalDetailMapper animalDetailMapper;

    public List<AnimalInfo> getAnimalInformation(String name) {
        return animalDetailMapper.getInfoByName(name);
    }
}
