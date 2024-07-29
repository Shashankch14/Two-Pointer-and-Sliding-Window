// Given two arrays arr1[0…m-1] and arr2[0..n-1], and a number x, the task is to find the pair arr1[i] + arr2[j] such that absolute value of (arr1[i] + arr2[j] – x) is minimum.

// Example: 

// Input: arr1[] = {1, 4, 5, 7};
// arr2[] = {10, 20, 30, 40};
// x = 32
// Output: 1 and 30
// Input: arr1[] = {1, 4, 5, 7};
// arr2[] = {10, 20, 30, 40};
// x = 50
// Output: 7 and 40

/*package whatever //do not write package name here */

import java.io.*;

import java.util.Scanner;

class GFG {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] a = new int[n + 1];
        int[] b = new int[n + 1];

        int i = 1;
        while (i <= n) {
            a[i] = scanner.nextInt();
            i++;
        }

        i = 1;
        while (i <= n) {
            b[i] = scanner.nextInt();
            i++;
        }

        int y = scanner.nextInt();
        int first = 0;
        int second = 0;
        int v = 0;
        int j = n;
        i = 1;
        int kk = 0;
        while (i <= n && j >= 1) {

            if (a[i] + b[j] <= y) {

                int sum = a[i] + b[j];
                if (sum > v) {
                    v = sum;
                    first = a[i];
                    second = b[j];
                }

                i = i + 1;
            } else {
                j = j - 1;
            }
        }

        System.out.println(v);
    }
}
