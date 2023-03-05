/* Programmer:
   Date:
   Project: PerfectNumbers
   File Name: PerfectNumbers.java
   Program Description: This program will print the first seven PerfectNumbers
*/



public class PerfectNumberss {

 public static void main(String [] args) {
   long x = 0, a = 1, b = 0;
   long mersenne = 1;
   long k = 1, l = 1, perfect = 0;
     
  for (int d = 1; d <= 19; d++){
    
     while (x < d){ //power of 2
       mersenne *= 2;
       x++;
     }
     mersenne = mersenne - 1; //finishing the problem
  
     //System.out.print("ISPRIME:"+ isPrime(mersenne) +"\n");
        
      if (isPrime(mersenne) == true){
      System.out.print("Mersenne Prime: " + mersenne + " "); // proceeds to print Mersenne
      //find perfect number here
      
      while (a < d){ //First part of problem
        k *= 2;
        a++;      
      }
      
      while (b < d){  // Second part of problem
        l *= 2;
        b++;
      }
      l = l - 1;
      perfect = k * l; //Equals perfect
  
      System.out.println("Perfect Number: " + perfect); //prints perfect
     } else if (isPrime(mersenne) == false){
      //   System.out.println("Not prime");
       }
      
             if (x == d){  //resets values to repeat cycle
                mersenne = 1;
                perfect = 0;
                a = 1;
                b = 0;
                k = 1;
                l = 1;
                x = 0;
              }

      
   } 
 } 

 public static boolean isPrime ( long n ){
   long f = 0;
   long v = 0;
     
     for (long cnt = 1; cnt < n; cnt++){  //establishing values to check for prime
     f++;
     if (n % cnt != 0){
         v++; 
       }   
      }
   if (v == f - 1){ // checks if prime or not 
     return true;
   } else {     
     return false;
   }


   
 } // end of sumDigits method
}

 