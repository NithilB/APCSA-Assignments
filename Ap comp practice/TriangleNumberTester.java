import java.util.*;
public class TriangleNumberTester{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		int n = 0;
		do{
		System.out.println("Type in a positive number");
		n = keyboard.nextInt();
		} while (n <= 0);
		System.out.println("Triangle Number: " + triangleNumber(n));

	}

	public static int triangleNumber(int n){
		if(n == 1){
		  return 1;
	  	}

	  	return triangleNumber(n - 1) + n;

	}
}
