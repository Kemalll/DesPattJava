public interface Observable {

    void attach(Observer observer);
	void remove(Observer observer);
	
	String getUpdate();
    void notifyObservers();

    
}
