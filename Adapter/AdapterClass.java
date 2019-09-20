package Adapter;

//adapter for class
public class AdapterClass extends Adaptee2 implements Target2{
	public void print() {
		specificPrint();
	}
}

class Adaptee2{
	public void specificPrint() {
		System.out.println("adaptee print");
	}
}

interface Target2{
	public void print();
}
