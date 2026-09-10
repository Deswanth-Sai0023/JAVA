public class subarray
{
    public static void main(String args[])
    {
        int num[] = {1,2,3,4};
        int n = num.length;
        int max = Integer.MIN_VALUE;
       
        for(int i = 0 ; i<n ; i++)
        {
            for(int j = i ; j<n ; j++){
                 int sum = 0;
                for(int z = i ; z<=j ; z++)
                {
                    sum += num[z];

                }
                System.out.println(sum);
                if(max<sum)
                {
                    max = sum;
                }

                System.out.println();
            }
             System.out.println();
        }
        System.out.print("max sum is " + max);

    }
}