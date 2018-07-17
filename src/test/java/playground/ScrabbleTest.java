package playground;

import static org.junit.Assert.*;

import org.junit.Test;

import playground.dict.MyDictionary;

public class ScrabbleTest {

	@Test
	public void test() {
		assertTrue(MyDictionary.checkWord("Good"));
	}

}
