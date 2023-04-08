package method_invocation_pattern;

public class RemoteInvoker {

	private Command[] onCommands;
	private Command[] offCommands;
	
	public RemoteInvoker(){
		onCommands=new Command[7];
		offCommands=new Command[7];
		Command noCommand=new NoCommand();
		for(int i=0;i<7;i++){
			onCommands[i]=noCommand;
			offCommands[i]=noCommand;
		}
	}
	
	public void setCommand(int solt,Command onCommand,Command offCommand){
		onCommands[solt]=onCommand;
		offCommands[solt]=offCommand;
	}
	
	public void onButtonWasPushed(int solt){
		onCommands[solt].execute();
	}
	
	public void offButtonWasPushed(int solt){
		offCommands[solt].execute();
	}
	
	public String toString(){
		StringBuffer stringBuffer=new StringBuffer();
		stringBuffer.append("\n-----RemoteInvoker-----\n");
		for(int i=0;i<onCommands.length;i++){
			stringBuffer.append("[solt"+i+"]"+onCommands[i].getClass().getName()
					+"    "+offCommands[i].getClass().getName()+"\n");
		}
		return stringBuffer.toString();
	}
	
}
