
public class diagonalsum {
  public static void diagonalsum(int nums[][])
  {
    int n = nums.length;
    int m = nums[0].length;
    int firstDiagonalSum = 0;
    int secondDiagonalSum = 0;

    for(int i = 0 ; i<n ; i++)
    {
      for(int j = 0 ; j<m ; j++)
      {
        if(i == j)
        {
          firstDiagonalSum += nums[i][j];
        }
        if(i + j == m - 1)
        {
          secondDiagonalSum += nums[i][j];
        }
      }
    }

    System.out.println("First diagonal sum is: " + firstDiagonalSum);
    System.out.println("Second diagonal sum is: " + secondDiagonalSum);
  }
    public static void main(String[] args) {
      int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
      diagonalsum(matrix);
      
    }
}