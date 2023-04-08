package method_invocation_pattern;

public class LightOffCommand implements Command {

	private Receiver mReceiver;
	
	public LightOffCommand(Receiver receiver){
		mReceiver=receiver;
	}
	
	@Override
	public void execute() {
		mReceiver.off();
	}

	@Override
	public void cancel() {

	}

}
