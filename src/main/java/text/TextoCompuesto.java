package text;

import java.util.ArrayList;
import java.util.List;

public abstract class TextoCompuesto extends TextoAbstracto {
	private List<TextoAbstracto> list;

	public TextoCompuesto() {
		this.list = new ArrayList<TextoAbstracto>();
	}

	public List<TextoAbstracto> getDocs() {
		return this.list;
	}

	public abstract void remove(TextoAbstracto textoAbstracto) ;

	public abstract void add(TextoAbstracto componente) ;
	
	public abstract String print(boolean esMayuscula) ;

}
