//Name: Nicholas Drazso
//Date: March 26, 2019
//Program Description: These are various methods that use recursion to compute 

public class Recursion {

	public static void main (String[] args) {
		
		System.out.println(fib(6));
		
	}
	
	//This method will compute the n'th fibonacci number
	public static int fib (int n) {
		
		//The base cases
		if (n == 1 || n == 2) {
			return 1;
		}
		
		//Recalls method within itself to essentially use running total to compute nth number
		else {
			return fib(n-2) + fib(n-1);
		}
	}

	//This method will reverse any given string
	public static String reverse (String s) {
		
		//Base case 
		if (s.length() == 1 || s.length() == 0) {
			return s;
		}
		
		//Takes last letter and concatenates the reverse of a new substring that excludes the old last letter until base case is complete
		else  {
			return s.charAt(s.length()-1) + reverse(s.substring(0, s.length() - 1));
		}
		
	}

	//This method will determine if any given string is spelt the same forward and reversed
	public static boolean isPalindrome(String s) {
		
		//Base case since single letter word is the same forward and reversed
		if (s.length() == 1 || s.length() == 0) {
			return true;
		}
		
		//If the fist index of the string and the last are equal
		if (s.charAt(0) == s.charAt(s.length() - 1)) {
			//recalls method but uses substring that has 'cut off' first and last index until base case is hit
			return isPalindrome(s.substring(1, s.length() - 1));
		}
		
		return false;
	}
	
}
