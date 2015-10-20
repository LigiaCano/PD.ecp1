package calculadora.memento;

public class MementoCalculadora {
	
	private int valorTotal;

	public MementoCalculadora(int valor) {
		this.valorTotal = valor;
	}

	public int getValorTotal() {
		return this.valorTotal;
	}

	public void setValorTotal(int valor) {
		this.valorTotal = valor;
	}
}
