package BehavioralPatterns.Observer;

public class Driver {

    public static void main(String[] args) {

        LogSubject ls = new LogSubject();

        IObserver observer1 = new Observer1();
        IObserver observer2 = new Observer2();
        IObserver observer3 = new Observer3();

        ls.addObserver(observer1);
        ls.addObserver(observer2);
        ls.addObserver(observer3);

        ls.setState("State 1");
        ls.setState("State 2");

        ls.removeObserver(observer2);

        ls.setState("State 3");
    }
}
