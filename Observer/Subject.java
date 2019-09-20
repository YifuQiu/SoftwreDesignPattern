package Observer;

import java.util.ArrayList;

//observer, Subscriptor...


public abstract class Subject {

	protected ArrayList<Observer> observers = new ArrayList<>();
	
	public void attach(Observer o) {
		observers.add(o);
	}
	
	public void detach(Observer o) {
		observers.remove(o);
	}
	public abstract void notifyObservers();
}

class ConcreteSubject extends Subject{

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for(Object o:observers) {
			((Observer)o).update();
		}
	}
	
}


interface Observer{
	public void update();
}


class ConcreteObserver implements Observer{
	public void update() {
		//.........code
	}
}
