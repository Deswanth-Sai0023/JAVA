public class transpose
{
    public static int[][] transpose(int nums[][])
    {
        int n = nums.length;
        int m = nums[0].length;
        int transpose[][] = new int[m][n];
        for(int i = 0 ; i<m ; i++)
        {
            for(int j = 0 ; j<n ; j++)
            {
                transpose[i][j] = nums[j][i];
            }
        }
         for(int i = 0 ; i<m ; i++)
        {
            for(int j = 0 ; j<n ; j++)
            {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
        return transpose;
    }

    public static void main(String args[])
    {
       
        int nums[][] = {{1,2,3,4},{5,6,7,8},{9,0,1,2}
        };
        transpose(nums);

    }
}