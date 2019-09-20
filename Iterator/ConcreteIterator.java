package Iterator;

interface Iterator {

	public void first();
	public void next();
	public boolean hasNext();
	public Object currentItem();
}

public class ConcreteIterator implements Iterator{

	private ConcreteAggregate objects;  //mantener una referencia al objeto concreto para poder realizar operaciones sobre los datos del objeto
	private int cursor;
	public ConcreteIterator(ConcreteAggregate o) {
		objects = o;
	}
	
	@Override
	public void first() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void next() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object currentItem() {
		// TODO Auto-generated method stub
		return null;
	}
	
}


interface Aggregate{
	ConcreteIterator createIterator();
}

class ConcreteAggregate implements Aggregate{

	@Override
	public ConcreteIterator createIterator() {
		return new ConcreteIterator(this);
	}
	
}

