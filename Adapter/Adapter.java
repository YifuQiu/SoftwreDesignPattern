package Adapter;


//adapter for object
public class Adapter implements Target{

	private Adaptee adaptee;
	
	public Adapter(Adaptee a) {
		adaptee = a;
	}
	
	@Override
	public void print() {
		adaptee.specificPrint();
	}

}
class Adaptee{
	public void specificPrint() {
		System.out.println("adaptee print");
	}
}

interface Target{
	public void print();
}