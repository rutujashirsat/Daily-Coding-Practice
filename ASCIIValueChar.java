package org.techhub.string;
import java.util.*;
public class ASCIIValueChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = sc.nextLine();
		
		for(int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i)+" = "+(int)str.charAt(i));
		}
	}
}
