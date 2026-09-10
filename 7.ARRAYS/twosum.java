public class twosum
{
    public static void main(String args[])
    {
        int num[] = {1,2,3,4,5,6};
        int target = 11;
        for(int i = 0 ; i<num.length ; i++)
        {
            for(int j = i+1 ; j<num.length ; j++)
            {
                if(num[i]+num[j]==target)
                {
                    System.out.printf("[%d,%d]\n",i,j);
                }
            }
        }
    }
}