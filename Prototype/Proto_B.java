package Prototype;

public class Proto_B extends Prototype{
	
	
	private String atr = "jeje";
	public void setAtr(String s) {
		atr = s;
	}
	@Override
	public Prototype Clone() {
		Proto_B p = new Proto_B();
		p.setNum(this.getNum());
		p.setAtr(atr);
		return p;
	}
}
