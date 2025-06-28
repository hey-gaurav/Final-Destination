package Array;

import java.util.Scanner;

//How to take input
public class Input {
    public static void main(String[] args) {
        System.out.println("Input an array: ");
        Scanner sc=new Scanner(System.in);

        // Array of primitives
        int arr[]=new int[5];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
