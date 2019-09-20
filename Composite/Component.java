package Composite;

import java.util.ArrayList;

public abstract class Component{

		public abstract void add(Component c) throws Exception;
		public abstract void remove(Component c) throws Exception ;
		public abstract Component getChild(int i);
		public abstract void operation();
}


class Leaf extends Component{

	@Override
	public void add(Component c) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception();
	}

	@Override
	public void remove(Component c) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception();
	}

	@Override
	public Component getChild(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void operation() {
		// TODO Auto-generated method stub
		
	}
	
}

class Composite extends Component{

	private ArrayList<Component> list = new ArrayList<>();
	
	@Override
	public void add(Component c) throws Exception {
		// TODO Auto-generated method stub
		list.add(c);
		
	}

	@Override
	public void remove(Component c) throws Exception {
		// TODO Auto-generated method stub
		list.remove(c);
	}

	@Override
	public Component getChild(int i) {
		// TODO Auto-generated method stub
		return (Component)list.get(i);
	}

	@Override
	public void operation() {
		// TODO Auto-generated method stub
		for(Object obj:list) {
			((Component)obj).operation();
		}
	}
	
}