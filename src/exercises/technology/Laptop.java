package exercises.technology;

public class Laptop extends Computer {
    private boolean integratedGraphics;
    private boolean touchScreen;

    public Laptop(String brand, String operatingSystem, String weight, int horizontalRes, int verticalRes, boolean integratedGraphics, boolean touchScreen) {
        super(brand, operatingSystem, weight, horizontalRes, verticalRes);
        this.integratedGraphics = integratedGraphics;
        this.touchScreen = touchScreen;
    }

    public boolean isIntegratedGraphics() {
        return integratedGraphics;
    }

    private void setIntegratedGraphics(boolean integratedGraphics) {
        this.integratedGraphics = integratedGraphics;
    }

    public boolean isTouchScreen() {
        return touchScreen;
    }

    private void setTouchScreen(boolean touchScreen) {
        this.touchScreen = touchScreen;
    }

    public boolean isRecommendedForDigitalArt() {
        if (getHorizontalRes() >= 1920 && isTouchScreen() && !isIntegratedGraphics()){
            return true;
        } else {
            return false;
        }
    }
}
