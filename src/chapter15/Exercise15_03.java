package chapter15;

import java.lang.Number; // importing Number data type
import java.util.Random; // import Random to generate random numbers.
import java.util.ArrayList; // importing ArrayList.
import java.util.Collections; // importing Collections.

/**
 * This class generates an arraylist of a random number and then uses the shuffle method to shuffle the numbers in the list and prints them.
 * List are printed twice so that they can be distinguished.
 */
public class Exercise15_03 {

	public static void main(String[] args) {
		ArrayList<Number> list = new ArrayList<Number>(); // Creating an
															// arraylist named
															// list that stores
															// Number.
		Random number = new Random(); // Instantiate random.
		System.out.println("List before shuffling is: ");
		for (int i = 0; i < 5; i++) {
			/**
			 * Using a for loop to generate the random numbers and store them in
			 * the list.
			 */
			list.add(number.nextInt()); // adding random numbers to list arraylist.
			System.out.println(list.get(i));
		}

		shuffle(list); // calling shuffle method.

	}

	/**
	 * This method shuffles the arraylist containing numbers and prints them.
	 */
	public static void shuffle(ArrayList<Number> list) {

		Collections.shuffle(list); // shuffles the arraylist.
		System.out.println("\n The shuffled list is: ");
		for (Number list1 : list) {
			/* Using the loop to print the list. */
			System.out.println(list1);
			
		}
	}
}