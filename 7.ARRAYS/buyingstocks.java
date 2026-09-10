public class buyingstocks
{
    public static int stocks(int num[])
    {
        int n = num.length;
        int min  = Integer.MAX_VALUE;
        int price = 0 ;
        for(int i = 0 ; i<n ; i++)
        {
            if(min<num[i])
            {
                int profit = num[i]-min;
                price = Math.max(price,profit);
            }
            else{
                min = num[i];
            }
        }
        return price;

    }
    public static void main(String args[])
    {
        // int p[] ={700,456,234,643,657,701};
        // int pri =0;
        // int min = Integer.MAX_VALUE;
        // int n = p.length;
        // for(int i = 0 ; i<n ; i++)
        // {
        //     if(min<p[i])
        //     {
        //         int price = p[i]-min;
        //         pri = Math.max(pri,price);
        //     }
        //     else{
        //         min = p[i];
        //     }
        // }
        // System.out.println(pri);
        int num[] = {7, 6, 5,2,  3, 1};
        int re = stocks(num);
        System.out.println(re);

    }
}


