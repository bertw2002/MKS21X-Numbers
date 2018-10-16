public class RationalNumber extends RealNumber{
  private int numerator, denominator;
  public RationalNumber(int n, int d){
    super(3.0);
    numerator = n;
    denominator = d;
  }
  public int getNumerator(){
    return 0; //random
  }
  public int getDenominator(){
    return 0; //rando
  }
  public String toString(){
    return "e"; //rando
  }
  public String getValue(){
    return "s";//rando
    //return getNumerator()/getDenominator();
  }
}
