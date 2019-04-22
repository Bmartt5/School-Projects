package spellChecker;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Database {

	// Database implementation
	public static Connection getConnection() throws Exception {
		try {
			String driver = "com.mysql.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/spelling";
			String username = "root";
			String password = "admin";
			Class.forName(driver);

			Connection myConn = DriverManager.getConnection(url, username, password);
			System.out.println("Connection successful!!!");
			return myConn;
		} catch (Exception e) {
			System.out.println(e);
		}

		return null;
	}

	public static void createTable() throws Exception {
		try {
			Connection connection = getConnection();
			PreparedStatement create = connection.prepareStatement("CREATE TABLE IF NOT EXIST ");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void post() throws Exception {

		final String var1 = "Insert";
		final String var2 = "Test";
		final String var3 = "a";

		try {
			Connection connection = getConnection();
			PreparedStatement posted = connection.prepareStatement(
					"INSERT INTO word (word) VALUES ('" + var1 + "', '" + var2 + "', '" + var3 + "')");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static ArrayList<String> get() throws Exception {
		try {
			Connection connection = getConnection();
			PreparedStatement statement = connection.prepareStatement("select * from spelling.word");

			ResultSet result = statement.executeQuery();

			ArrayList<String> array = new ArrayList<String>();

			while (result.next()) {
				System.out.print(result.getString("first"));
				System.out.print(" ");
				System.out.println(result.getString("last"));

				array.add(result.getString("last"));
			}

			System.out.println("ALL records have been selected!");
			return array;
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;

	}
}
