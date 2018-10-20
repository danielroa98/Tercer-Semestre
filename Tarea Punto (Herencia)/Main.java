public class Main{
  public static void main(String[] args) {

    double x = 5;
    double y = 2;

    //radio de 3 unidades

    Punto p1 = new Circulo(x, y);

    System.out.println("El area del circulo es: "+ Circulo.getArea(Circulo.getRadio()));
  }
}
