package calculadora.memento;

public class ResetCommand extends Calculo{

	public ResetCommand(Calculator calculator) {
		super(calculator);
	}

	@Override
	public String name() {
		return "Reset";
	}

	@Override
	public void execute() {
		calculator.reset();
	}
}
