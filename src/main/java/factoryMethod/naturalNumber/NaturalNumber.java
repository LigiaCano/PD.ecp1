package factoryMethod.naturalNumber;

public abstract class NaturalNumber {

	protected int value;

	public NaturalNumber(int value) {
		this.setValue(value);
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		assert value >= 0;
		this.value = value;
	}

	public void add(int value) {
		this.setValue(this.value + value);
	}

	public abstract String getTextValue();
}
