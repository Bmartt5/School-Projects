package spellChecker;

//Author Name: Brian Martin
//Date: 4/13/2019
//Program Name: Spell_Checker
//Purpose: The program should do spell checking

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SpellChecker {

	private static boolean test = true;
	private static String dictionaryText;
	private static String testStateText;
	private static ArrayList<String> testStatesList = new ArrayList<String>();
	private static ArrayList<String> dictionaryList = new ArrayList<String>();

	public static void main(String[] args) throws IOException {

		while (test) {

			// Adds dictionary.txt to the Array List as a string
			InputStream dictionary = new FileInputStream("dictionary.txt");
			BufferedReader dictionaryBufReader = new BufferedReader(new InputStreamReader(dictionary));

			while ((dictionaryText = dictionaryBufReader.readLine()) != null)

				dictionaryList.add(dictionaryText);

			// Adds testStates.txt to the Array List as a string
			InputStream testStates = new FileInputStream("testStates.txt");
			BufferedReader testStateBufReader = new BufferedReader(new InputStreamReader(testStates));

			while ((testStateText = testStateBufReader.readLine()) != null)

				testStatesList.add(testStateText);

			// Spell Check Logic implementation
			for (int i = 0; i < testStatesList.size(); i++) {
				if (dictionaryList.contains(testStatesList.get(i))) {

					System.out.println('"' + testStatesList.get(i) + '"');

				} else {

					System.out.println('"' + testStatesList.get(i) + '"' + " : Unknown Word");

				}
			}

			test = false;

			// Retrieves all words in file
//			Files.lines(Paths.get("dictionary.txt")).forEach(System.out::println);
//			Files.lines(Paths.get("testStates.txt")).forEach(System.out::println);

		}
	}
}