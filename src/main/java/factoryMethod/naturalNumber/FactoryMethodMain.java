package factoryMethod.naturalNumber;

import upm.jbb.IO;

public class FactoryMethodMain {
	private NaturalNumberCreator[] creators = { new NaturalNumberEnCreator(), new NaturalNumberEsCreator(),
			new NaturalNumberFrCreator() };

	private NaturalNumberCreator naturalNumberCreator = creators[0];

	public void creatorLanguage() {
		this.naturalNumberCreator = (NaturalNumberCreator) IO.getIO().select(creators, "Elige un creador");
	}

	public void createNaturalNumber() {
		IO.getIO().println(
				"Creado producto: " + this.naturalNumberCreator.createNaturalNumber(IO.getIO().readInt()).toString());
	}

	public static void main(String[] args) {
		IO.getIO().addView(new FactoryMethodMain());
	}
}
