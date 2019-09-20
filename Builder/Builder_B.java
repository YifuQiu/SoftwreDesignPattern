package Builder;

public class Builder_B extends Builder{

	@Override
	public void buildName() {
		product.setName("name b");
	}

	@Override
	public void buildPrice() {
		product.setPrice("price b 9 €");
	}

	@Override
	public void buildSize() {
		product.setSize("M");
	}

}
