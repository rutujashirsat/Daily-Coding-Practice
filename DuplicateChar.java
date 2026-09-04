package org.techhub.string;

import java.util.Scanner;

public class DuplicateChar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {

            int count = 1;

            // Skip if character already appeared before
            for (int k = 0; k < i; k++) {
                if (str.charAt(i) == str.charAt(k)) {
                    count = 0;
                    break;
                }
            }

            if (count == 0)
                continue;

            // Count occurrences
            count = 1;

            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j))
                    count++;
            }

            if (count > 1 && str.charAt(i) != ' ')
                System.out.println(str.charAt(i));
        }
    }
}