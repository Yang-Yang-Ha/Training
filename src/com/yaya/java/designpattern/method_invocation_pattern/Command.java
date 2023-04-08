package method_invocation_pattern;

/*
 * 命令模式中的命令对象借口
 */
public interface Command {
	void execute();
	void cancel();
}
