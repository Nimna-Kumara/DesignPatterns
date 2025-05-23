package CreationalPatterns.AbstractFactory;

public class PlasticPuzzle implements ToyPuzzle {

    @Override
    public String getMaterial() {
        return "Plastic";
    }
}
