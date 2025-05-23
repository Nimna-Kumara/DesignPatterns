package CreationalPatterns.AbstractFactory;

public class WoodenCar implements ToyCar{

    @Override
    public String getMaterial() {
        return "Wooden";
    }
}
