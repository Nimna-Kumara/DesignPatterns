package CreationalPatterns.AbstractFactory;

/**
 * Abstract Factory: ToyFactory (interface with methods to create
 * a car, doll, and puzzle).
 * **/


public interface ToyFactory {

    ToyCar createCar();
    ToyDoll createDoll();
    ToyPuzzle createPuzzle();


}
