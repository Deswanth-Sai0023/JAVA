import java.util.Arrays;
public class test
{
    public static void sort(int num[])
    {
        int n = num.length;
        for(int i = 0 ; i<n ; i++)
        {
            for(int j = i+1 ; j<n ; j++)
            {
                if(num[i]<num[j])
                {
                    int temp = num[j];
                    num[j] = num[i];
                    num[i] = temp;
                    
                }
            }
        }

    }
    public static void pri(int num[])
    {
        int n = num.length;
        for(int i = 0 ; i<n ; i++)
        {
            System.out.print(num[i] + " ");
        }
    }
    public static void main(String args[])
    {
        int num[] ={3,6,2,1,8,7,4,5,3,1};
// sort(num);
Arrays.sort(num);
int  n = num.length;
for(int i = n -1 ; i>=0 ; i--)
{
    System.out.print(num[i] + " ");
}

// pri(num);
        
    }
}