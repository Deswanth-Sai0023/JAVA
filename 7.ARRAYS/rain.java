public class rain
{
    public static void main(String args[])
    {
        int h[] = {2,5,7,8,0,6};
        int n = h.length;
        // left high
        int left [] = new int[n];
        left[0] = h[0];
        for(int i = 1 ; i<n ; i++)                                
        {
            left[i] = Math.max(left[i-1],h[i]);
        }

        // rigth high
        int right[] = new int[n];
        right[n-1] = h[n-1];
        for(int i = n-2 ; i>=0 ; i--)
        {
            right[i] = Math.max(h[i],right[i+1]);
        }

        // loops
        int water = 0 ;
        for(int i = 0 ; i<n ; i++)
        {
            water += Math.min(left[i],right[i]) - h[i];
        }
        System.out.print(water);
    }
}