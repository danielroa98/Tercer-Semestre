/*
 *Daniel Roa
 *A01021960
 *Clases Abstractas
 *2 de noviembre del 2018
 */

public class Circulo extends Figura{
  private double radio;
  private double pi = 3.1416;

  public Circulo(double radio, String color){
    super(color);
    this.radio = radio;
  }

  @Override
  public double area(){
    return pi*radio*radio;
  }

  @Override
  public double perimetro(){
    return (2*pi)*radio;
  }
}
