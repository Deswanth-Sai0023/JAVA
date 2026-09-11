import java.util.*;
public class search
{
    // public static int search(int matrix[][], int key)
    // {
    //     int n = matrix.length;
    //     int m = matrix[0].length;
    //     for(int i = 0 ; i<n ; i++)
    //     {
    //         for(int j = 0 ; j<m ; j++)
    //         {
    //             if(matrix[i][j]==key)
    //             {
    //                 System.out.println("found at (" + i+ ","+  j +")");
    //                 return 1;
    //             }
    //         }
    //     }
    //     System.out.println("not found");
    //     return -1;
    // }
    public static void main(String args[])
    {
        int matrix[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i = 0 ; i<n ; i++)
        {
            for(int j = 0 ; j<m ; j++)
            {
                matrix[i][j] = sc.nextInt();

            }}
        for(int i = 0 ; i<n ; i++)
        {
            for(int j = 0 ; j<m ; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // search(matrix,5);
        
        


    }
}