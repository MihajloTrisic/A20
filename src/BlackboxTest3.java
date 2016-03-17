import org.junit.Test;

import weiser.*;
public class BlackboxTest3 {
/**
 * Fehler wenn man Person hinzufügt und gleich wieder entfernt. Wenn es 0 Personen sind keine exception
 */
	@Test(expected=PersonenException.class)
	public void Test1() {
		
		LKW lkw = new LKW("lkw",4000,1250,4);
		lkw.einsteigen();
		lkw.aussteigen();
	    
		
		
	}
}
