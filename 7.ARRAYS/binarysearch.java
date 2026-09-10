public class binarysearch
{
    public static int binary(int[] num , int key)
    {
        int n = num.length;
        int start = 0;
        int end = n-1;
        for(int i = 0 ; i<n ; i++)
        {
            int mid = (start+end)/2;
            if(num[mid] == key)
            {
                return mid;
            }
            else if(num[mid]<key)
            {
                start += 1;
            }
            else{
                end +=1;
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        int num[] = {1,2,3,4,19,6,9,8};
        int key = 6;
        int result = binary(num,key);
        if(result == -1)
        {
            System.out.println("not found ");
        }
        else{
            System.out.println("found at " + result);
        }
    }
}