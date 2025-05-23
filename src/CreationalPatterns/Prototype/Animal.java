package CreationalPatterns.Prototype;

public abstract class Animal implements Cloneable{

    protected int noOfLegs =0;
    protected String description = "";
    protected String name = "";

    public abstract String helloAnimal();

    public Animal clone(){
        Animal clonedAnimal = null;

        try {
            clonedAnimal = (Animal) super.clone();
            clonedAnimal.setDescription(description);
            clonedAnimal.setNoOfLegs(noOfLegs);
            clonedAnimal.setName(name);

        }
        catch (CloneNotSupportedException e){
            e.printStackTrace();
        }

        return clonedAnimal;
    }


    public int getNoOfLegs() {
        return noOfLegs;
    }

    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
