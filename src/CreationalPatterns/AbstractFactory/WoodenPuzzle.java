package CreationalPatterns.AbstractFactory;

public class WoodenPuzzle implements ToyPuzzle {

    @Override
    public String getMaterial() {
        return "Wooden";
    }
}
