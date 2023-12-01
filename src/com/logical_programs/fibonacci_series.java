package com.logical_programs;

import java.util.Scanner;

public class fibonacci_series {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms for Fibonacci series: ");
        int n = scanner.nextInt();

        System.out.println("Fibonacci series up to " + n + " terms:");

                                            // Loop to generate and print Fibonacci series
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        scanner.close();
    }

                       // Recursive method to calculate Fibonacci number at a given position
    static int fibonacci(int position) {
                             // Base case: Return the position itself if it's 0 or 1
        if (position <= 1) {
            return position;
        }

        // Recursive call to calculate Fibonacci number
        return fibonacci(position - 1) + fibonacci(position - 2);
    }
}

