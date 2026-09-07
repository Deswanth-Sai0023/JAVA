// import java.util.*;
// public class functions{
//     public static void call(int a,int b , int c){
//         System.out.println("hi guru");
//         int total = a+b+c;
//         int avg = total/3;
//         System.out.printf("the total is  %d\n" , total);
//          System.out.printf("the average is  %d\n" , avg);
//     }
//     public static void main(String args[]){
//         int a,b,c ;
//         System.out.print("enter the marks of 3 subjects : ");
//         Scanner scan = new Scanner(System.in);
//         a = scan.nextInt() ;
//         b = scan.nextInt() ;
//         c = scan.nextInt();
//         call(a,b,c);
//     }
// }


// ----------------------------------------------swaping-----------------------------------------------------------------------
// import java.util.*;
// public class functions{
//     public static void swap(int a , int b){
//         int temp = a ; 
//         a = b;
//         b = temp;
//         System.out.printf("after swaping a = %d and b = %d ",a,b);
//     }
//     public static void main(String args[]){
//         Scanner scan = new Scanner(System.in);
        
//         swap(scan.nextInt(),scan.nextInt());
//     }
// }

// ----------------------------------------------product----------------------------------------------
// import java.util.*;
// public class functions{
//     public static void product(Double a , Double b){
//         System.out.println("the product is " + a*b);
//     }
//     public static void main(String args[]){
//         System.out.println("enter two numbers to product them : ");
//        Scanner sc = new Scanner(System.in);
//        product(sc.nextDouble(),sc.nextDouble());
//     }
// }


// ----------------------------------------------factorial ----------------------------------------------
// public class functions{
//     public static int fact(int n){
//         int pro = 1;
//         int i = 1;
//         // for(int i = 1 ; i<=n;i++){
//         //       pro = pro*i;
//         // }
//         while(i<=n){
//             pro = pro*i;
//             i++;
//         }
//         return pro;
//     }
//     public static void main(String args[]){
//         int a = fact(5);
//         System.out.println(a);
//     }
// }

// ----------------------------------------------binomial coefficient ----------------------------------------------
// public class functions{
//         public static int fact(int n){
//         int pro = 1;
//         for(int i = 1 ; i<=n;i++){
//               pro = pro*i;
//         }
//         return pro;
//         }
//        public static int binomial(int a , int b , int c){
//         int d = a/(b*c);
//         return d;
//        }
//         public static void main(String args[]){
//              int a = fact(5);
//            int b = fact(2);
//            int c = fact(3);
//             int result = binomial(a,b,c);//here a,b,c are arguments
//             System.out.println(result);
//         }
// }

// ----------------------------------------------sum of number using functions----------------------------------------------
// public class functions{
//     public static int sum(int n){
//        int sum = 0;
//        int i = 1;
//        while(i<=n){
//         sum = sum+i;
//         i++;
//        }
//        return sum;
//     }

//     public static void main(String args[]){
//         int a = sum(5);
//         System.out.println(a);
//     }
// }

// ----------------------------------------------prime number ----------------------------------------------
// public class functions{
//     public static boolean prime(int n ){
//         boolean isprime = true;
     
        
//             for(int i = 2 ; i<=(n-1);i++){
//                 if(n%i==0){
//                     isprime = false;
                   
//                 }
//             }
//             return isprime;
//             }

//     public static void main(String args[]){
//                    System.out.println(prime(2));
//                 }
// }


// ----------------------------------------------factors--------------------------------------------------------------------------------------------
// public class functions{
//     public static int fact(int n){
//         int i;
//         for(i = 1 ; i<=n ;i++){
//             if(n%i==0){
//                 System.out.println(i);
//             }
//         }
//         return i;
//     }

//     public static void main(String args[]){
//         fact(5);
//         fact(6);
//     }
// }

// ----------------------------------------------print prime number upto n ----------------------------------------------
// public class functions{
//     public static boolean iprime(int n ){
//         boolean isprime = true;
//             for(int i = 2 ; i<=(n-1);i++){
//                 if(n%i==0){
//                     isprime = false;
                   
//                 }
//             }
//             return isprime;
//             }
//     public static void prime(int n){
//         for(int i = 2 ;i<=n;i++){
//             if(iprime(i)){
//                 System.out.println(i);
//             }
//         }
//     }

//     public static void main(String args[]){
//         prime(23);
//     }
// }


// ------------------------------------------------bn to decimal num----------------------------------------------
// public class functions{
//     public static int binary(int bn){
//         int pow = 0;
//         int decimal = 0;
//         int temp = bn;
//         while(bn!=0){
//              int last = bn%10;
//              decimal = decimal + (int)(last*(Math.pow(2,pow)));
//              bn = bn/10;
//              pow++;
//         }
//         System.out.printf("the binary is %d for that decimal is %d",temp,decimal);
//         return decimal;
//     }
//     public static void main(String args[]){
//          binary(101);
//     }
// }



// ------------------------------------------------decimal num to binary num----------------------------------------------
// public class functions{
//     public static int decimal(int n){
//         int binary = 0;
//         int pow = 0;
//         while(n!=0){
//             int rem = n%2;
//             binary += rem*(int)Math.pow(10,pow);
//             n = n/2;
//             pow++;
//         }
//         System.out.print(binary);
//         return binary;
//     }
//     public static void main(String args[]){
//         decimal(7);
//         decimal(12);
//         decimal(19);
//     }
// }
/* package whatever; // don't place package name! */

