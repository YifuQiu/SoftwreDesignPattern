package Prototype;

public class Proto_A extends Prototype{
	private String atr = "jaja";
	public void setAtr(String s) {
		atr = s;
	}
	@Override
	public Prototype Clone() {
		Proto_A p = new Proto_A();
		p.setNum(this.getNum());
		p.setAtr(atr);
		return p;
	}

}
