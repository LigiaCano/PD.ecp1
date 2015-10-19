package composite.expression;

public class Dividir extends Operacion {

	public Dividir(Expresion exp1, Expresion exp2) {
		super(exp1, exp2);
	}

	@Override
	public int operar() {

		return expresion1.operar() / expresion2.operar();
	}

	@Override
	public String toString() {
		return "(" + expresion1.toString() + "/" + expresion2.toString() + ")";
	}

}
