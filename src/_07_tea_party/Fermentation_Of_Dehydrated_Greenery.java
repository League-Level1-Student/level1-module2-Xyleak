package _07_tea_party;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Fermentation_Of_Dehydrated_Greenery {

	public String welcome(String name, boolean isWoman, boolean isKnighted) {
		return name;



	}
	class TeaPartyTest {
		/**
		 * Jane Austen is a woman, so say “Hello Ms. Austen”. 
		 * George Orwell is a man, so say “Hello Mr. Orwell”. 
		 * Isaac Newton was knighted, so say "Hello Sir Isaac Newton".
		 **/

		@Test
		public void test() {
			Fermentation_Of_Dehydrated_Greenery teaParty = new Fermentation_Of_Dehydrated_Greenery();
			String greeting = teaParty.welcome(null, false, false);
			assertEquals("Hello Ms. Austen", teaParty.welcome("Austen", true, false));
			assertEquals("Hello Mr. Orwell", teaParty.welcome("Orwell", false, false));
			assertEquals("Hello Sir Isaac Newton", teaParty.welcome("Isaac Newton", false, true));


		}
	}
}
