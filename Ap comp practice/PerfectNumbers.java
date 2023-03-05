/* Programmer:
   Date:
   Project: PerfectNumbers
   File Name: PerfectNumbers.java
   Program Description: This program will print the first seven PerfectNumbers
*/



public class PerfectNumbers {

 public static void main(String [] args) {
  // start code to search for first seven Mersenne prime numbers here
  // then print their corresponding perfect numbers
  // be sure to use the long data type for both the mersenne and perfect numbers
 for(int c=1;c<=19;c++){
  isPrime(c);
 }
 } // end of main method


 public static void isPrime ( long n ){
   long x = 0, a = 1, b = 0;
   long mersenne = 1;
   long f = 0;
   long v = 0;
   long perfect = 0;
   long k = 1;
   long l = 1;
   
   
    
     while (x < n){ //power of 2
       mersenne *= 2;
       x++;
     }
     mersenne = mersenne - 1; //finishing the problem
     
     for (long cnt = 1; cnt < mersenne; cnt++){  //establishing values to check for prime
     f++;
     if (mersenne % cnt != 0){
         v++; 
       }   
      }
   if (v == f - 1){ // checks if prime or not 
      System.out.print("Mersenne Prime: " + mersenne + " "); // proceeds to print Mersenne
      //find perfect number here
      
      while (a < n){ //First part of problem
        k *= 2;
        a++;      
      }
      
      while (b < n){  // Second part of problem
        l *= 2;
        b++;
      }
      l = l - 1;
      perfect = k * l; //Equals perfect
  
      System.out.println("Perfect Number: " + perfect); //prints perfect
       } else {
      //   System.out.println("Not prime");
       }
      
             if (x == n){  //resets values to repeat cycle
                mersenne = 1;
                perfect = 0;
                a = 1;
                b = 0;
                v = 0;
                f = 0;
                k = 1;
                l = 1;
              }
  


 } // end of sumDigits method
}