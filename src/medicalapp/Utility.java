package medicalapp;

import java.util.*;

public class Utility {

	static String generateID() {

		return generateID(9);
	}

	private static String generateID(int size) {

		// char[] arr = "abcdefghijklkmopqrstuvwxyz0123456789".toCharArray();
		char[] arr = "0123456789".toCharArray();

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < size; i++) {
			int index = (int) (Math.random() * arr.length);
			sb.append(arr[index]);
		}

		return sb.toString();
	}
	
	static String[][] to2DArray(ArrayList<Object> list) {

		String[][] data = new String[list.size()][];
		int size = list.size();

		for (int i = 0; i < size; i++) {

			data[i] = (String[]) list.get(i);
		}

		return data;
	}

	public static void main(String[] args) {

		for (int i = 0; i < 30; i++) {
			System.out.println(Utility.generateID());
		}
	}
}
