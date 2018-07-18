package playground;

import java.util.ArrayList;
import java.util.List;

import playground.dict.MyDictionary;

public class Scrabbler {

	
	public List<String> getMeaningfulWords(String inputString) {
		List<String> meaningfulWords = new ArrayList<String>();
		
		// TODO : Write your code here

		

		return meaningfulWords;
	}

	private boolean isMeaningful(String word) {
		return MyDictionary.checkWord(word);
	}

}
