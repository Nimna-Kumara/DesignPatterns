package CreationalPatterns.Prototype;

public class Chicken extends Animal{

    private int noOfClones = 0;

    @Override
    public String helloAnimal() {

        StringBuffer chickenTalk = new StringBuffer();

        chickenTalk.append("Cluck cluck World. I am ");
        chickenTalk.append(name);
        chickenTalk.append(". I have ");
        chickenTalk.append(noOfLegs);
        chickenTalk.append(" legs.");
        return chickenTalk.toString();
    }

    public Chicken clone(){
        Chicken clonedChicken = (Chicken) super.clone();
        String chickenName = clonedChicken.getName();
        noOfClones++;
        clonedChicken.setName(chickenName + noOfClones);
        return clonedChicken;
    }
}
