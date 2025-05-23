package CreationalPatterns.AbstractFactory;

public class WoodenDoll implements ToyDoll {

    @Override
    public String getMaterial() {
        return "Wooden";
    }
}
