package Memento;

public class Originator {
	private String state;
	
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Memento createMemento() {
		return new Memento(this);
	}
	
	public void restoreMemento(Memento m) {
		state = m.getState();
	}
	
	
}

class Memento{
	private String state;
	
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Memento(Originator o) {
		state = o.getState();
	}
	
	
}

class Caretaker{
	private Memento memento;

	public Memento getMemento() {
		return memento;
	}

	public void setMemento(Memento memento) {
		this.memento = memento;
	}
	
	
}