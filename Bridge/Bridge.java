package Bridge;

public abstract class Bridge {

	
	protected Implementor impl;
	
	public void setImplementor(Implementor imp) {
		this.impl = imp;
	}
	
	public abstract void operation();
}

