import AbstractFactory.*;
import Bridge.*;
import Builder.*;
import Builder.Product;
import FactoryMethod.SubFactory1;
import FactoryMethod.SupFactory;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		abstractFactoryTest();
		//factoryMethodTest();
//		builderTest();
		bridgeTest();
	}
	private static void abstractFactoryTest() {
		AbstractFactory factory = new Factory1();
		factory.generateA().showProduct();
		factory.generateB().showProduct();
		
		factory = new Factory2();
		factory.generateA().showProduct();
		factory.generateB().showProduct();
	}
	
	private static void factoryMethodTest() {
		SupFactory sf = new SubFactory1();
		
		sf.sendProduct();
		
	}
	
	private static void builderTest() {
//		Builder b = new Builder_B();
		Builder b = new Builder_A();
		Director d = new Director(b);
		Product p = d.construct();
		System.out.println(p.getName());
		System.out.println(p.getPrice());
		System.out.println(p.getSize());
	}
	
	
	private static void bridgeTest() {
		Bridge b = new RefinedAbstraction();
		Implementor imp = new SubImplementor();
		b.setImplementor(imp);
		b.operation();
	}
}
