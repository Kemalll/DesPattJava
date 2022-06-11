import java.util.ArrayList;
import java.util.List;

public class MagicBord implements Observable{

    private List<Observer> observers=new ArrayList<Observer>();
    private String toy;


    
    public void attach(Observer observer){
        observers.add(observer);
    }

    public void remove(Observer observer){
        observers.remove(observer);
    }


    @Override
    public void notifyObservers() {
        for(Observer observer: observers){
        observer.update();
        }
    }

    @Override
    public String getUpdate() {    
        return this.toy;
    }

    // public void setThisToy(String toy){
    //     this.toy=toy;
    //     this.notifyObservers();
    // }
}
