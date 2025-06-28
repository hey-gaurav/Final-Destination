/* 
 -When we dont know the size of an array
 -Syntax
    ->  ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<Integer>(); we can write or avoid datatypes
        ArrayList<Integer> list = new ArrayList<>(10); we can also pass default size like 10
        Integer is a Wrapper Class.
- <> Generics is the type of Data which we can store in the list.
-We can also write without Generics
*/
package Array;
import java.util.ArrayList;
public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(5);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(list);
        // Added more than five
    }
}
