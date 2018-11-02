/*
 *Daniel Roa
 *A01021960
 *Clases Abstractas
 *2 de noviembre del 2018
 */

public class Cuadrado extends Figura{
  private double lado;

  public Cuadrado(double lado, String color){
    super(color);
    this.lado = lado;
  }

  @Override
  public double area(){
    return lado*lado;
  }

  @Override
  public double perimetro(){
    return lado*4;
  }
}
