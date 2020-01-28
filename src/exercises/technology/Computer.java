package exercises.technology;

public class Computer extends AbstractEntity{
    private final String brand;
    private String operatingSystem;
    private String weight;
    private final int verticalRes;
    private final int horizontalRes;

    public Computer(String brand, String operatingSystem, String weight,  int horizontalRes, int verticalRes) {
        this.brand = brand;
        this.operatingSystem = operatingSystem;
        this.weight = weight;
        this.verticalRes = verticalRes;
        this.horizontalRes = horizontalRes;
    }

    public String getBrand() {
        return brand;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    private void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getWeight() {
        return weight;
    }

    private void setWeight(String weight) {
        this.weight = weight;
    }

    public int getVerticalRes() {
        return verticalRes;
    }

    public int getHorizontalRes() {
        return horizontalRes;
    }

    public String returnResolution(){
        return horizontalRes + "x" + verticalRes;
    }

    public boolean isOsUpdated(String mostRecentOS){
        return this.operatingSystem.equals(mostRecentOS);
    }

    @Override
    public String toString() {
        return super.toString() + "brand='" + brand + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", weight='" + weight + '\'' +
                ", verticalRes=" + verticalRes +
                ", horizontalRes=" + horizontalRes+", ";
    }
}
