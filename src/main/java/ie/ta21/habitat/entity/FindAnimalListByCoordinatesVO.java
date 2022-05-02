package ie.ta21.habitat.entity;

public class FindAnimalListByCoordinatesVO {
    public String animalName;
    public String animalDescription;

    public FindAnimalListByCoordinatesVO(String animalName, String animalDescription) {
        this.animalName = animalName;
        this.animalDescription = animalDescription;
    }

    public FindAnimalListByCoordinatesVO() {
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimalDescription() {
        return animalDescription;
    }

    public void setAnimalDescription(String animalDescription) {
        this.animalDescription = animalDescription;
    }
}
