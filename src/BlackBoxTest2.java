import org.junit.Test;

import weiser.*;
public class BlackBoxTest2 {
/**
 * Test wie viele Personen im LKW drinnen sind 4 maximal)
 */
	@Test(expected=PersonenException.class)
	public void Test1() {
		
		LKW lkw = new LKW("lkw",4000,1250,4);
		lkw.einsteigen();
		lkw.einsteigen();
		lkw.aussteigen();
		lkw.einsteigen();
		lkw.einsteigen();
		lkw.einsteigen();
		lkw.einsteigen();
		
		
	}

}
