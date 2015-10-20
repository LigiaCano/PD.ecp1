package calculadora.memento;

import calculadora.memento.CommandManager;
import calculadora.memento.PrintCommand;
import calculadora.memento.ResetCommand;
import calculadora.memento.SubtractCommand;
import calculadora.memento.AddCommand;
import upm.jbb.IO;

public class MainCalculator {
	private CommandManager commandManager;
	private GestorMementos<MementoCalculadora> gm = new GestorMementos<MementoCalculadora>();

	public MainCalculator() {
		Calculator calculator = new Calculator();
		this.commandManager = new CommandManager();
		this.commandManager.add(new AddCommand(calculator));
		this.commandManager.add(new SubtractCommand(calculator));
		this.commandManager.add(new ResetCommand(calculator));
		this.commandManager.add(new PrintCommand(calculator));
		this.commandManager.add(new ComandoDeshacer(calculator, gm));
		this.commandManager.add(new ComandoGuardar(calculator, gm));
	}

	public void execute() {
		String key = (String) IO.getIO().select(this.commandManager.keys());
		this.commandManager.execute(key);
	}

	public static void main(String[] args) {
		IO.getIO().addView(new MainCalculator());
	}
}
