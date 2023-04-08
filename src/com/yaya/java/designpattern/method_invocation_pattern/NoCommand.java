package method_invocation_pattern;

public class NoCommand implements Command {

	@Override
	public void execute() {
		System.out.println("no commend");
	}

	@Override
	public void cancel() {
		System.out.println("no commend");
	}

}
