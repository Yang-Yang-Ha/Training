package method_invocation_pattern;

public class LightOnCommand implements Command {

	private Receiver mReceiver;
	
	public LightOnCommand(Receiver receiver){
		mReceiver=receiver;
	}
	
	@Override
	public void execute() {
		mReceiver.on();
	}

	@Override
	public void cancel() {

	}

}
