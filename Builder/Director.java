package Builder;

public class Director {

	private Builder builder;
	
	public Director(Builder builder) {
		this.builder = builder;
	}
	
	public void setBuilder(Builder b) {
		this.builder = b;
	}
	
	public Product construct() {
		builder.buildName();
		builder.buildPrice();
		builder.buildSize();
		return builder.getResult();
	}
}
