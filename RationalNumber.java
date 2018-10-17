public class RationalNumber extends RealNumber{
  private int numerator, denominator;
  public RationalNumber(int nume, int deno){
    super(3.0);
    numerator = nume;
    denominator = deno;
    if (denominator == 0){
      denominator = 1;
      numerator = 0;
    }
    int big;
    if (denominator > numerator){
      big = denominator;
    }else{
      big = numerator;
    }
    for (int x = 1; x < big; x++){
      if (denominator % x == 0 && numerator % x == 0){
        denominator /= x;
        numerator /= x;
      }
    }
  }
  public int getNumerator(){
    return numerator;
  }
  public int getDenominator(){
    return denominator;
  }
  public boolean equals(RationalNumber other){
    if (other.getNumerator() == other.getDenominator()){
      return true;
    }
    return false;
  }
  public RationalNumber reciprocal(){
    int n = numerator;
    int d = denominator;
    numerator = d;
    denominator = n;
  }

  public String toString(){
    return getNumerator() + "/" + getDenominator();
  }
  public double getValue(){
    return getNumerator()/getDenominator();
  }
  private static int gcd(int a, int b){
    int num;
    while (b != 0){
      num = b;
      b = a % b;
      a = num;
    }
    return a;
  }
}
