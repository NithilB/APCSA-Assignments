/* Programmer:
   Date:
   Project: DisplayTriangle
   File Name: DisplayTriangle.java
   Program Description: This program will print a pyramid of stars
*/


import java.util.*;


public class DisplayTriangle {

 public static void main(String [] args) {
  Scanner keyboard = new Scanner(System.in);
  int number;
  String nice;

  System.out.println("Enter a non-negative integer");
  number = keyboard.nextInt();

  System.out.println("Enter a string");
  nice = keyboard.nextLine();
  System.out.println(nice);

  while (number <= 0) {
    System.out.println("Enter a non-negative integer");
    number = keyboard.nextInt();
  }

  /* Start code here - the variable number will contain an integer
     make sure it is non-negative. continually ask the user to enter
     an integer until they correctly enter a non-negative integer. */

  printStarTriangle(number);
  keyboard.close();

 } // end of main method


 public static void printStarTriangle ( int n ){
 // enter code to print a pyramid of stars containing n rows
   int z = 1;
   int a = n;
   for (int x = 0; x < n; x++){
       while (z < a) {
          System.out.print(" ");
          z++;
       }
     for (int y = 0; y <= x * 2; y++) {
          System.out.print("*");
       if (z == a){
         z = 1;
         a--;
       }
     }
      System.out.println();
   }

 } // end of sumDigits method
}