package CreationalPatterns.AbstractFactory;

public class PlasticDoll implements ToyDoll{

    @Override
    public String getMaterial() {
        return "Plastic";
    }
}
