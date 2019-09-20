package Builder;

public class Builder_A extends Builder{

	@Override
	public void buildName() {
		product.setName("name A");
	}

	@Override
	public void buildPrice() {
		product.setPrice("price a 11 €");
	}

	@Override
	public void buildSize() {
		product.setSize("XXXL");
	}
}
