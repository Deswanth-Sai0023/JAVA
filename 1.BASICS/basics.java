// 🟢 Basic

// 1. Student Information
// Create variables to store:

// Your name
// Age
// College name
// CGPA
// Whether you are a student (true/false)

// Print all the values.
// Using arithmetic operators, find how many:

// ₹2000 notes
// ₹500 notes
// ₹100 notes
// ₹50 notes
// ₹20 notes
// ₹10 notes
// Remaining amount

// public class basics{
//     public static  void main(String args[]){
// int amount = 2876;
//    System.out.println("2000₹ notes are = " + amount/2000);
//    amount %= 2000;

//    System.out.println("500₹ notes are = " + amount/500);
//    amount %=500;

//    System.out.println("100₹ notes are = " + amount/100);
//    amount %=100;

//    System.out.println("50₹ notes are = " + amount/50);
//    amount %=50;
//    System.out.println("10₹ notes are = " + amount/10);
//    amount %= 10;
//    System.out.println("the remaining notes/coins are = " + amount);

//      }
// }

// public class basics{
//     public static void main(String argd[]){
//        int totalSeconds = 7384;
//        int a = totalSeconds/3600;
//        int b = totalSeconds%3600;
//        int c = b/60;
//        int d = totalSeconds%60;
//        System.out.println(a);
//        System.out.println(c);
//        System.out.println(d);
//     }
// }
import java.util.*;
public class basics{
    public static void main(String args[]){
      Scanner scan = new Scanner(System.in);
      int f = scan.nextInt();
         System.out.println(f);
       int number = 583;
       int a = number%100;
        int c = a/10;
       int b = a%10;
       int d = number/100;
        System.out.println("first digit is  "+d);
        System.out.println("second digit is " +c);
       System.out.println("last digit is " + b);
       System.out.println("sum is " +(b+c+d));
       System.out.printf("sum is %d\n",b);
    }
}
