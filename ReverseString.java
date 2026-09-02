/*
 * Reverse a string
 */

package org.techhub.string;
import java.util.*;
public class ReverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = sc.nextLine();
		int start = 0;
		int end = str.length() - 1;
		char[] arr = new char[str.length()];
		for(int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);
		}
		
		while(start < end) {
			char temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			
			start++;
			end--;
		}
		for(int i = 0; i < arr.length;i++) {
			System.out.print(arr[i]);
		}
	}
}
