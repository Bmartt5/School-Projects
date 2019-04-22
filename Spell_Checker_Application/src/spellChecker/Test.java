package spellChecker;

//Author Name: Brian Martin

//Date: 4/21/2019
//Program Name: Spell_Check_Application
//Purpose: The program should do spell checking

import java.io.IOException;

public class Test extends SpellChecker {

	public static void main(String[] args) {

		// Status
		System.out.println("Running Application ");
		
		// Returns SpellChecker Object
		SpellChecker spellCheck = new SpellChecker();
		try {
			spellCheck.dict();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Returns Database Object
//		try {
//			getConnection();
//			createTable();
//			post();
//			get();
//		} catch (Exception e) {
//			System.out.println(e);
//		}

	}
}
