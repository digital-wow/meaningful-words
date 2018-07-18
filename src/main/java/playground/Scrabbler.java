package playground;

import java.util.ArrayList;
import java.util.List;

import playground.dict.MyDictionary;

public class Scrabbler {

	// TODO : Write your code here
	public List<String> getMeaningfulWords(String inputString) {
		List<String> meaningfulWords = new ArrayList<String>();

		char[] letters = inputString.toCharArray();

		int n = letters.length;

		int N = (int) Math.pow(2d, Double.valueOf(n));
		for (int i = 1; i < N; i++) {
			String code = Integer.toBinaryString(N | i).substring(1);
			StringBuffer strTemp = new StringBuffer();
			for (int j = 0; j < n; j++) {
				if (code.charAt(j) == '1') {
					strTemp.append(letters[j]);
				}
			}
			if (isMeaningful(strTemp.toString()) && strTemp.length() > 1) {
				meaningfulWords.add(strTemp.toString());
			}
		}
		System.out.println(meaningfulWords);

		return meaningfulWords;
	}

	private boolean isMeaningful(String word) {
		return MyDictionary.checkWord(word);
	}

}
