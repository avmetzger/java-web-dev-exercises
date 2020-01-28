package exercises.technology;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class SmartPhone extends Computer{
    private String[] supportedNetworks;
    public SmartPhone(String brand, String operatingSystem, String weight, int horizontalRes, int verticalRes, String[] supportedNetworks) {
        super(brand, operatingSystem, weight, horizontalRes, verticalRes);
        this.supportedNetworks = supportedNetworks;
    }

    public String[] getSupportedNetworks() {
        return supportedNetworks;
    }

    private void setSupportedNetworks(String[] supportedNetworks) {
        this.supportedNetworks = supportedNetworks;
    }

    public void addSupportedNetworks(String newNetwork) {
        List<String> addNetworkList = new ArrayList<>(Arrays.asList(this.supportedNetworks));
        addNetworkList.add(newNetwork);
        setSupportedNetworks((String[]) addNetworkList.toArray());
    }

    public void removeSupportedNetworks(String oldNetwork) {
        List<String> removeNetworkList = new ArrayList<>(Arrays.asList(this.supportedNetworks));
        removeNetworkList.remove(oldNetwork);
        setSupportedNetworks((String[]) removeNetworkList.toArray());
    }

    @Override
    public String toString() {
        return "SmartPhone{" + super.toString() +
                "supportedNetworks=" + Arrays.toString(supportedNetworks) +
                '}';
    }
}
