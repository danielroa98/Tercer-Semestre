/*
 *Daniel Roa
 *A01021960
 *Clases Abstractas
 *2 de noviembre del 2018
 */

public abstract class Figura{
  protected String color;

  public Figura(String color){
    this.color = color;
  }

  abstract double area();
  abstract double perimetro();


    public String getColor(){
      return color;
    }
}
