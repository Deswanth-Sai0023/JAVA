import java.util.*;
public class g
{
    public static void main(String args[])
    {
       String s;
       Scanner sc = new Scanner(System.in);
       s = sc.nextLine();
       if(s.isEmpty())
       {
        System.out.println("you did not enter yoour name🤖");
       }
       else
       {
        System.out.println("hello "+ s);
       }
    }
}