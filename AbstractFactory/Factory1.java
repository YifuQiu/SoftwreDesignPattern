package AbstractFactory;

public class Factory1 extends AbstractFactory{

	@Override
	public Product generateA() {
		return new ProductA1();
	}

	@Override
	public Product generateB() {
		// TODO Auto-generated method stub
		return new ProductB1();
	}

}
