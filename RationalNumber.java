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
    if (denominator < 0 && numerator > 0){
      denominator *= -1;
      numerator *= -1;
    }else if(numerator < 0 && denominator < 0){
      denominator *= -1;
      numerator *= -1;
    }
    reduce();
  }
  private void reduce(){
    int deno = denominator;
    int nume = numerator;
    denominator /= gcd(nume, deno);
    numerator /= gcd(nume, deno);
  }
  public int getNumerator(){
    return numerator;
  }
  public int getDenominator(){
    return denominator;
  }
  public boolean equals(RationalNumber other){
    if (other.getNumerator() == numerator && other.getDenominator() == denominator){
      return true;
    }
    return false;
  }
  public RationalNumber reciprocal(){
    RationalNumber rnum;
    rnum = new RationalNumber(denominator, numerator);
    return rnum;
  }

  public String toString(){
    if(getNumerator() == getDenominator()){
      return "1";
    }else if(getDenominator() == 1){
      return getNumerator() + "";
    }else if(getNumerator() == 0){
      return 0 + "";
    }
    return getNumerator() + "/" + getDenominator();
  }
  public double getValue(){
    return (double)getNumerator()/getDenominator();
  }
  private static int gcd(int a, int b){
    if (a == 0){
        return b;
    }
    while (b != 0) {
        if (a > b)
            a = a - b;
        else
            b = b - a;
    }
    return a;
  }
  public RationalNumber multiply(RationalNumber other){
    RationalNumber num;
    num = new RationalNumber(other.getNumerator() * this.getNumerator(), other.getDenominator() * this.getDenominator());
    return num;
  }
  public RationalNumber divide(RationalNumber other){
    RationalNumber num;
    num = new RationalNumber(other.getNumerator() * this.getDenominator(), other.getDenominator() * this.getNumerator());
    return num;
  }
  public RationalNumber add(RationalNumber other){
    RationalNumber num;
    int thisnum = other.getNumerator() * this.getDenominator();
    int thisden = other.getDenominator() * this.getDenominator();
    int othernum = this.getDenominator() * other.getDenominator();
    int otherden = this.getNumerator() * other.getDenominator();
    int totalnum = thisnum + othernum;
    int totalden = thisden + otherden;
    int deno = totalden;
    int nume = totalnum;
    deno /= gcd(totalnum, totalden);
    nume /= gcd(totalnum, totalden);
    num = new RationalNumber(nume, deno);
    return num;
  }
  public RationalNumber subtract(RationalNumber other){
    RationalNumber num;
    int thisnum = other.getNumerator() * this.getDenominator();
    int thisden = other.getDenominator() * this.getDenominator();
    int othernum = this.getDenominator() * other.getDenominator();
    int otherden = this.getNumerator() * other.getDenominator();
    int totalnum = thisnum - othernum;
    int totalden = thisden - otherden;
    int deno = totalden;
    int nume = totalnum;
    deno /= gcd(totalnum, totalden);
    nume /= gcd(totalnum, totalden);
    num = new RationalNumber(nume, deno);
    return num;
  }

}
