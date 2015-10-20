package factoryMethod.naturalNumber;

public class NaturalNumberEs extends NaturalNumber {

    private static final String[] textValue = {"cero", "uno", "dos", "tres", "cuatro", "cinco"};

    public NaturalNumberEs(int value) {
        super(value);
    }

    @Override
    public String getTextValue() {
        if (this.value < textValue.length) {
            return NaturalNumberEs.textValue[this.value];
        } else {
            return "???";
        }
    }
    
    @Override
    public String toString() {
        return "Product NaturalNumber Español Value = " + this.getTextValue();
    }


}
