import java.util.*;
public class FactorialTester{
	public static void main(String[] args){
//		System.out.println(factorial(5));
//		System.out.println(palindrome("12321"));
		mystery(4321);
		System.out.println(mystery("patriots"));
	//	System.out.println(binaryToDecimal(10110));
		printX(3);
		System.out.println("\n" + mystery2(3));
		//System.out.println(mystery1("elephants are escaping Egypt"));
		if('e' == 'E'){
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		String str = "Bobby";
		System.out.println(str.charAt(0) != 'a');

	}

	public static int factorial(int num){
		if(num == 1){
			return 1;
		} else {
			return num * factorial(num - 1);
		}
	}

	public static boolean palindrome(String num){
		if(num.length() <= 1){
			return true;
		}else{
			if(num.charAt(0) == num.charAt(num.length()-1)){
				return palindrome(num.substring(1, num.length()-1));
			}
		return false;
		}
	}

	public static void mystery(int x){
	System.out.print(x % 10);

	if ((x / 10)  != 0)
	    mystery(x / 10);



	System.out.print(x % 10);


	}

	public static String mystery(String x){
	if (x.length() < 2){
	     return ""; // empty string
	}else{
	     return x.substring(0,1) + mystery(x.substring(2));
	}
}
public static int BinaryToDecimal(int binaryNumber){

    int decimal = 0;
    int p = 0;
    while(true){
      if(binaryNumber == 0){
        break;
      } else {
          int temp = binaryNumber%10;
          decimal += temp*Math.pow(2, p);
          binaryNumber = binaryNumber/10;
          p++;
       }
    }
    return decimal;
  }

 public static void printX(int n){
      if (n <= 0)
            	System.out.print(0);
       	else{
             	printX(n-1);
             	System.out.print(n);
             	printX(n-2);
       	}
  	}

/*public static int mystery1(String x){
if (x.length() == 0)
     return 0;
if (x.charAt(0) == 'e')
  	return 1 + mystery(x.substring(1));
else
     return mystery(x.substring(1));
}
*/

public static int mystery2(int n){
if (n == 0)
    return 1;
else
    return 3 * mystery2(n - 1);

}










}