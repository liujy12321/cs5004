/*
* Problem 3 [20 pts]
* Write a program that finds the transpose of a matrix,
* read from a text file (Problem3.txt)
* The first line in the file will be the dimensions.
* The rest of lines will be the matrix
*
* Input:
* No parameter needed in your method, but there is a txt file 
* you need to download and use for this problem.

* txt file context example:
*   3 4
*   1 2 3 4
*   2 3 5 2
*   0 9 8 -2
* (3 and 4 in the first line represent this is a 3 x 4 matrix)
*
* Output:
* A string represents the transpose of a matrix.
* Each line represents one row and one white space between each two elements.
* Example output string:
* 1 2 0
* 2 3 9
* 3 5 8
* 4 2 -2
*/

import java.io.*;

public class Problem3 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader mybuffer = new BufferedReader(new FileReader("Problem3.txt"));

        //put the data into a string and change to a string array
        String origin = "";
        String line = mybuffer.readLine();
        while(line != null)
        {
            origin += line + " ";
            line = mybuffer.readLine();
        }

        origin = origin.trim();
        String arr[] = origin.split(" ");

        //the first two elements in the array are the dimension of matrix
        int col = Integer.parseInt(arr[0]);
        int row = Integer.parseInt(arr[1]);

        //store the matrix into a new arr[][]
        int arr2[][] = new int [row][col];
        for(int i = 0; i < row; i++)
            for(int j = 0; j < col; j++)
                arr2[i][j] = Integer.parseInt(arr[2 + i + j * row]);

        //print out 
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
                System.out.print(arr2[i][j] + " ");
            System.out.println();
        }
            
            

        mybuffer.close();

    }

}
