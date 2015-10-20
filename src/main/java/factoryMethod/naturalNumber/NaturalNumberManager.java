package factoryMethod.naturalNumber;

public class NaturalNumberManager {
	
	private NaturalNumber naturalNumber;
	
	private NaturalNumberCreator creator;
	
	private int value;

	public void setCreator(NaturalNumberCreator creator) {
		this.creator = creator;
	}
	
	public void createLanguage () {
		this.naturalNumber = this.creator.createNaturalNumber(value);
	}

	public NaturalNumber getLanguage() {
		return naturalNumber;
	}
	
	
	
	

}
