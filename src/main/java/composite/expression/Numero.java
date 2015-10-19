package composite.expression;

public class Numero extends Expresion{
	
	private int numero;
	
	public Numero(int numb){
		numero = numb;
	}

	@Override
	public int operar() {
		return this.numero;
	}
	
	@Override
	 public String toString() {
		return numero + "";
	}

}
