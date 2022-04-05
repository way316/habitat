package ie.ta21.habitat.entity;

public class Coordinates {
    public String decimallatitude;
    public String decimalLongitude;

    public Coordinates() {
    }

    public Coordinates(String decimallatitude, String decimalLongitude) {
        this.decimallatitude = decimallatitude;
        this.decimalLongitude = decimalLongitude;
    }

    public String getDecimallatitude() {
        return decimallatitude;
    }

    public void setDecimallatitude(String decimallatitude) {
        this.decimallatitude = decimallatitude;
    }

    public String getDecimalLongitude() {
        return decimalLongitude;
    }

    public void setDecimalLongitude(String decimalLongitude) {
        this.decimalLongitude = decimalLongitude;
    }
}
