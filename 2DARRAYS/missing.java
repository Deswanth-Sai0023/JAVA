import java.util.*;

public class  missing{
  public static int missing(int nums[])
  {
    int n = nums.length +1;
    int sum = n*(n+1)/2;
    int sum1 = 0;
    for(int i = 0 ; i< nums.length ; i++)
    {
      sum1 += nums[i];
    }
    int result = sum- sum1;
    return result;
  }
    public static void main(String[] args) {
      int nums[] = {1,3,4,5};
      int a = missing(nums);
      System.out.print(a);
      
    }
}