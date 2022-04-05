package ie.ta21.habitat.entity;

public class TopFiveVO {
    String vernacularname;
    Integer count;

    public TopFiveVO() {
    }

    public TopFiveVO(String vernacularname, Integer count) {
        this.vernacularname = vernacularname;
        this.count = count;
    }

    public String getVernacularname() {
        return vernacularname;
    }

    public void setVernacularname(String vernacularname) {
        this.vernacularname = vernacularname;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
