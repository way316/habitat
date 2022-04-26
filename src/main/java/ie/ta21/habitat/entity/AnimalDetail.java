package ie.ta21.habitat.entity;

public class AnimalDetail {
    private Integer id;

    private String vernacularName;

    private String briefDescription;

    private String description;

    private String biology;

    private String habitat;

    private String nativeStatus;

    private String diet;

    private String colours;

    private String distribution;

    private String habitatTypes;

    private String commercialSpecies;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVernacularName() {
        return vernacularName;
    }

    public void setVernacularName(String vernacularName) {
        this.vernacularName = vernacularName == null ? null : vernacularName.trim();
    }

    public String getBriefDescription() {
        return briefDescription;
    }

    public void setBriefDescription(String briefDescription) {
        this.briefDescription = briefDescription == null ? null : briefDescription.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getBiology() {
        return biology;
    }

    public void setBiology(String biology) {
        this.biology = biology == null ? null : biology.trim();
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat == null ? null : habitat.trim();
    }

    public String getNativeStatus() {
        return nativeStatus;
    }

    public void setNativeStatus(String nativeStatus) {
        this.nativeStatus = nativeStatus == null ? null : nativeStatus.trim();
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet == null ? null : diet.trim();
    }

    public String getColours() {
        return colours;
    }

    public void setColours(String colours) {
        this.colours = colours == null ? null : colours.trim();
    }

    public String getDistribution() {
        return distribution;
    }

    public void setDistribution(String distribution) {
        this.distribution = distribution == null ? null : distribution.trim();
    }

    public String getHabitatTypes() {
        return habitatTypes;
    }

    public void setHabitatTypes(String habitatTypes) {
        this.habitatTypes = habitatTypes == null ? null : habitatTypes.trim();
    }

    public String getCommercialSpecies() {
        return commercialSpecies;
    }

    public void setCommercialSpecies(String commercialSpecies) {
        this.commercialSpecies = commercialSpecies == null ? null : commercialSpecies.trim();
    }
}