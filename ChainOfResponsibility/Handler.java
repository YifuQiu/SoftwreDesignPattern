package ChainOfResponsibility;

public abstract class Handler {
	protected Handler sucessor;
	
	public void setSucessor(Handler s) {
		sucessor = s;
	}
	
	public abstract void handleRequest(String request);   //send to the successor if can't handle the request
}


