package BehavioralPatterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class LogSubject {

    private List<IObserver> list = new ArrayList<IObserver>();

    private String state;


    public void addObserver(IObserver observer){
        list.add(observer);
    }

    public void removeObserver(IObserver observer){
        list.remove(observer);
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        this.updateState();
    }

    private void updateState(){
        for (IObserver observer: list){
            observer.update(this.getState());
        }
    }
}
