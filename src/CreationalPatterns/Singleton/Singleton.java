package CreationalPatterns.Singleton;

public class Singleton {

    private static Singleton instance;

    private Singleton(){
        System.out.println("Singleton instance created.");
    }

    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        else {
            System.out.println("Using existing Singleton instance.");
        }
        return instance;
    }

    public void doSomething(){
        System.out.println("Singleton instance is doing something.");
    }
}
