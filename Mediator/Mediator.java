package Mediator;

import java.util.ArrayList;

public abstract class Mediator {

	protected ArrayList<Colleague> colleagues = new ArrayList<>();
	
	public void register(Colleague colleague) {
		colleagues.add(colleague);
	}
	
	public abstract void operation(Colleague c);  // if c == get(i), ...
	
}

abstract class Colleague{
	protected Mediator mediator;
	
	public Colleague(Mediator m) {
		mediator = m;
	}
	
	
	
	public abstract void method1();
	
	public void method2() {
		mediator.operation(this);
	}
}
