package Command;

public abstract class Command {
	public abstract void execute();
}


class Involker{
	private Command command;

	public Command getCommand() {
		return command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void call() {
		command.execute();
	}
}

class Receiver{
	public void action() {
		System.out.println("action!");
	}
}
class ConcreteCommand extends Command{
	private Receiver receiver = new Receiver();
	public void execute() {
		receiver.action();
	}
}