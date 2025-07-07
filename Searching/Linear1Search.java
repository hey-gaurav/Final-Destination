/* 
 -Best time complexity O(1)         - Only one comparison made  ---Time will be constant whatever the size is.
 -Worst O(n)-All comparison made    - We do not find the item   ---Linearlly time grows with size.
 -We traverse through whole array to find an element
*/

public class Linear1Search {
    public static void main(String[] args) {
        int arr[]={1,2,4,5};
        int target=3;
        int got=Exist(arr,target);
        if (got>0)
        {
            System.out.println("Exists");
        }
        else
        {
            System.out.println("Not");
        }
    }
    static int Exist(int arr[], int target)
    {
        if (arr.length==0)
        {
            return -1;
        }
        for(int i = 0;i<arr.length;i++)
        {
            if (target==arr[i])
            {
                return 1;
            }
        }
        return -1;
    }
}
