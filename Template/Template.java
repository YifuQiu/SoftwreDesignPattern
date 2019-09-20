package Template;

public abstract class Template {
	public void templateMethod() {
		primitiveMethod1();
		primitiveMethod2();
		if(!hookMethod()) {
			primitiveMethod3();
		}
	}
	
	
	public abstract void primitiveMethod1();
	
	public void primitiveMethod2() {
		//las clases hijas pueden sobrescribir o no este metodo
	}
	
	public abstract void primitiveMethod3();
	
	public boolean hookMethod() { //se sobrescribira si sera necesario
		return false;
	}
}
