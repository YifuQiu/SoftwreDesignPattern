package State;

public class Context {

	private int value = 0;
	private State state;
	
	public Context() {
		value = 0;
		state = new State1();
	}
	
	public void setState(State s) {
		state = s;
	}
	public int getValue() {
		return value;
	}
	public void changeState() {
		if(value == 0) {
			state = new State1();
		}else if (value > 0) {
			state = new State2();
		}
	}
	public void augmentValue(int n) {
		value += n;
		changeState();
	}
	public void checkState() {
		state.handle();
	}
}

abstract class State{
	public abstract void handle();
}


class State1 extends State{

	@Override
	public void handle() {
		System.out.println("state1");
	}
}
class State2 extends State{

	@Override
	public void handle() {
		System.out.println("state2");
	}
}