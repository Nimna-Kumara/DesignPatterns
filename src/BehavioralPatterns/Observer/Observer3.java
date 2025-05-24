package BehavioralPatterns.Observer;

public class Observer3 implements IObserver{

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public void update(String state) {
        this.setState(state);
        System.out.println("New State : " + this.state);
    }
}
