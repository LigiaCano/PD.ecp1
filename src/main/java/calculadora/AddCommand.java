package calculadora;

public class AddCommand extends Calculo {
	public AddCommand(Calculator calculator) {
		super(calculator);
	}

	@Override
	public String name() {
		return "Add";
	}

	@Override
	public void execute() {
		calculator.add();
	}

}
