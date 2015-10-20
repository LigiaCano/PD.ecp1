package calculadora.memento;

import upm.jbb.IO;

public class ComandoDeshacer extends Calculo {

	public ComandoDeshacer(Calculator c, GestorMementos<MementoCalculadora> gm) {
		super(c,gm);
	}

	@Override
	public void execute() {
		this.o.restoreMemento(this.gm.getMemento((String) IO.getIO().select(gm.keys(), "Restaurar")));
	}

	public String name() {
		return "Deshacer";
	}
}
