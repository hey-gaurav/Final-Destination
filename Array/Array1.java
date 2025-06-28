/*============Notes=============
*All data type should be same
*collection of related datatype
*To keep similar datypes
*Array is continuos memory allocation in C and C++
* Each element of aan array is an object.
* In java there is no pointer!! So, it totally depend on Jvm  Whether it is continuos or not. //Only Primitives are continuous not objects
(Since it is stored in Heap and it is mentioned in JLSP that heap objects are not continuous) , So Array might not be continuos in JAVA.
* Index starts from 0.
* New keyword is used to Create an object. or Use {1,2,3}
* Any ref variable will have bydefault value to be null until initialized.
* Primitives are stored in Stack memory and classes and objects are stored in heap memory.
* Primitives are those which cannot be broken down further. 
*Print using-----
1. For loop
2. For each loop
3. Arrays.toString method // The best one 
* In java there is only call by value
==Declaration
--> Datatype[] variable_name= new Datatype[Size] 

ex: int[] roll=new int[5];
    or 
    int[] rollno={1,2,3,4,5};
    here rollno is ref variable that points to the array object of type integer

    int[] rollno; //Declaration , ->Rollno is defined in the stack, Happens at compile time
    rollno=new int[5]; //Initialization,  ->Object is being created in heap, Happens at Run time(Dynamic Memory Allocation)
    -> How to get value at index??
    *sysout(rollno[0]);
    
*/
package Array;

public class Array1 {
    public static void main(String[] args) {
        int[] arr=new int[5];
        arr[0]=5;   
        System.out.println(arr[0]); // will give 0. if not initialized by 5
        // for integer if there is no value then default value is 0.
        //for String if there is no value then default value will be null.(Where null is a literal)
        /* We can do 
        String str=null;
        but no to int  */
    }

}
