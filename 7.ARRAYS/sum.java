public class sum
{ 
    public static int sum(int num[])
    {
      int max = Integer.MAX_VALUE;
      int sum = 0;
      for(int i = 0 ; i<num.length ; i++)
      {
        sum += num[i];
      }
      return sum;
    }
    public static void main(String args[])
    {
        int num[] = {1,2,3,4,5,6};
        System.out.println(sum(num));
    }
}