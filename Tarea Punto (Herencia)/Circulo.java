public class Circulo extends Punto{

  static protected double r; //radio
  static protected double d;
  static protected double c;
  static protected double a;

  static protected double pi = 3.1416;

  public Circulo(double x, double y){
    super(x, y);
    this.r = x - y;
    System.out.println("kk");
  }

  public static double getRadio(){
    return r;
  }

  public double diametro(double r){
    d = r * 2;
    return d;
  }

  public double circumferencia(double d){
    c = d * pi;
    return c;
  }

  public static double getArea(double r){
    double p = r * r;
    a = pi * p;
    return a;
  }
}
