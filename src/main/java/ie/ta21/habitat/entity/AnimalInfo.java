package ie.ta21.habitat.entity;

public class AnimalInfo {
    public String brief_description;
    public String description;
    public String habitat_info;
    public String habitat_types;
    public String diet;
    public String biology;
    public String distribution;
    public String native_status;
    public String commercial_species;
    public String colours;

    public AnimalInfo() {

    }

    public AnimalInfo(String brief_description, String description, String habitat_info, String habitat_types,
                      String diet, String biology, String distribution, String native_status, String commercial_species, String colours){

    }


    public String getBrief_description() {
        return brief_description;
    }

    public void setBrief_description(String brief_description) {
        this.brief_description = brief_description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHabitat_info() {
        return habitat_info;
    }

    public void setHabitat_info(String habitat_info) {
        this.habitat_info = habitat_info;
    }

    public String getHabitat_types() {
        return habitat_types;
    }

    public void setHabitat_types(String habitat_types) {
        this.habitat_types = habitat_types;
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public String getBiology() {
        return biology;
    }

    public void setBiology(String biology) {
        this.biology = biology;
    }

    public String getDistribution() {
        return distribution;
    }

    public void setDistribution(String distribution) {
        this.distribution = distribution;
    }

    public String getNative_status() {
        return native_status;
    }

    public void setNative_status(String native_status) {
        this.native_status = native_status;
    }

    public String getCommercial_species() {
        return commercial_species;
    }

    public void setCommercial_species(String commercial_species) {
        this.commercial_species = commercial_species;
    }

    public String getColours() {
        return colours;
    }

    public void setColours(String colours) {
        this.colours = colours;
    }


}
