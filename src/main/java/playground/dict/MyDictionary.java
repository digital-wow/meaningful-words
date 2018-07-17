package playground.dict;

import java.io.File;

import com.swabunga.spell.engine.SpellDictionary;
import com.swabunga.spell.engine.SpellDictionaryHashMap;
import com.swabunga.spell.event.SpellChecker;

public class MyDictionary {

	private static String dictFile = "dict.txt";

	private static SpellChecker spellCheck;

	private static void init() {
		try {
			ClassLoader classLoader = MyDictionary.class.getClassLoader();
			File file = new File(classLoader.getResource(dictFile).getFile());
			SpellDictionary dictionary = new SpellDictionaryHashMap(file);
			spellCheck = new SpellChecker(dictionary);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static boolean checkWord(String word) {
		if (spellCheck == null) {
			init();
		}
		return spellCheck.isCorrect(word);
	}

}
