package factoryMethod.naturalNumber;

public class NaturalNumberEn extends NaturalNumber {

	private static final String[] textValue = { "zero", "one", "two", "three", "four", "five" };

	public NaturalNumberEn(int value) {
		super(value);
	}

	public String getTextValue() {
		if (this.value < textValue.length) {
			return NaturalNumberEn.textValue[this.value];
		} else {
			return "???";
		}
	}
	
	 @Override
	    public String toString() {
	        return "Product NaturalNumber Ingles Value = " + this.getTextValue();
	    }

}
