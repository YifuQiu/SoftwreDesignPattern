package Builder;

public abstract class Builder {
	
	protected Product product = new Product();
	
	public abstract void buildName();
	public abstract void buildPrice();
	public abstract void buildSize();
	
	public Product getResult() {
		return product;
	}
}
