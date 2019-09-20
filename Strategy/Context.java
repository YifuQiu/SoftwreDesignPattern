package Strategy;

public class Context {

	private Strategy strategy;
	
	public void setStrategy(Strategy s) {
		strategy = s;
	}
	
	public void algorithm() {
		strategy.algorithm();
	}
}

abstract class Strategy{
	public abstract void algorithm();
}

class StrategyA extends Strategy{

	@Override
	public void algorithm() {
		// TODO Auto-generated method stub
		System.out.println("strategyA");
	}
	
}
class StrategyB extends Strategy{

	@Override
	public void algorithm() {
		// TODO Auto-generated method stub
		
	}
	
}