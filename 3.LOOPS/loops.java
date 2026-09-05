// loops are written in 3 ways -- 
// 1.while
// 2.do - while
// 3.for

// prime number , reverse number , 1-10 , 1-n ,n -1,keep the number ,table , factorial

// --------------1-10 numbers print using while--------------------------
// import java.util.*;
// public class loops{
//     public static void main(String args[]){
//         // 1
//         int n = 1;
//         while(n<11){
//             System.out.println(n);
//             n = n+ 1;};
//         do{
//             System.out.println(n);
//             n = n+ 1;
//         }while(n<=9);
//         for(int i = 1 ; i<11 ; i++){
//             System.out.println(i);}}
// }


// ------------print from 1 to n --------------------------------------
// import java.util.*;
// public class loops{
//     public static void main(String args[]){
//         Scanner scan = new Scanner(System.in);
//         System.out.print("enter the n value : ");
//         int n = scan.nextInt();
//         // while(i<=n){
//         //     System.out.println(i);
//         //     i++;
//         // }
//         // do{
//         //   System.out.println(i);
//         //   i++;
//         // }while(i<=n);
//         for(int i = 1 ; i <=n ; i++){
//             System.out.println(i);
//         }
//     }
// }


// ------------patterns ------------------------------------------------------------
// import java.util.*;
// public class loops{
//     public static void main(String args[]){
//         for(int i = 1 ; i <5 ; i++){
//             for(int j = 1 ; j < 5 ; j++){
//                 System.out.print("*");
//             }
//             System.out.println(" ");}}}

// **** 
// **** 
// **** 
// ****


// ------------from n to 1 ------------------------------------------------
// import java.util.*;
// public class loops{
//     public static void main(String args[]){
//         Scanner scan = new Scanner(System.in);
//         System.out.print("enter the n value : ");
//         int n = scan.nextInt();
//         while(n>0){
//             System.out.println(n);
//             n--;}}}

// ------------ reverse the number ------------------------------------
// public class loops{
//     public static void main(String args[]){
//        int num = 2383762;
//         int rev = 0;
//         while(num>0){
//             int a = num%10;
//             int b = num/10;
//             rev = rev*10  + a ;
//             num = b;
//              }
//              System.out.println(num);}}


// ------------ keep enter the num till it is multiply by 10------------
// import java.util.*;
// public class loops{
//     public static void main(String args[]){
//         Scanner scan = new Scanner(System.in);
//         while(true){
//             System.out.print("enter the number till game ends : ");
//             int n = scan.nextInt();
//             if(n%10 == 0 ){
//                 continue;
//             }
//              System.out.println(n);}}}


// ------------prime number ------------------------------------------------
// import java.util.*;
// public class loops{
//     public static void main(String args[]){
//         Scanner scan = new Scanner(System.in);
//         int num = scan.nextInt();
//         boolean isPrime = true;
//         if(num == 2){
//             isPrime = true;
//         }
//         else{
//         for(int i = 2 ; i < num - 1 ; i++){
//             if(num%i==0){
//                 isPrime= false;
//             }
//         }}
//         if(isPrime){
//             System.out.println("it is prime ");
//         }
//         else{
//             System.out.println("it is not a prime number");
//         }
//     }
// }



// ------------sum of even and odd------------------------------------------------------------
// public class loops{
//     public static void main(String args[]){
//         int sumeven = 0;
//         int sumodd= 0;
//         for(int i = 1 ; i <51 ; i++ ){
//             if(i%2==0){
//                 sumeven += i;
//             }
//             else{
//                 sumodd += i ;
//             }
//         }
//         System.out.println("Sum of even numbers: " + sumeven);
//         System.out.println("Sum of odd numbers: " + sumodd);}}

// ------------factorial ------------------------------------------------------------
// import java.util.*;
// public class loops{
//     public static void main(String args[]){
//         Scanner scan = new Scanner(System.in);
//         int n  = scan.nextInt();
//         int sum = 0 ;
//         int product = 1;
//         for(int i = 1 ; i <= n ; i++){
//                 product = product*i;
                
//         }
//         System.out.print(product);
        
//     }
// }


// ------------multiplication table ------------------------------------------------------------
// import java.util.*;
// public class loops{
//     public static void main(String args[]){
//         Scanner scan = new Scanner(System.in);
//         int n  = scan.nextInt();
//         for(int i = 0 ; i <21 ; i++){
//             System.out.printf("%d x %d = %d\n",n,i,n*i);
//         }
// }}



// ------------------------print prime numbers ------------------------------------------------
// import java.util.*;
// public class loops{
//     public static void main(String args[]){
//         int num = 5 ; 
//           for(int i = 2 ; i <=num ; i++){
//             while(num>0){
//                 if()
//             }
//           }
//     }
// }

// ------------------------reverse the number ------------------------------------------------
// public class loops{
//     public static void main(String args[]){
//         int num = 123476;
//         int count = 0;
//         while(num!=0){
//              num = num/10;
//              count = count + 1 ; 
//         }
//         System.out.println(count);
//     }
// }

// ------------------------palindrome------------------------------------------------
// public class loops{
//     public static void main(String args[]){
//         int n = 121;
//         int b = n ;
//         int revs = 0 ; 
//        while(n!=0){
//         int last = n%10;
//         revs = revs * 10 + last;
//         n = n/10;}
//        System.out.println(b);
//        if(b==revs){
//         System.out.println("palindrome");
//        }
//        else{
//         System.out.println("not palindrome ");
//        }
//  }
// }

//  ------------------------armstrong ------------------------ ------------------------
// import java.util.*;
// public class loops{
//     public static void main(String args[]){
//         System.out.print("enter an number i will tell armstrong or not : ");
//         Scanner scan = new Scanner(System.in);
//         int num = scan.nextInt();
//         int org = num;
//         int sum = 0;
//         while(num!=0){
//             int b = num%10;
//             sum  += b*b*b;
//             num = num/10;
//         }
//         if(sum==org){
//             System.out.printf("%d is an armstrong number\n" , org);
//         }
//         else{
//             System.out.printf("%d is not an  armstrong number\n" , org); 
//        }
//     }
// }


import java.util.*;
public class loops{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int sum = 0;
        while(num!=0){
            int b = num%10;
            sum = sum + b;
            num = num/10;
        }
        System.out.println(sum);
    }

}
