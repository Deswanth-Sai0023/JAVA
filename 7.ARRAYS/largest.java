public class largest
{
    public static int large(int num[])
    {
        int large1 = num[0];
        for(int i = 1 ; i<num.length ; i++)
        {
            if(num[i] > large1)
            {
                large1 = num[i];
            }
        }
        return large1;
    }
    public static void main(String args[])
    {
        int num[] = {1,9,6,4,3};
        System.out.println(large(num));
    }
}