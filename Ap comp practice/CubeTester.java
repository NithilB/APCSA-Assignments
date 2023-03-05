import java.util.*;
public class CubeTester{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
/*
		System.out.println("Type a number");
		int n = keyboard.nextInt();
		System.out.println(cube(n));
		System.out.println(square(n));

		System.out.println("Type a number");
		int c = keyboard.nextInt();
		System.out.println(thing1(c));

		System.out.println("Type a number");
		int v = keyboard.nextInt();
		System.out.println(thing2(v));

		System.out.println("Type a number");
		double w = keyboard.nextDouble();
		int q = keyboard.nextInt();
		System.out.println(thing3(w,q));
*/
		System.out.println("Type a number");
		double r = keyboard.nextDouble();
		System.out.println(recur(r));


	}


	public static int cube(int n){
	if(n == 0){
		return 0;
	}

		if(n > 0){
			return cube(n-1) + 3*(square(n))-3*n + 1;
		}else{
			return cube(n+1) - 3*(square(n))-3*n - 1;
		}

	}
	public static int square(int n){

	if(n == 0){
		return 0;
	}

		if(n > 0){
			return square(n - 1) + 2 * n - 1;
		} else {
			return square(n + 1) - 2 * n - 1;
		}

	}

	public static int thing1(int x){
		if(x == 0){
			return 5;
		}else{
			return x + thing1(x-1);
		}

	}
	public static int thing2(int x){
		if(x <= 0){
			return x;
		}else{
			return x * thing2(x - 1);
		}
	}
	public static double thing3(double x, int n){
		if(n == 0){
			return 1.0;
		} else {
			return x * thing3(x, n-1);
		}
	}

	public static double recur(double x){
		return recur(x / 2);
	}

	public static int recur2(int x){
		if(x < 0){
			return 3;
		} else {
			return 1 + recur2(x);
		}

	}



}