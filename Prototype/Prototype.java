package Prototype;

public abstract class Prototype {
	
	private int num = 0;
	
	public void setNum(int n) {
		num = n;
	}
	public int getNum() {
		return num;
	}
	public abstract Prototype Clone();
	
	
}
