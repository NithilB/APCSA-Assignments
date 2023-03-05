import java.util.*;
public class QuadraticFunctionTester{
	public static void main(String[] args){
		QuadraticFunction q1 = new QuadraticFunction(1, -1, 4);
		QuadraticFunction q2 = new QuadraticFunction(1, -1, 4);
		QuadraticFunction q3 = new QuadraticFunction(2, -5, 6);
		QuadraticFunction q4 = new QuadraticFunction(4, 3, -2);


		System.out.println("q1: " + q1);
		System.out.println("q2: " + q2);
		System.out.println("q3: " + q3);
		System.out.println("q4: " + q4);

		System.out.println("\n\nq1.equals(q2): " + q1.equals(q2));
		System.out.println("q1.equals(q3): " + q1.equals(q3));

		System.out.println("\n\nq1.compareTo(q2): " + q1.compareTo(q2));
		System.out.println("q1.compareTo(q3): " + q1.compareTo(q3));
		System.out.println("q1.compareTo(q4): " + q1.compareTo(q4));
		System.out.println("q2.compareTo(q3): " + q2.compareTo(q3));
		System.out.println("q2.compareTo(q4): " + q2.compareTo(q4));
		System.out.println("q3.compareTo(q4): " + q3.compareTo(q4));

		CompareQuadratics temp = new CompareQuadratics();
		System.out.println("\n\nx = 0: \ntemp.compare(q1, q2): " + temp.compare(q1, q2));
		System.out.println("temp.compare(q1, q3): " + temp.compare(q1, q3));
		System.out.println("temp.compare(q1, q4): " + temp.compare(q1, q4));

		temp = new CompareQuadratics(2.4);
		System.out.println("\n\nx = 2.4\ntemp.compare(q1, q2): " + temp.compare(q1, q2));
		System.out.println("temp.compare(q1, q3): " + temp.compare(q1, q3));
		System.out.println("temp.compare(q1, q4): " + temp.compare(q1, q4));

		System.out.println("\n\nq1.valueAt(3.9): " + q1.valueAt(3.9) + "\n\n");

	}
}

class QuadraticFunction implements Comparable<QuadraticFunction>{
	private int a;
	private int b;
	private int c;

	public QuadraticFunction(int A, int B, int C){
		a = A;
		b = B;
		c = C;
	}

	public double valueAt(double x){
		double ans = (a * Math.pow(x, 2)) + (b * x) + c;
		return ans;
	}

	public String toString(){
		String A = "";
		String B = "+";
		String C = "+";
		int d = a;
		int e = b;
		int f = c;
		if (a < 0){
			A = "-";
			d = a*-1;
		}
		if (b < 0){
			B = "-";
			e = b*-1;
		}
		if (c < 0){
			C = "-";
			f = c*-1;
		}
		String str = "";
		if(d == 1){
			str = A + "x^2 ";
		} else {
			str = A + d + "x^2 ";
		}

		if(e == 1){
			str += B + " x ";
		} else {
			str += B + " " + e + "x ";
		}

		str += C + " " + f;
		return str;
	}

	public int getA(){
		return a;
	}
	public int getB(){
		return b;
	}
	public int getC(){
		return c;
	}

	public boolean equals(QuadraticFunction o){
		if(a == o.getA() && b == o.getB() && c == o.getC()){
			return true;
		}
		return false;
	}

	public int compareTo(QuadraticFunction o){
		if(a != o.getA()){
			return a - o.getA();
		} else if (b != o.getB()){
			return b - o.getB();
		} else if (c != o.getC()){
			return c - o.getC();
		} else {
			return 0;
		}
	}
}

class CompareQuadratics{
	private double x;

	public CompareQuadratics(){
		x = 0;
	}

	public CompareQuadratics(double X){
		x = X;
	}

	public int compare(QuadraticFunction func1, QuadraticFunction func2){
		int a = (int)(func1.valueAt(x));
		int b = (int)(func2.valueAt(x));
		return a - b;
	}
}
