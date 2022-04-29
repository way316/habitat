package ie.ta21.habitat.controller;

import ie.ta21.habitat.entity.*;
import ie.ta21.habitat.service.AnimalHabitatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Controller
public class IndexController {
    @Autowired
    AnimalHabitatService animalHabitatService;

    @RequestMapping("/index")
    public String index(Model model) {
        return "index";
    }

    @RequestMapping("/about")
    public String foundHabitat(Model model) {
        return "Rescue";
    }

    @RequestMapping("/findAnimal")
    public String foundAnimal(Model model) {
        return "AnimalDistribution";
    }

    @RequestMapping("/findInfoByName/{animalName}")
    public String findInfoByName (@PathVariable("animalName") String animalName, Model model) {
        AnimalDetail animalInfo = animalHabitatService.getAnimalInfo(animalName);
        model.addAttribute("animalInfo",animalInfo);
        return "info";
    }


    @RequestMapping("/findAnimalDistribution")
    public String findAnimalDistribution(Model model) {
        List<String> commonAnimals = animalHabitatService.getAnimalNames();
        model.addAttribute("topTwentyAnimals", commonAnimals);
        return "animalHabitat";
    }

    @RequestMapping("/findNearbyHabitat/{latitude}/{longitude}/{animalName}")
    public String findNearbyHabitat(Model model, @PathVariable("latitude") String latitude, @PathVariable("longitude") String longitude, @PathVariable("animalName") String animalName) {
        List<Coordinates> positionList = animalHabitatService.findNearbyHabitat(latitude,longitude,animalName);
        model.addAttribute("animalName", animalName);
        model.addAttribute("positionList",positionList);
        return "mapPage";
    }
}
