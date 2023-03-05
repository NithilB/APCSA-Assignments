public class Fraction{
  
  private int numerator;
  private int denominator;
  
  public Fraction (int n, int d){
    numerator = n;
    denominator = d;
  }

  public String toString(){
    return (numerator + "/" + denominator);
  }
  
  public void invert(){
    int x = 0;
    x = numerator;
    numerator = denominator;
    denominator = x;
}
  
  public double toDouble(){
    return (double)numerator / denominator;
}
  
  public Fraction simplify(){
   int y = 0, z = 0;
   y = numerator;
   z = denominator;
      for(int x = y; x >= 2; x--){
        if (y % x == 0 && z % x == 0){
          y /= x;
          z /= x;
        }
      } 
      Fraction old = new Fraction (y, z);
      return old;
}    
  
  public static Fraction add(Fraction a, Fraction b){
    int x = a.numerator;
    int y = a.denominator;
    int k = b.numerator;
    int l = b.denominator;
    int h = 0, v = 0;
    v = y;
    
    if (y != l){
      y *= l;
      x *= l;
      l *= v;
      k *= v;
    }
    h = x + k;
    Fraction knew = new Fraction (h, y);
    knew = knew.simplify();
    return knew;
}




}

