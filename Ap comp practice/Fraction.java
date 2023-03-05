public class Fraction{
  private int numerator;
  private int denominator;

  public Fraction(int n, int d){
	  numerator = n;
	  denominator = d;
  }

  public String toString(){
	  return (numerator + "/" + denominator);
}

  public void invert(){
	  int n = numerator;
	  numerator = denominator;
	  denominator = n;
}

  public double toDouble(){
	  double x = 0.0;
	  x = (double)numerator / denominator;
	  return x;
}

  public Fraction simplify(){
	  int a = numerator;
	  int b = denominator;

	  for (int k = numerator; k >= 2; k--){
		 if (a % k == 0 && b % k == 0){
		   a /= k;
		   b /= k;
      }
  }
  Fraction knew = new Fraction(a, b);
  return knew;
}

  public static Fraction add(Fraction c, Fraction d){
  int a = c.numerator;
  int b = c.denominator;
  int x = d.numerator;
  int y = d.denominator;
  int z = b;
  if(b != y){
	 b *= y;
	 a *= y;
	 x *= z;
  }
  a = a + x;
  Fraction sim = new Fraction(a, b);
  sim = sim.simplify();
  return sim;
}



}