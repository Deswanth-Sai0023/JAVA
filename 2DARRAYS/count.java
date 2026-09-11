public class  sum{
    public static int count(int nums[][],int key)
    {
        int count = 0 ; 
        int n = nums.length;
        int m = nums[0].length;
        for(int i = 0 ; i<n ; i++)
        {
            for(int j = 0 ; j<m ; j++)
            {
                if(nums[i][j]==key)
                {
                    count++;
                    System.out.printf("(%d,%d)",i,j);
                }
            }
            System.out.println();
        }
        System.out.println(count);
        return count;
    }

    public static void main(String args[])
    {
        int nums[][] = {{4,7,8},{8,8,7}};
        count(nums,7);
    }
}