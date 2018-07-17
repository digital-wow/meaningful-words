package playground;

import java.util.List;

import playground.dict.MyDictionary;

public class Scrabbler {

	public List<String> getMeaningfulWords(String inputString) {

		return null;
	}

	private boolean isMeaningful(String word) {
		return MyDictionary.checkWord(word);
	}

}
