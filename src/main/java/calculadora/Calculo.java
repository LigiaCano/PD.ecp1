package calculadora;

public abstract class Calculo implements Comando {

	protected Calculator calculator;

	public Calculo(Calculator calculator) {
		this.calculator = calculator;
	}

	@Override
	public String toString() {
		return this.name();
	}

}
