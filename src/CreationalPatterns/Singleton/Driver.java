package CreationalPatterns.Singleton;

public class Driver {
    public static void main(String[] args) {

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        s1.doSomething();
        s2.doSomething();

    }
}