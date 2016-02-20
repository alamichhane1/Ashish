package chapter11;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_11 {

	/**
	 * This class compares the data in the array list and sort them in the
	 * ascending order.
	 * 
	 * @author Ashish Lamichhane
	 */
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in); // Creates scanner to input the
												// numbers.
		ArrayList<Integer> list = new ArrayList<>(); // creates new arraylist
														// named list that
														// stores Integer
														// objects.
		/* Using loop to enter five numbers */
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter a numnber: ");
			list.add(input.nextInt()); // add next integer value to list
										// arraylist.
		}

		sort(list); // calling sort method.

	}

	static void sort(ArrayList<Integer> list) {
		int temporary; // creates int data field name temporary.
		/* Using the nested loop to compare two numbers in the arraylist. */
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i) > list.get(j)) {
					/*
					 * Compares two consecutive numbers in the arraylist list to
					 * find out the smallest among those two.
					 */
					temporary = list.get(i); // assigns the value of list to
												// temporary.
					list.set(i, list.get(j)); // sets the minimum value to the
												// list arraylist.
					list.set(j, temporary); // sets the value of temporary to
											// the new list arraylist.
				}
			}

		}
		for (int i = 0; i < list.size(); i++) {
			/* Using the for loop to print the sorted data. */
			System.out.println(list.get(i));

		}

	}

}
