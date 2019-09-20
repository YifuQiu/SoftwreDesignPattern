package Decorator;

public class Decorator extends Component{
	
	private Component comp;
	
	public Decorator(Component c) {
		comp = c;
	}
	
	public void operation() {
		comp.compOperation();
	}
}
class Component{
	public void compOperation() {
		
	}
}

class ConcereteDecorator extends Decorator{

	public ConcereteDecorator(Component c) {
		super(c);
		// TODO Auto-generated constructor stub
	}
	public void operation() {
		super.operation();
		addBehaviour();
	}
	private void addBehaviour() {
		
	}
}

