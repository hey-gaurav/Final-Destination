package Array;
import java.util.Arrays;
import java.util.Scanner;

public class InputBy4EachLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        //for each loop
        for(int num: arr)
        {
            System.out.println(num);
        }
        // Print using Arrays.toString
        System.out.println(Arrays.toString(arr));

    }
}
