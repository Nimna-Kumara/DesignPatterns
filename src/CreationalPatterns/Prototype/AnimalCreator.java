package CreationalPatterns.Prototype;

public class AnimalCreator {

    private Animal sheep = new Sheep();
    private Animal chicken = new Chicken();

    public AnimalCreator(){
        sheep.setName("Sheep");
        sheep.setNoOfLegs(4);
        sheep.setDescription("Four legged creature that makes wool.");

        chicken.setName("Chicken");
        chicken.setNoOfLegs(2);
        chicken.setDescription("Two legged creature that crosses roads.");

    }

    public Animal retrieveAnimal(String kindOfAnimal){

        if ("Chicken".equals(kindOfAnimal)){
            return (Animal) chicken.clone();
        }
        else if ("Sheep".equals(kindOfAnimal)) {
            return (Animal) sheep.clone();
        }
        return null;
    }
}
