/*
 * Herencia
 * Daniel Roa
 * A01021960
 * 16 de octubre del 2018
 */

public class Main{
  public static void main(String[] args) {
    C[] elements = {new A(), new B(), new C(), new D()};

    System.out.println();

    for (int i = 0; i < elements.length; i++) {
      System.out.println(elements[i]); //vinculado al toString

      elements[i].method1();
      System.out.println();

      elements[i].method2();
      System.out.println();

      System.out.println();
      System.out.println();
    }

    //otro ejemplo dentro del mismo metodo
    B otro = new B();
    System.out.println(otro);

    //para declarar un arreglo

    int[] var = {1,2};
  }
}
