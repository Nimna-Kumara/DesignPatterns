package CreationalPatterns.AbstractFactory;

public class PlasticToyFactory implements ToyFactory {


    @Override
    public ToyCar createCar() {
        return new PlasticCar();
    }

    @Override
    public ToyDoll createDoll() {
        return new PlasticDoll();
    }

    @Override
    public ToyPuzzle createPuzzle() {
        return new PlasticPuzzle();
    }
}
