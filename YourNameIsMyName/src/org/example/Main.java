package org.example;

import java.util.Scanner;

public class Main {
    // isValidSubsequence Method
    //  Checks to see if the names are subsequences of each other by comparing the characters w/recursion:
    public static boolean isValidSubsequence(String firstName, String secondName, int firstNameLength, int secondNameLength) {
        // Check if lengths are 0, and return the proper boolean:
        //  firstNameLength hits 0 first if it is a valid subsequence.
        //  secondNameLength hits 0 first if it is not a valid subsequence.
        if(firstNameLength == 0) {
            return true;
        }
        if(secondNameLength == 0) {
            return false;
        }

        // Check if the last two characters of the names match:
        if(firstName.charAt(firstNameLength - 1) == secondName.charAt(secondNameLength - 1)) {
            // If matches, decrement the lengths and use recursion to continue checking:
            return isValidSubsequence(firstName, secondName, firstNameLength - 1, secondNameLength - 1);
        }else {
            // If no match, decrement the secondNameLength only and use recursion to continue checking:
            return isValidSubsequence(firstName, secondName, firstNameLength, secondNameLength - 1);
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get number of test cases:
        int tests = scanner.nextInt();

        // Iterate through test cases:
        for(int x = 0; x < tests; x++) {
            // Get names through single input separated w/spaces:
            String[] names = {scanner.next(), scanner.next()};

            // Get length of names:
            int nameOneLength = names[0].length();
            int nameTwoLength = names[1].length();

            // Check if names are subsequences of each other:
            boolean isSubsequence1 = isValidSubsequence(names[0], names[1], nameOneLength, nameTwoLength);
            boolean isSubsequence2 = isValidSubsequence(names[1], names[0], nameTwoLength, nameOneLength);

            // Check if either name was a subsequence of the other:
            if(isSubsequence1 || isSubsequence2) {
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }


}
