package calculadora.memento;

public class PrintCommand extends Calculo{
	
	public PrintCommand(Calculator calculator) {
		super(calculator);
	}

	@Override
	public String name() {
		return "Print";
	}

	@Override
	public void execute() {
		calculator.print();
	}

}
