package CreationalPatterns.AbstractFactory;

public class Driver {
    public static void main(String[] args) {


        ToyFactory factory = new PlasticToyFactory();
        ToyCar plasticCar = factory.createCar();
        ToyDoll plasticDoll = factory.createDoll();
        ToyPuzzle plasticPuzzle = factory.createPuzzle();

        System.out.println("Toy Car Material: " + plasticCar.getMaterial());
        System.out.println("Toy Doll Material: " + plasticDoll.getMaterial());
        System.out.println("Toy Puzzle Material: " + plasticPuzzle.getMaterial());
        System.out.println("Hello, World!");
    }
}