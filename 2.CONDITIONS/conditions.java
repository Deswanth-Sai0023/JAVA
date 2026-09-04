// import java.util.*;
// public class conditions{
    // public static void main(String args[]){
    //     Scanner scan = new Scanner(System.in);
    //     int a = scan.nextInt();
    //    int b = scan.nextInt();
    //    if(a>b){
    //     System.out.println("the largest num is = " + a);
    //    }
    //    else{
    //     System.out.println("the largest num is = " + b);
    //    }
    // }
// }

// even or odd

// import java.util.*;
// public class conditions{
//     public static void main(String args[]){
//         Scanner scan = new Scanner(System.in);
//         long num = scan.nextLong();
//         if(num%2==0){
//             System.out.println("Even");
//         }
//         else{
//             System.out.println("odd");
//         }
//     }
// }.        orrrrr
// public class conditions{
//     public static void main(String args[]){
//         int num = 22;
//         String what = (num%2==0)?"even":"odd";
//         System.out.println(what);
//     }
// }


// --------income tax---------

// import java.util.*;
// public class conditions{
//     public static void main(String args[]){
//         Scanner scan = new Scanner(System.in);
//         int income = scan.nextInt();
//         int tax;
//         if(income<500000){
//             tax = 0;
//         }
//         else if(income<1000000 && income>=500000){
          
//             tax = (int) (income*0.2);
//         }
//         else{
            
//             tax =(int)(income * 0.3);
//         }
//         System.out.println("Tax = " + tax);
//     }
// }


// ----------largest of 3----------

// import java.util.*;
// public class conditions{
//     public static void main(String args[]){
//         Scanner scan = new Scanner(System.in);
//         int a = scan.nextInt();
//         int b = scan.nextInt();
//         int c = scan.nextInt();
//         int d ;
//         if(a>b && a>c){
//              d = a;
//         }
//         else if(b>c){
//             d = b;
//         }
//         else{
//             d = c;
//         }
//         System.out.println("the largest out of 3 is " + d);
//     }
// }

// -----------calculator------------
// public class conditions{
//     public static void main(String args[]){
//         int a = 130,b = 23;
//         char operator = '/';
//         switch(operator){
//             case '+':
//                 System.out.println(a+b);
//                 break;
//             case '-':
//                 System.out.println(a-b);
//                 break;
//             case '*':
//                 System.out.println(a*b);
//                 break;
//             default:
//                 System.out.println(a%b);
//         }
//     }
// }


// public class conditions{
//     public static void main(String args[]){
// int num = 88;
// int a = num%100;
// int b = a/10;//secont - last
// int c = a%10; //last
// if(num%c==0){
// System.out.println("kjbefkjbjk");
// }

//     }}

// public class conditions {
//     public static void main(String[] args) {
        
//        int[] num = {2,7,11,15};
//        int target = 9;


// for(int i = 0 ; i<num.length;i++){
//     for(int j = i+1 ; j<num.length ; j++){
//         if(num[i]+num[j]==target){
//             System.out.println(i + ","+j);
//         }
//     }
// }
//     }
// }

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int original = x;
        int reversed = 0;

        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        return original == reversed;
    }
}
