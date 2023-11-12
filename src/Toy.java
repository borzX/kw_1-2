public class Toy {
    Integer toyID;
    String toyName;
    Integer toyWeight;

    public Toy(Integer toyID, String toyName, Integer toyWeight) {
        this.toyID = toyID;
        this.toyName = toyName;
        this.toyWeight = toyWeight;
    }

    public Integer getToyID() {
        return toyID;
    }

    public void setToyID(Integer toyID) {
        this.toyID = toyID;
    }

    public String getToyName() {
        return toyName;
    }

    public void setToyName(String toyName) {
        this.toyName = toyName;
    }

    public Integer getToyWeight() {
        return toyWeight;
    }

    public void setToyWeight(Integer toyWeight) {
        this.toyWeight = toyWeight;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "toyID=" + toyID +
                ", toyName='" + toyName + '\'' +
                ", toyWeight=" + toyWeight +
                '}';
    }
}

