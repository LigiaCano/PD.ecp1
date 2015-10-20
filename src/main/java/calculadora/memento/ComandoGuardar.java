package calculadora.memento;

import upm.jbb.IO;

public class ComandoGuardar extends Calculo {

	public ComandoGuardar(Calculator c, GestorMementos<MementoCalculadora> gm) {
		super(c,gm);
	}

	public void execute() {
		 this.gm.addMemento(IO.getIO().readString("Nombre del Memento"),this.o.createMemento());
	}

	public String name() {
		return "Guardar";
	}
}
