import java.util.*;
public class input
{
    public static void input(int num[])
    {
        int i = 0;
       Scanner sc = new Scanner(System.in);
       for(i = 0 ; i<num.length ; i++)
       {
        num[i] = sc.nextInt();
       }
    }
    public static void main(String args[])
    {
        int num[] = new int[6];
        input(num);
        int sum = 0;
        for(int i = 0 ; i<6 ; i++)
        {
           sum += num[i];
        }
        System.out.print(sum);

    }
}