package calculadora;

public class SubtractCommand extends Calculo {

	public SubtractCommand(Calculator calculator) {
		super(calculator);
	}

	@Override
	public String name() {
		return "Subtract";
	}

	@Override
	public void execute() {
		calculator.subtract();
	}
}
