package ie.ta21.habitat.dao;
import ie.ta21.habitat.entity.AnimalDetail;
import ie.ta21.habitat.entity.AnimalDetailExample;
import ie.ta21.habitat.mapper.AnimalDetailMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AnimalInfoDAO {
    @Autowired
    AnimalDetailMapper animalDetailMapper;

    public AnimalDetail getAnimalInformation(String name) {
        AnimalDetailExample animalDetailExample = new AnimalDetailExample();
        AnimalDetailExample.Criteria criteria = animalDetailExample.createCriteria();
        criteria.andVernacularNameEqualTo(name);
        AnimalDetail animalDetail = animalDetailMapper.selectByExample(animalDetailExample).get(0);
        return animalDetail;
    }

    public List<String> getEndangerAnimalNames() {
        AnimalDetailExample animalDetailExample = new AnimalDetailExample();
        AnimalDetailExample.Criteria criteria = animalDetailExample.createCriteria();
        criteria.andEnDangerEqualTo("yes");
        List<AnimalDetail> endangerAnimals = animalDetailMapper.selectByExample(animalDetailExample);
        List<String> endangerAnimalNames = new ArrayList<String>();
        for (AnimalDetail endangerAnimal : endangerAnimals) {
            String animalVernacularName = endangerAnimal.getVernacularName();
            endangerAnimalNames.add(animalVernacularName);
        }
        return endangerAnimalNames;
    }
}
