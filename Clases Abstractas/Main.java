/*
 *Daniel Roa
 *A01021960
 *Clases Abstractas
 *2 de noviembre del 2018
 */
import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner lecturaI = new Scanner(System.in);
    Scanner lecturaS = new Scanner(System.in);

    System.out.println("\nCREANDO UN CIRCULO");
    System.out.print("Introduce el radio: ");
    double radio = lecturaI.nextDouble();
    System.out.print("Introduce el color: ");
    String color = lecturaS.nextLine();

    Figura figura = new Circulo(radio, color);
    System.out.println("\n\nEl area del circulo es "+figura.area());
    System.out.println("El perimetro del circulo es "+figura.perimetro());
    System.out.println("El color del circulo es "+figura.getColor());

    System.out.println("\nCREANDO UN CUADRADO");
    System.out.print("Introduce el lado del cuadrado: ");
    double lado = lecturaI.nextDouble();
    System.out.print("Introduce el color: ");
    color = lecturaS.nextLine();

    figura = new Cuadrado(lado, color);
    System.out.println("\n\nEl área del cuadrado es: "+figura.area());
    System.out.println("El perímetro del cuadrado es: "+figura.perimetro());
    System.out.println("El color del cuadrado es: "+figura.getColor());
  }
}
