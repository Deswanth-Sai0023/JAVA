public class sorting
{
    public static void sort(int num[])
    {
        int n = num.length;
        for(int i = 0 ; i<n-1; i++)
        {
            int a= i;
            for(int j = 1+i ; j<n; j++){
            int b = j;
                if(num[a]>num[b])
                {
                    int temp  = num[a];
                    num[a] = num[b];
                    num[b] =temp;
                }
            }
        }

    }
    public static void pri(int num[])
    {
        int n = num.length;
        for(int i = 0 ; i<n ; i++)
        {
            System.out.printf("%d\t", num[i]);
        }
    }

    // 

    public static void main(String args[])
    {
        int num[] = {6,8,2,7,3};
        sort(num);
        pri(num);
        System.out.print(num[-1]);


    }
}