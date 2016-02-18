import org.junit.Test;

import weiser.*;
public class BlackboxTest {

/**
 * Test Gesamtgewicht 4000, Eigengewicht 1250, Wenn mehr als 4000 fehler)
 */
	@Test(expected=GewichtException.class)
	public void Test1() {
		
		LKW lkw = new LKW("lkw",4000,1250,4);
		lkw.aufladen(1333);
		lkw.entladen(1203);
		lkw.aufladen(2244);
		lkw.aufladen(50);
		lkw.aufladen(10000);
		
	}

}
