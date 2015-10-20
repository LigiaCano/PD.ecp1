package calculadora.memento;

import upm.jbb.IO;

public class Calculator {
	private int total;

	public Calculator() {
		this.reset();
	}

	public int getTotal() {
		return total;
	}

	protected void setTotal(int total) {
		this.total = total;
	}

	public void add() {
		int valor = IO.getIO().readInt();
		this.setTotal(this.total + valor);
	}

	public void subtract() {
		int valor = IO.getIO().readInt();
		this.setTotal(this.total - valor);
	}

	public void reset() {
		this.setTotal(0);
	}

	public void print() {
		IO.getIO().println(total);
	}

	 public void Deshacer(){
	    	throw new UnsupportedOperationException();
	    }
	    
	public void Guardar(){
	    	throw new UnsupportedOperationException();
	    }
}
