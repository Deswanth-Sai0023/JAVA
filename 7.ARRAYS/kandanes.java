public class kandanes
{
    public static void main(String args[])
    {
        int num[] = {1,2,-3,-4,-5,6};
        int sum =0;
        int n = num.length;
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i<n ; i++)
        {
            sum = sum+num[i];
           
            if(sum<0)
            {
                sum = 0;
            }
             max = Math.max(max,sum);
        }
        System.out.print(sum);

    }
}