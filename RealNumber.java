public class RealNumber{
  private double value;
  public RealNumber(double v){
    value = v;
  }
  public double add(RealNumber other){
    return other.getNumber() + value;
  }
  public double multiply(RealNumber other){
    return other.getNumber() * value;
  }
  public double divide(RealNumber other){
    return value/other.getNumber();
  }
  public double subtract(RealNumber other){
    return value - other.getNumber();
  }
  public double getNumber(){
    return value;
  }
  public String toString(){
    return "" + value;
  }
}
