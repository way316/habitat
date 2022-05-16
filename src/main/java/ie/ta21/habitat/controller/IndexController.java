package ie.ta21.habitat.controller;

import com.sun.org.apache.bcel.internal.generic.RETURN;
import ie.ta21.habitat.entity.*;
import ie.ta21.habitat.service.AnimalHabitatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class IndexController {
    @Autowired
    AnimalHabitatService animalHabitatService;

    @RequestMapping("/index")
    public String index(Model model) {
        return "index";
    }

    @RequestMapping("/quiz")
    public String quiz(Model model) {
        return "quiz";
    }

    @RequestMapping("/about")
    public String foundHabitat(Model model) {
        return "education";
    }

    @RequestMapping("/findAnimal")
    public String foundAnimal(Model model) {
        return "AnimalDistribution";
    }


    @RequestMapping("/findAnimalInfo/{animalName}")
    public String findInfoByName(@PathVariable("animalName") String animalName, Model model) {
        AnimalDetail animalInfo = animalHabitatService.getAnimalInfo(animalName);
        model.addAttribute("animalInfo", animalInfo);
        return "animalDetail";
    }

    @RequestMapping("/findAnimalDistribution")
    public String findAnimalDistribution(Model model) {
        List<AnimalDetail> animalDetailListList = animalHabitatService.getAnimalNames();
        model.addAttribute("commonAnimals", animalDetailListList);
        return "animalHabitat";
    }

    @RequestMapping("/findNearbyHabitat/{latitude}/{longitude}/{animalName}")
    public String findNearbyHabitat(Model model, @PathVariable("latitude") String latitude, @PathVariable("longitude") String longitude, @PathVariable("animalName") String animalName) {
        List<Coordinates> positionList = animalHabitatService.findNearbyHabitat(latitude, longitude, animalName);
        model.addAttribute("animalName", animalName);
        model.addAttribute("positionList", positionList);
        model.addAttribute("longitude", longitude);
        model.addAttribute("latitude", latitude);
        return "mapPage";
    }

    @RequestMapping("/education")
    public String education(Model model) {
        return "education";
    }

    @RequestMapping("/endanger")
    public String endangerAnimals(Model model) {
        List<String> endangerAnimals = animalHabitatService.getEndangerAnimalNames();
        model.addAttribute("endangerAnimals", endangerAnimals);
        return "endangerAnimals";
    }
}
