import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Author Name: Brian Martin
//Date: 1/13/2019
//Program Name: Martin_Airplane
//Purpose: Simulation using "call" button, call attendent

public class Martin_Airplane {


	static Scanner input;

	// Driver Code
	public static void main(String[] args) {

		input = new Scanner(System.in);

		Map<String, Integer> seatList = new HashMap<>();

		seatList.put("Seat 1", 1);
		seatList.put("Seat 2", 2);
		seatList.put("Seat 3", 3);
		seatList.put("Seat 4", 4);
		seatList.put("Seat 5", 5);


		boolean keepLooping = true;

		while (keepLooping) {

			System.out.println();
			System.out.print("Enter command ('h' for help): ");
			String key = input.nextLine().toUpperCase();

			switch (key) {
			case "H":
				System.out.println("[E] ---- Exits program");
				System.out.println("[H] ---- Shows help");
				System.out.println("[L] ---- Shows seats");
				System.out.println("Enter [1] to Call Flight attendant ");
				System.out.println("Enter [2] to Call Flight attendant ");
				System.out.println("Enter [3] to Call Flight attendant ");
				System.out.println("Enter [4] to Call Flight attendant ");
				System.out.println("Enter [5] to Call Flight attendant ");

				break;

			// terminates application
			case "E":
				System.out.println("Passengers have Departed");
				keepLooping = false;
				break;

			case "L":
				System.out.println();
				System.out.println("Seats with Passengers");
				System.out.println(seatList);
				break;

			// Shows seats
			case "1":
				System.out.println();
				System.out.println("Seat [" + key + "] is Calling for the Attendant");
				break;

			case "2":
				System.out.println();
				System.out.println("Seat [" + key + "] is Calling for the Attendant");
				break;

			case "3":
				System.out.println();
				System.out.println("Seat [" + key + "] is Calling for the Attendant");
				break;

			case "4":
				System.out.println();
				System.out.println("Seat [" + key + "] is Calling for the Attendant");
				break;

			case "5":
				System.out.println();
				System.out.println("Seat [" + key + "] is Calling for the Attendant");
				break;

			}

		}

		input.close();

	}

}
