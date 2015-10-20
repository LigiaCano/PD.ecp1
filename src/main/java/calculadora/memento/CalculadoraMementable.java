package calculadora.memento;

public interface CalculadoraMementable<T> {
	T createMemento();

	void restoreMemento(T memento);

}
