/*
 - In Java there is Pass by Value only
 - In below example both arrays point to same in memory and after changing it changed the value at 0 index to 99 this is known as Mutability.
 - Arrays are Mutable in Java.
 - Which means we can change the object
 -
 */
package Array;

public class PassingInFunction {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        System.out.println(arr[0]);
        Change(arr);
        System.out.println(arr[0]);
    }
    static void Change(int [] nums)
    {
        nums[0]=99;
    }
}
