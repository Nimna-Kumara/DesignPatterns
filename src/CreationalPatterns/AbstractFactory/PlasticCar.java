package CreationalPatterns.AbstractFactory;

public class PlasticCar implements ToyCar {

    @Override
    public String getMaterial() {
        return "Plastic";
    }
}
