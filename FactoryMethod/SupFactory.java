package FactoryMethod;

public abstract class SupFactory {

	//the above method requires the detail of product, but we dont know what product will be 
	//created in run time, so we can give the implementation to its subclass
	public void sendProduct() {
		Product a = genProduct();
		System.out.println(a);
	}
	abstract Product genProduct();
}
