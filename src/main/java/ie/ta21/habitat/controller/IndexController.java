package ie.ta21.habitat.controller;

import ie.ta21.habitat.entity.TopFiveVO;
import ie.ta21.habitat.service.AnimalHabitatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class IndexController {
    @Autowired
    AnimalHabitatService animalHabitatService;

    @RequestMapping("/index")
    public String index(Model model) {
        return "mapPage";
    }

    @RequestMapping("/foundHabitat")
    public String foundHabitat(Model model) {
        return "anmialHabitat";
    }

    @RequestMapping("/foundAnimal")
    public String foundAnimal(Model model) {
        List<TopFiveVO> commonAnimals =animalHabitatService.getCommonAnimals();
        model.addAttribute("topTwentyAnimals", commonAnimals);
        return "animalDistribution";
    }

    @RequestMapping("home")
    public String homePage() {
        return "index";
    }
}
