/*
 * Continuacion de Herencia
 * Daniel Roa
 * A01021960
 * 19 de octubre del 2018
*/

class classA{
  protected int m;

  public classA(){
    System.out.println("A");
  }

  public classA(int m){
    this.m = m;
    System.out.println("A");
  }

}

class classB extends classA{
  public classB(){
    System.out.println("B");
  }

  public classB(int m){
    super(m);
    System.out.println("B");
  }
}

class classC extends classB{

  protected int i;
  protected String c;

  public classC(){
    System.out.println("C");
  }

  public classC(int i){
    this.i = i;
    System.out.println(i);
  }

  public classC(int i, String C){
    this.i = i;
    System.out.println(i);
    System.out.println(c);
  }

  public classC(int i, int m, String c){
    super(m);
    this.i = i;
    System.out.println(i);
    System.out.println(c);
  }
}

class classD extends classC{
  public classD(){
    super();                 //primera linea de un constructor
    System.out.println("D");
  }

  public classD(int i, int m, String c){
    super(i , m, c);                 //primera linea de un constructor
    System.out.println("D");
  }
}

public class Constructores{
  public static void main(String[] args) {
    classD object = new classD(200, 1, "Hola mundo");
  }
}
