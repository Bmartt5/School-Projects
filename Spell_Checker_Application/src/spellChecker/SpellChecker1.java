package spellChecker;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

class SpellChecker {
	private boolean test = true;
	private String dictionaryText;
	private String testStateText;
	private ArrayList<String> testStatesList = new ArrayList<String>();
	private ArrayList<String> dictionaryList = new ArrayList<String>();
	private BufferedReader dictionaryBufReader;
	private BufferedReader testStateBufReader;

	public void dict() throws IOException {

		while (test) {

			// Adds dictionary.txt to the Array List as a string
			InputStream dictionary = new FileInputStream("dictionary.txt");
			dictionaryBufReader = new BufferedReader(new InputStreamReader(dictionary));

			while ((dictionaryText = dictionaryBufReader.readLine()) != null)

				dictionaryList.add(dictionaryText);

			// Adds testStates.txt to the Array List as a string
			InputStream testStates = new FileInputStream("testStates.txt");
			testStateBufReader = new BufferedReader(new InputStreamReader(testStates));

			while ((testStateText = testStateBufReader.readLine()) != null)

				testStatesList.add(testStateText);

			// Spell Check Logic compares each string from testStates.txt to dictionary.txt
			for (int i = 0; i < testStatesList.size(); i++) {
				if (dictionaryList.contains(testStatesList.get(i))) {

					System.out.println('"' + testStatesList.get(i) + '"');

				} else {

					System.out.println('"' + testStatesList.get(i) + '"' + " : Unknown Word");

				}
			}

			test = false;

			/*
			 * Retrieves all words in file if needed for UI
			 * Files.lines(Paths.get("dictionary.txt")).forEach(System.out::println);
			 * Files.lines(Paths.get("testStates.txt")).forEach(System.out::println);
			 */

		}

	}
}
