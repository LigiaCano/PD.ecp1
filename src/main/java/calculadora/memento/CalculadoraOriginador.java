package calculadora.memento;

public class CalculadoraOriginador implements CalculadoraMementable<MementoCalculadora> {

	private Calculator calculator;
	private int valorTotal;

	public CalculadoraOriginador(Calculator calculator) {
		this.calculator = calculator;
	}

	public Calculator getCalculator() {
		return calculator;
	}

	public int getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(int valor) {
		this.valorTotal = valor;
	}

	@Override
	public MementoCalculadora createMemento() {
		return new MementoCalculadora(this.getValorTotal());
	}

	@Override
	public void restoreMemento(MementoCalculadora memento) {
		this.setValorTotal(memento.getValorTotal());
	}

}
