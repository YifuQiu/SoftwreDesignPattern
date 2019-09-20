package FactoryMethod;

public class SubFactory1 extends SupFactory{

	@Override
	Product genProduct() {
		// TODO Auto-generated method stub
		return new ProductA();
	}
	
}
