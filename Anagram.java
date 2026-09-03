package org.techhub.string;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First String: ");
        String s1 = sc.next();

        System.out.print("Enter Second String: ");
        String s2 = sc.next();

        if (isAnagram(s1, s2))
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");
    }

    static boolean isAnagram(String s1, String s2) {

        if (s1.length() != s2.length())
            return false;

        char[] ch = s2.toCharArray();

        for (int i = 0; i < s1.length(); i++) {

            int j;

            for (j = 0; j < ch.length; j++) {

                if (s1.charAt(i) == ch[j]) {
                    ch[j] = '*';   // Mark character as used
                    break;
                }
            }

            if (j == ch.length)
                return false;
        }

        return true;
    }
}