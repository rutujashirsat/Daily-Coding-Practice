/*
 * Check palindrome string
 */

package org.techhub.string;
import java.util.*;
public class PalindromeString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = sc.next();
		
		char[] arr = new char[str.length()];
		for(int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);
		}
		
		int start = 0;
		int end = str.length()-1;
		
		while(start < end) {
			if(str.charAt(start) != str.charAt(end)) {
				System.out.println("String not palindrome");
				
				return; 
			}
			start++;
			end--;
		}
		System.out.println("String is palindrome");
	}
		
}
