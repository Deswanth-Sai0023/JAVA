// ------------------------------------------------------------------------
// * 
// ** 
// *** 
// **** 
// ***** s
// public class nested{
//     public static void main(String args[]){
//         for(int i = 5 ; i > 0 ; i-- ){
//             for(int j = i ; j<6 ; j++){
//                 System.out.print("*");
//             }
//  System.out.println(" ");
//         } }}

// ------------------------------------------------------------------------------------------------
// * 
// ** 
// *** 
// **** 
// public class nested{
//     public static void main(String args[]){
//         for(int i = 1 ; i < 5  ; i++ ){
//             for(int j = 1 ; j<=i ; j++){
//                 System.out.print("*");
//             }
//  System.out.println(" ");
//         } }}



// ------------------------------------------------------------------------------------------------
// 1 
// 12 
// 123 
// 1234 
// public class nested{
//     public static void main(String args[])
//     {
//         for(int i = 1 ; i < 5 ; i++){
//             for(int j = 1 ; j < i + 1 ; j++){
//                 System.out.print(j);
//             }
//             System.out.println(" ");
//         }}}


// ------------------------------------------------------------------------------------------------
// **** 
// **** 
// **** 
// public class nested{
//     public static void main(String args[]){
//         for(int i = 1 ; i < 4 ; i++){
//             for(int j = 1 ; j <5 ; j++){
//                 System.out.print("*");
//             }
//             System.out.println(" ");}}}


//  ------------------------------------------------------------------------------------------------
// A 
// BC 
// DEF 
// GHIJ 
// public class nested{
//     public static void main(String args[]){
//         char ch = 'A';
//       for(int i = 1 ; i <5 ;i++){
//         for(int j = 1 ; j<i+1; j++){
//              System.out.print(ch);
//              ch++;
//         }
//          System.out.println(" ");
//       }
//     }
// }

// ------------------------------------------------------------------------------------------------
// 1
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15  
// import java.util.*;
// public class nested{
//     public static void main(String args[]){
//         int num = 1 ; 
//         Scanner scan = new Scanner(System.in);
//         int upto = scan.nextInt();
//         for(int i = 1 ; i < upto ; i++){
//             for(int j = 1 ; j < i+1; j++){
//                 System.out.printf("%d ",num);
//                 num++;
//             }
//             System.out.println(" ");
// }}}


// ------------------------------------------------------------------------------------------------
// ***** 
// *   * 
// *   * 
// ***** 
// public class nested{
//     public static void main(String args[]){
//         for(int i = 1 ; i < 5 ; i++){
//             for(int j = 1 ; j<6 ; j++){
//                 if(i == 1 || i == 4){
//                     System.out.print("*");
//                 }
//                 else if(i == 2 || i == 3){
//                     if(j>1 && j<5){
//                         System.out.print(" ");
//                     }
//                     else{
//                         System.out.print("*");
//                     }
                   
//                 }
              
//             }
//              System.out.println(" ");}}}


// ------------------------------------------------------------------------------------------------
//     * 
//    ** 
//   *** 
//  **** 
// ***** 
// public class nested{
//     public static void main(String args[]){
//         for(int i = 1 ;  i<=5 ; i++){
//           for(int j = 1 ; j<=5;j++){
//             if(j<=5-i){
//                 System.out.print(" ");
//             }
//             else {
//                  System.out.print("*");
//             }
//           }
//            System.out.println(" ");
//         }
//     }
// }

// ------------------------------------------------------------------------------------------------
//    * 
//   *** 
//  ***** 
// ******* 
// public class nested{
//     public static void main(String args[]){
//          for(int i = 1 ; i<=4 ; i++){
//             for(int j = 1 ; j<=4-i ; j++){
//                System.out.print(" ");
//             }
//             for(int j =1 ; j <= 2*i-1 ; j++){
//                  System.out.print("*");
//             }
//              System.out.println(" ");
//          }
//     }
// }


// ------------------------------------------------------------------------------------------------
//    * 
//   *** 
//  ***** 
// ******* 
// ******* 
//  ***** 
//   *** 
//    * 
// public class nested{
//     public static void main(String args[]){
//           for(int i = 1 ; i<=4 ; i++){
//             for(int j = 1 ; j<=4-i ; j++){
//                System.out.print(" ");
//             }
//             for(int j =1 ; j <= 2*i-1 ; j++){
//                  System.out.print("*");
//             }
//              System.out.println(" ");
//          }
//          for(int i = 4 ; i>=1 ; i--){
//             for(int j =1 ; j<=4-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j = 1 ; j<=2*i-1;j++){
//                  System.out.print("*");
//             }

//             System.out.println(" ");
//          }
//     }
// }


// ------------------------------------------------------------------------------------------------
// * 
// ** 
// *** 
// **** 
// **** 
// *** 
// ** 
// * 
// public class nested{
//     public static void main(String args[]){
//         for(int i = 1 ; i <= 4 ; i++){
//             for(int j  = 1 ; j<=i ; j++){
//                  System.out.print("*");
//             }
//             System.out.println(" ");
//         }
//         for(int i = 4 ; i>=1 ; i--){
//             for(int j = 1 ; j<=i ; j++){
//                  System.out.print("*");
//             }
//              System.out.println(" ");
//         }
//     }
// }

// ------------------------------------------------------------------------------------------------
// *      * 
// **    ** 
// ***  *** 
// ******** 
// ******** 
// ***  *** 
// **    ** 
// *      * 
// public class nested{
//     public static void main(String args[]){
//         for(int i =  1  ; i<=4 ; i++){
//             for(int j =  1  ; j<=i;j++){
//                  System.out.print("*");
//             }
//             for(int j = 1 ; j<=2*(4-i);j++){
//                  System.out.print(" ");
//             }
//              for(int j =  1  ; j<=i;j++){
//                  System.out.print("*");}
            
//              System.out.println(" ");
//         }
//         for(int i = 4 ; i>=1 ; i--){
//             for(int j= 1 ; j<=i ; j++ ){
//                  System.out.print("*");
//             }
//             for(int j = 1 ; j<=2*(4-i);j++){
//                  System.out.print(" ");
//             }
//              for(int j= 1 ; j<=i ; j++ ){
//                  System.out.print("*");
//             }
//               System.out.println(" ");
//         }

//     }
// }


// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\
//     ***** 
//    ***** 
//   ***** 
//  *****
// ***** 
// public class nested{
//      public static void main(String args[]){
//           for(int i = 1 ;  i <=5 ; i++){₹
//                for(int j = 1 ; j<=5-i ; j++){
//                      System.out.print(" ");
//                }


//                for(int j = 1 ; j<=5 ; j++){
//                      System.out.print("*");
//                }
//                 System.out.println(" ");
//           }
          
//      }
// }


// ---------------------------------------------------------------------------------------------------------------------
//     *****
//    *   *
//   *   *
//  *   *
// *****
public class nested{
    public static void main(String args[]){
         for(int i = 1 ;  i <=5 ; i++){
               for(int j = 1 ; j<=5-i ; j++){
                     System.out.print(" ");
               }
               for(int j = 1 ; j<=5 ; j++){
                    if(i==1||i==5||j==1||j==5){
                         System.out.print("*");
                    }
                    else{
                         System.out.print(" ");
                    }
               }
                System.out.println(" ");
          }
    }
}
