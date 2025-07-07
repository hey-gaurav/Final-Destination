public class LinearSearchInString {
    public static void main(String[] args) {
        String Name="Gaurav";
        char Target='a';
        System.out.println(Charexist(Name, Target));
    }
    static boolean Charexist(String str, char target)
    {
        if (str.length()==0)
        {
            return false;
        }
        for(int i=0;i<str.length();i++)
        {
            if (target==str.charAt(i))
            {
                return true;
            }
        }
        return false;
    }
}
