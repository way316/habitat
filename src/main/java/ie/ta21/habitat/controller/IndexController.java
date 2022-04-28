package ie.ta21.habitat.controller;

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

    @RequestMapping("/about")
    public String foundHabitat(Model model) {
        return "Rescue";
    }

    @RequestMapping("/findAnimal")
    public String foundAnimal(Model model) {
        List<TopFiveVO> commonAnimals = animalHabitatService.getCommonAnimals();
        model.addAttribute("topTwentyAnimals", commonAnimals);
//        System.out.println("--------------@@@@@@@@@@@@@@@@@" + commonAnimals.get(0).getVernacularname());
//        System.out.println("--------------@@@@@@@@@@@@@@@@@" + commonAnimals.get(8).getVernacularname());
        return "AnimalDistribution";
    }

    @RequestMapping("/findAnimalName")
    public String foundAnimalName(Model model){
        List<AnimalName> animalNameList = animalHabitatService.getAnimalName();
        model.addAttribute("animalNameList", animalNameList);
//        System.out.println("--------------------------------------------------------------");
//        System.out.println("first animalName is : " + animalNameList.get(0).getVernacularname());
//        System.out.println("second animalName is : " + animalNameList.get(1).getVernacularname());
//        System.out.println("third animalName is : " + animalNameList.get(2).getVernacularname());
//        System.out.println("fourth animalName is : " + animalNameList.get(3).getVernacularname());
//        System.out.println("fifth animalName is : " + animalNameList.get(4).getVernacularname());
//        System.out.println("sixth animalName is : " + animalNameList.get(5).getVernacularname());
//        System.out.println("seventh animalName is : " + animalNameList.get(6).getVernacularname());
//        System.out.println("eighth animalName is : " + animalNameList.get(7).getVernacularname());
//        System.out.println("ninth animalName is : " + animalNameList.get(8).getVernacularname());
//        System.out.println("The tenth animalName is : " + animalNameList.get(9).getVernacularname());
//        System.out.println("--------------------------------------------------------------");
        return "index";
    }

    @RequestMapping("/findAnimalDetail/{animalName}")
    public String findAnimalDetail(Model model, @PathVariable("animalName") String animalName){
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
        List<AnimalInfo> animalInfo = animalHabitatService.getAnimalInfo(animalName);
        model.addAttribute("animalDetail", animalInfo);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("detail of Goat : " + animalInfo.get(0));
        return "index";
    }

    @RequestMapping("/findAnimalDistribution")
    public String findAnimalDistribution() {
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
