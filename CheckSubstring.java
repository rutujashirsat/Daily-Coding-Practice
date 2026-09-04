package org.techhub.string;
import java.util.Scanner;

public class CheckSubstring {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Main String: ");
        String str = sc.nextLine();

        System.out.print("Enter Substring: ");
        String sub = sc.nextLine();

        for (int i = 0; i <= str.length() - sub.length(); i++) {

            int j;

            for (j = 0; j < sub.length(); j++) {

                if (str.charAt(i + j) != sub.charAt(j))
                    break;
            }

            if (j == sub.length()) {
                System.out.println("Substring Found");
                return;
            }
        }

        System.out.println("Substring Not Found");
    }
}