package factoryMethod.naturalNumber;

public class NaturalNumberFrCreator extends NaturalNumberCreator {

	@Override
	public NaturalNumber createNaturalNumber(int value) {
		return new NaturalNumberFr(value);
	}

	@Override
	public String toString() {
		return "NaturalNumber French Creator";
	}

}
