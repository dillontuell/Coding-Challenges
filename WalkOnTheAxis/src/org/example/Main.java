package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get number of test cases:
        int tests = scanner.nextInt();

        // Iterate through test cases:
        for(int x = 0; x < tests; x++) {

            // Get number of lights that are on:
            int lightsOn = scanner.nextInt();

            // Set steps:
            int steps = 0;

            // Iterate through turning lights off:
            //  We add 1 to each iteration to include the additional light
            //  since we start at [0,0] on an array and the right-most light
            //  is [n,0], making one additional light be turned off--requiring
            //  more steps to be taken.
            while(lightsOn > 0) {
                steps += lightsOn + 1;
                lightsOn--;
            }

            // Print out the steps after turning all the lights off:
            System.out.println(steps);
        }
    }
}