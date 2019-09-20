package Proxy;

abstract class Subject{
	public abstract void request();
}

class RealSubject extends Subject{
	public void request() {
		System.out.println("real request");
	}
}
public class Proxy extends Subject{
	private RealSubject rs = new RealSubject();
	private void preRequest() {
		System.out.println("preR");
	}
	public void request() {
		preRequest();
		rs.request();
		posRequest();
	}
	private void posRequest() {
		System.out.println("posR");
	}
}
