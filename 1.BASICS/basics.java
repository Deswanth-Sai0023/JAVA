// 🟢 Basic

// 1. Student Information
// Create variables to store:

// Your name
// Age
// College name
// CGPA
// Whether you are a student (true/false)

// Print all the values.
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
