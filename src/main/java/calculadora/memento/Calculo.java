package calculadora.memento;

import upm.jbb.IO;

public abstract class Calculo implements Comando {

	protected Calculator calculator;
	protected GestorMementos<MementoCalculadora> gm;
	protected CalculadoraMementable<MementoCalculadora> o;

	public Calculo(Calculator calculator) {
		this.calculator = calculator;
	}
	
	public Calculo(Calculator calculator, GestorMementos<MementoCalculadora> gm) {
		this.calculator = calculator;
		this.gm = gm;
		this.o = new CalculadoraOriginador(calculator);
		IO.getIO().addView(this.o);
		IO.getIO().addView(this);
	}

	@Override
	public String toString() {
		return this.name();
	}

}
