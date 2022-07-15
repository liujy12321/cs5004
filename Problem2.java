/**
 * Problem 2 [10pts]
 * Define an integer array with length as 6,
 * then double the element value which is at odd index.
 * Input: Integer array
 * Output: Integer array
 * Example: {1, 2, 3, 4, 5, 6} -> {1, 4, 3, 8, 5, 12}
 */

import java.util.Scanner;


public class Problem2 {
    public static void main(String[] args) {
        int[] arr = new int[7];
        Scanner myScanner = new Scanner(System.in);
        for(int i = 1; i <= 6; i++)
            arr[i] = myScanner.nextInt();

        for(int i = 1; i <= 6; i++)
            if(i % 2 == 0)
                arr[i] = arr[i] * 2;
            

        for(int j = 1; j <= 6; j++)
            System.out.print(arr[j] + " ");

        myScanner.close();
    }

}
