package text;

public class Caracter extends TextoAbstracto{
	
	private char c;
	
	public Caracter(char c) {
		this.c = c;
	}
	
	@Override
	public void add(TextoAbstracto textoAbstracto) {

	}
	
	@Override
	public void remove(TextoAbstracto textoAbstracto) {
		
	}

	public String print(boolean isCapitalized) {
		if (isCapitalized)
			return String.valueOf(c).toUpperCase();
		else
			return String.valueOf(c);
	}
}
