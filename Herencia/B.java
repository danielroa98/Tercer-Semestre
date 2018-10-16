/*
 * Herencia
 * Daniel Roa
 * A01021960
 * 16 de octubre del 2018
 */

 public class B extends C{ //extends es para que herde datos de la clase "C"
  public String toString(){
  return "b";
  }

  public void method2(){
    System.out.print("b 2 ");
    super.method2();
  }
 }

//B hereda datos de C
