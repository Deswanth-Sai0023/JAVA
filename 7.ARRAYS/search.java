public class search
{
    public static int linear(int num[],int key)
    {
        int n = num.length;
        for(int i =0 ; i<n ; i++)
        {
            if(num[i]==key)
            {
                return i;
            }
        }
        return -1;
    }

    public static int bineary(int num[] ,int key)
    {
        int n = num.length;
        int start = 0 , end = n-1;
        for(int i = 0 ; i<n ; i++)
        {
            int mid = (start+end)/2;
            if(num[mid]==key)
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
        int num[]= {4,  5, 6, 7, 0, 1, 2};
        int key = 0;
        // int result = linear(num,key);
        int result =bineary(num,key);
        if(result == -1 )
        {
            System.out.println("not found");
        }
        else{
            System.out.println("found at "+ result);
        }

    }
}