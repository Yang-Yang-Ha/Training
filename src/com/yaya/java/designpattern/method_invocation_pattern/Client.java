package method_invocation_pattern;

public class Client {

	public static void main(String[] args) {
		RemoteInvoker remoteInvoker=new RemoteInvoker();
		
		Receiver receiver=new Receiver();
		LightOffCommand lightOffCommand=new LightOffCommand(receiver);
		LightOnCommand lightOnCommand=new LightOnCommand(receiver);
		remoteInvoker.setCommand(0, lightOnCommand, lightOffCommand);
		
		remoteInvoker.onButtonWasPushed(0);
		remoteInvoker.offButtonWasPushed(0);
	}

}
