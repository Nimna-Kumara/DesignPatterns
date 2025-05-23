package CreationalPatterns.AbstractFactory;

public class WoodenToyFactory implements ToyFactory{

    @Override
    public ToyCar createCar() {
        return new WoodenCar();
    }

    @Override
    public ToyDoll createDoll() {
        return new WoodenDoll();
    }

    @Override
    public ToyPuzzle createPuzzle() {
        return new WoodenPuzzle();
    }
}
