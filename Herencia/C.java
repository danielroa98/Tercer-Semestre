/*
 * Herencia
 * Daniel Roa
 * A01021960
 * 16 de octubre del 2018
*/

public class C{ //esta es una super clase, tambien se puede escribir como extends Object, pero no es necesario

  protected int c; //solo puede ser accedido por las clases y subclases del mismo programa, no puede ser modificacdo

  public String toString(){
    return "c";
  }
  public void method1(){
    System.out.print("c 1 ");
  }

  public void method2(){
    System.out.print("c 2 ");
  }
}

//C es la superclase

/*
C obj = new C();
System.out.println(C);
*/
