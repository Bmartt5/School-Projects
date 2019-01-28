package Assignment3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SpellChecking {

	public static void main(String[] args) throws FileNotFoundException {


		/**
		 * Adds the two text file names on the command line
		 *
		 */
		Scanner file = new Scanner(new File("C:\\Program Files\\testStates.txt".toLowerCase()));
		Scanner file2 = new Scanner(new File("C:\\Program Files\\dictionary.txt".toLowerCase()));

		/**
		 * For each word in the input
		 *
		 */
		Set<String> set = new HashSet<>();
		while (file.hasNext()) {

			set.add(file.next());

		}

		Set<String> set2 = new HashSet<>();
		while (file2.hasNext()) {

			set2.add(file2.next());

		}

		/**
		 * Reads both files into string variables
		 *
		 *
		 */
		System.out.println("Enter words from testStates: ");
		Scanner input = new Scanner(System.in);
		String search = set.toString();
		System.out.println(set);
		System.out.println("Enter words from dictionary to check for spelling: ");
		String search2 = set2.toString();
		System.out.println(set2);

		/**
		 * Check if the set contains the search string
		 *
		 *
		 */
		if (set.contains(set2)) {
			System.out.println("Yes " + search + " is in the dictionary");

		} else {
			System.out.println("File 1 is not the same as file 2 ");

		}

//		if (search.contains(search2) || set.contains(set2)) {
//			System.out.println("Is " + search2 + " in the Dictionary? \n" + set.contains(search2) + " " + search2 + " "
//					+ " is in the dictionary");
//
//		} else {
//			System.out.println(
//					search2 + " is an unknown word or miscorrectly spelled try typing the word below \n " + search);
//
//		}
		System.out.println();
		System.out.println("Confirm files match in size");
		System.out.println("Number of elements in file1: " + set.size());
		System.out.println("Number of elements in file2: " + set2.size());
//		System.out.println("Elements in set: " + set);
//		set.remove("window");
//		System.out.print("Names in set in uppercase are ");
//		for (String s : set)
//			System.out.print(s.toUpperCase() + " ");

	}

}

