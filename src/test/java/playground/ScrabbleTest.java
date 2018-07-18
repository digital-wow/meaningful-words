package playground;

import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

public class ScrabbleTest {

	@Test
	public void test() {
		List<String> meaningfulWords = new Scrabbler().getMeaningfulWords("ram");
		org.junit.Assert.assertEquals(5, meaningfulWords.size());
		org.junit.Assert.assertTrue(meaningfulWords.contains("am"));
		org.junit.Assert.assertTrue(meaningfulWords.contains("ma"));
		org.junit.Assert.assertTrue(meaningfulWords.contains("mar"));
		org.junit.Assert.assertTrue(meaningfulWords.contains("arm"));
		org.junit.Assert.assertTrue(meaningfulWords.contains("ra"));
		
	}

}
