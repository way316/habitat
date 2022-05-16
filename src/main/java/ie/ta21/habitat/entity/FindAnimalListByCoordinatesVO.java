package ie.ta21.habitat.entity;

public class FindAnimalListByCoordinatesVO {
    public String animalName;
    public String animalDescription;
    public String enDanger;

    public FindAnimalListByCoordinatesVO(String animalName, String animalDescription, String enDanger) {
        this.animalName = animalName;
        this.animalDescription = animalDescription;
        this.enDanger = enDanger;
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

    public String getEnDanger() {
        return enDanger;
    }

    public void setEnDanger(String enDanger) {
        this.enDanger = enDanger;
    }

}
