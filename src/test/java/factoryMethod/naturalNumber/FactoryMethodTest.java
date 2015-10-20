package factoryMethod.naturalNumber;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FactoryMethodTest {

	private NaturalNumberCreator[] creadores = { new NaturalNumberEnCreator(), new NaturalNumberEsCreator(),
			new NaturalNumberFrCreator() };

	private NaturalNumber[] numbers = { null, null, null, null };

	@Before
	public void initial() {
		numbers[0] = creadores[0].createNaturalNumber(0);
		numbers[1] = creadores[1].createNaturalNumber(1);
		numbers[2] = creadores[2].createNaturalNumber(2);
		numbers[3] = creadores[0].createNaturalNumber(7);
	}

	@Test
	public void test() {
		assertEquals("zero", numbers[0].getTextValue());
		assertEquals("uno", numbers[1].getTextValue());
		assertEquals("deux", numbers[2].getTextValue());
		assertEquals("???", numbers[3].getTextValue());
	}

}
