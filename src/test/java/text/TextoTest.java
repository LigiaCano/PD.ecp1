package text;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import text.TextoAbstracto;
import text.FactoriaCaracter;
import text.Parrafo;
import text.Texto;

public class TextoTest {
	private TextoAbstracto H, i, prf, txt;

	@Before
	public void ini() {
		H = FactoriaCaracter.getFactoria().get('H');
		i = FactoriaCaracter.getFactoria().get('i');
		prf = new Parrafo();
		prf.add(H);
		prf.add(i);
		txt = new Texto();
		txt.add(prf);
	}

	@Test
	public void testAddCaracter() {
		H.add(i);
	}

	@Test
	public void testPrintCaracter() {
		assertEquals("i", i.print(false));
	}

	@Test
	public void testPrintCaracterMayuscula() {
		assertEquals("I", i.print(true));
	}

	@Test
	public void testPrintParrafo() {
		assertEquals("Hi\n", prf.print(false));
	}

	@Test
	public void testPrintParrafoMayuscula() {
		assertEquals("HI\n", prf.print(true));
	}

	@Test
	public void testAddOtroPrarrafo() {
		try {
			prf.add(prf);
			fail("No se puede agregar otro parrafo");
		} catch (UnsupportedOperationException e) {
			e.toString();
		}
	}
	
	@Test
	public void testAddTextoAlPrarrafo() {
		try {
			prf.add(txt);
			fail("No se puede agregar texto");
		} catch (UnsupportedOperationException e) {
			e.toString();
		}
	}

	@Test
	public void testPrintTexto() {
		assertEquals("Hi\n---o---\n", txt.print(false));
	}

	@Test
	public void testPrintTextoMayusculas() {
		assertEquals("HI\n---o---\n", txt.print(true));
	}

	@Test
	public void testAddCaracrterAlTexto() {
		try {
			txt.add(H);
			fail("No se puede agregar un caracter");
		} catch (UnsupportedOperationException e) {
			e.toString();
		}
	}
}
