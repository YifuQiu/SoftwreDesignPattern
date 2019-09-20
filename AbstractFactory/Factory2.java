package AbstractFactory;

public class Factory2 extends AbstractFactory{

	@Override
	public Product generateA() {
		// TODO Auto-generated method stub
		return new ProductA2();
	}

	@Override
	public Product generateB() {
		// TODO Auto-generated method stub
		return new ProductB2();
	}

}
