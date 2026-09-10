public class heigths
{
    public static void main(String args[])
    {
        int heigths[] = {0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1};
        int n = heigths.length;
        // left 
        int left[] = new int[n];
        left[0] = heigths[0];
        for(int i = 1 ; i<n ; i++)
        {
            left[i] = Math.max(left[i-1],heigths[i]);
        }

        // rigth
        int right[] = new int[n];
        right[n-1] = heigths[n-1];
        for(int i = n-2 ; i>=0 ; i--)
        {
            right[i] = Math.max(right[i+1],heigths[i]);
        } 
        // loops
        int area  = 0;
        for(int i = 0 ; i<n ; i++)
        {
            area += Math.min(left[i],right[i])-heigths[i];
        }
        System.out.println(area);
    }
}