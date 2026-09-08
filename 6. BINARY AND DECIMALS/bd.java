// ======================================binary to decimal=========================================================


// public class binadec{
//     public static int decimal(int b){
//         int pow =0;
//         int deciml = 0 ;
//         while(b!=0){
//             int last = b%10;
//             deciml += last*(int)(Math.pow(2,pow));
//             pow++;
//             b = b/10;
//         }
//         System.out.println(deciml);
//         return deciml;
//     }
//     public static void main(String args[]){
//         decimal(101);
//         decimal(10011);
//     }
// }

// ======================================decimal to binary=========================================================

// public class binadec
// {
//     public static int binary(int n)
//     {
//        int pow =0;
//        int binary =0;
//        while(n!=0)
//        {
//         int last = n%2;
//         binary += last*(int)(Math.pow(10,pow));
//         pow++;
//         n = n/2;
//        }
//        System.out.println(binary);
//        return binary;
//     }

//     public static void main(String args[]){
//         binary(7);
//         binary(19);
//     }
// }


// ==================================================================================================================
// 1 
// 23 
// 456 
// 78910 
// 1112131415 
// public class binadec{
//     public static void main(String args[]){
//         int num= 1;
//         for(int i = 1; i<=5 ; i++){
//             for(int j = 1 ; j<=i ; j++){
//                 System.out.print(num);
//                 num++;
//             }
//             System.out.println(" ");
//         }
//     }
// }


// ==================================================================================================================\
// public class binadec{
//     public static void main(String args[]){
//         int pow =0;
//         int decimal = 0;
//         int binary = 10110;
//         int temp = binary;
//         while(binary!=0){
//             int last = binary%10;
//             decimal += last*(int)Math.pow(2,pow);
//             pow++;
//             binary /= 10;
//         }
//         System.out.printf("the binary number of %d in decimal id %d\n",temp,decimal);
//     }
// }

// ««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««\
// public class binadec{
//     public static void main(String args[]){
//         int pow = 0;
//         int binary = 0;
//         int decimal = 348;
//         int temp = decimal;
//         while(decimal!=0){
//             int last = decimal%2;
//             binary += last*(int)Math.pow(10,pow);
//             pow++;
//             decimal /=2;
//         }
//         System.out.printf("the decimal number of %d in binary id %d\n",temp,binary);
//     }
// }


// import java.util.*;
// public class binadec
// {
//     public static void main(String args[])
//     {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i = 1 ; i<=n ; i++)
//         {
//             for(int j= 1 ;j<=(n-i);j++ )
//             {
//                 System.out.print(" ");
//             }
//             for(int j = 1 ; j<=n ; j++)
//             {
//                 if(i==1||i==n ||j ==1||j == n)
//                 {
//                      System.out.print("*");
//                 }
//                 else{
//                      System.out.print(" ");
//                 }
//             }
//              System.out.println(" ");
//         }
//     }
// }
// public static void main(String args[])
// {
//     for(int i = 1 ; i<=4 ; i++)
//     {
//         for(int j = 1 ; j<=i; j++)
//         {
//             System.out.print("*");
//         }
//         for(int j = 1 ; j<=2*(4-i);j++)
//         {
//              System.out.print(" ");
//         }
//         for(int j = 1 ; j<=i ; j++)
//         {
//              System.out.print("*");
//         }

//         System.out.println(" ");
//     }
// }
// }

import java.util.*;

public class binadec
{
	public static void main (String[] args) 
	{
		
		int n =5;
		
		for(int i=1;i<=n;i++)
		{
			for( int j=i;j>=1;j--)
			{
				System.out.print(j);
			}
			for(int k=2;k<=i;k++)
			{
				System.out.print(k);
			}
			System.out.println();
		}
	}
}
