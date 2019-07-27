package prac19;

public class RemoteControl {

	private Command command;
	
	public RemoteControl() {
		// TODO Auto-generated constructor stub
	}
	
	public void pressButton() {
		command.execute();
	}

	public void setCommand(Command command) {
		this.command = command;
	}

}
