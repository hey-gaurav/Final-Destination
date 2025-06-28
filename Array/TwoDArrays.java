/*
 int [][] arr=new int [rows][cols];
 -rows are mandatory
 1 2 3
 4 5 6
 7 8 9
 - It is an array of arrays
 - arr.length gives size of a row
 */
package Array;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArrays {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[3][2];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        /* 
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        */
        //or 
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}