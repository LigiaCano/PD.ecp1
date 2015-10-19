package composite.expression;

public abstract class Operacion extends Expresion {

	// private List<Expresion> lista;
	public Expresion expresion1;
	public Expresion expresion2;

	public Operacion(Expresion expresion1, Expresion expresion2) {
		this.expresion1 = expresion1;
		this.expresion2 = expresion2;
	}
}
