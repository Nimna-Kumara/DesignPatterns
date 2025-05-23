package CreationalPatterns.Prototype;

public class Sheep extends Animal {

    private int noOfClones = 0;

    @Override
    public String helloAnimal() {

        StringBuffer sheepTalk = new StringBuffer();

        sheepTalk.append("Meeee World. I am ");
        sheepTalk.append(name);
        sheepTalk.append(". I have");
        sheepTalk.append(noOfLegs);
        sheepTalk.append(" legs.");
        return sheepTalk.toString();
    }

    public Sheep clone(){
        Sheep clonedSheep = (Sheep) super.clone();
        String sheepName = clonedSheep.getName();
        noOfClones++;
        clonedSheep.setName(sheepName + noOfClones);
        return clonedSheep;
    }
}
