package CreationalPatterns.Prototype;

public class Driver {
    public static void main(String[] args) {

        AnimalCreator ac = new AnimalCreator();

        Animal[] farm = new Animal[8];

        farm[0] = ac.retrieveAnimal("Chicken");
        farm[1] = ac.retrieveAnimal("Chicken");
        farm[2] = ac.retrieveAnimal("Chicken");
        farm[3] = ac.retrieveAnimal("Chicken");

        farm[4] = ac.retrieveAnimal("Sheep");
        farm[5] = ac.retrieveAnimal("Sheep");
        farm[6] = ac.retrieveAnimal("Sheep");
        farm[7] = ac.retrieveAnimal("Sheep");

        for (int i=0; i<=7; i++){
            System.out.println(farm[i].helloAnimal());
        }
    }
}