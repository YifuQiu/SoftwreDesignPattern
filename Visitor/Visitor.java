package Visitor;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class Visitor {
	public abstract void visit(ConcreteElementA ca);
	public abstract void visit(ConcreteElementB cb);
}



interface Element{
	public void accept(Visitor v);
}

class ConcreteElementA implements Element{

	@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		
	}
	
}
class ConcreteElementB implements Element{

	@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		
	}
	
}

class ConcreteVisitor extends Visitor{

	@Override
	public void visit(ConcreteElementA ca) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(ConcreteElementB cb) {
		// TODO Auto-generated method stub
		
	}
	
}

class ObjectStructure
{
	private ArrayList<Element> list = new ArrayList<Element>(); 
 
	public void accept(Visitor visitor)
	{
		Iterator<Element> i=list.iterator();
		
		while(i.hasNext())
		{
			((Element)i.next()).accept(visitor); 
		}
	}
 
	public void addElement(Element element)
	{
		list.add(element);
	}
 
	public void removeElement(Element element)
	{
		list.remove(element);
	}
}
