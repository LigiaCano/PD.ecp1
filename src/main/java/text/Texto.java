package text;

public class Texto extends TextoCompuesto {
	public Texto() {
		super();
	}

	@Override
	public void add(TextoAbstracto textoAbstracto) {
		if (!(textoAbstracto instanceof Caracter)) {
			this.getDocs().add(textoAbstracto);
		} else {
			throw new UnsupportedOperationException();
		}
	}

	@Override
	public void remove(TextoAbstracto textoAbstracto) {
		if (textoAbstracto instanceof TextoAbstracto) {
			this.getDocs().remove(textoAbstracto);
		} else {
		}
	}

	@Override
	public String print(boolean isCapitalized) {
		String resultado = "";
		if (isCapitalized) {
			for (TextoAbstracto elem : this.getDocs()) {
				resultado = resultado + elem.print(isCapitalized).toUpperCase();
			}
		} else {
			for (TextoAbstracto elem : this.getDocs()) {
				resultado = resultado + elem.print(isCapitalized);
			}
		}
		return resultado + "---o---" + "\n";
	}
}
