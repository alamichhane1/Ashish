package chapter10;

public class Check {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Exercise10_03 number = new Exercise10_03(19);
		
		System.out.println(number.getInteger());
		
		System.out.println(number.isEven());
		System.out.println(number.isOdd());
		System.out.println(number.isPrime());
		
		System.out.println(Exercise10_03.isEven(6));
		System.out.println(Exercise10_03.isOdd(7));
		System.out.println(Exercise10_03.isPrime(11));
		
		System.out.println(Exercise10_03.isEven(number));
		System.out.println(Exercise10_03.isOdd(number));
		System.out.println(Exercise10_03.isPrime(number));
		
		System.out.println(number.equals(9));
		System.out.println(number.equals(13));
		
		char[] a = {1,2,3};
		System.out.println(Exercise10_03.parseInt(a));
		
		
		String name = new String();
		name = "1234";
		System.out.println(Exercise10_03.parseInt(name)); 
	}
	
}
