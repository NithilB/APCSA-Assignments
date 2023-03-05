/* Programmer:
   Date:
   Project: DisplayTriangle
   File Name: DisplayTriangle.java
   Program Description: This program will print a pyramid of stars
*/


import java.util.*;


public class Display {

 public static void main(String [] args) {
  Scanner keyboard = new Scanner(System.in);

  //int n = keyboard.nextInt();
  /*int [] input ={1,2,3,4};
  int t = input[0];
  int l = input[input.length-1];
  input[0] = l;
  input[input.length-1] = t;

  System.out.println("first: " + input[0] + " second: " + input[input.length - 1]);
  int [] wedge = new int[(n*2)-1];
  int x = 0;
  int y = n-1;
  for (int i = 1; i < wedge.length + 1; i++){
	  if(i>n){
		  wedge[x] = y;
		  y--;
	 } else {
		 wedge[x] = i;
	 }
	 x++;
   }
 int z = 0;
 while (z < (n*2)-1){
System.out.print(wedge[z] + " ");
z++;
}
*/
int [] v = {3,2,1,0,-1};
int count = 0;
for (int j = 0; j < v.length; j++){
	if (v[j] != 0)
		break;
	count++;
}
System.out.println(count);



  /*int number;


  System.out.println("Enter a non-negative integer");
  number = keyboard.nextInt();

  while (number <= 0) {
    System.out.println("Enter a non-negative integer");
    number = keyboard.nextInt();
  }

   Start code here - the variable number will contain an integer
     make sure it is non-negative. continually ask the user to enter
     an integer until they correctly enter a non-negative integer.

  printStarTriangle(number);
  keyboard.close();

 } // end of main method


 public static void printStarTriangle ( int n ){
 // enter code to print a pyramid of stars containing n rows


 } // end of sumDigits method
 */
}
}