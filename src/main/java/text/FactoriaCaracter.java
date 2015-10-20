package text;

import java.util.HashMap;
import java.util.Map;

public final class FactoriaCaracter {
	private static final FactoriaCaracter factoriaCaracter = new FactoriaCaracter();
	private Map<String, Caracter> caracteres;
	private Caracter carater;

	private FactoriaCaracter() {
		this.caracteres = new HashMap<String, Caracter>();
	}

	public Caracter get(char key) {
		Caracter result = this.caracteres.get(key);
		if (result == null) {
			carater = new Caracter(key);
			caracteres.put(String.valueOf(key), carater);
			result = this.carater;
		}
		return carater;
	}

	public static FactoriaCaracter getFactoria() {
		return FactoriaCaracter.factoriaCaracter;
	}

}
