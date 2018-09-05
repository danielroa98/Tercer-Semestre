import java.util.*;

public class ClienteCanguro{
  public static void main(String[] args){
    Scanner lectura = new Scanner(System.in);

    System.out.print("Inserta la primera posicion: ");
    int pos1 = lectura.nextInt();

    System.out.println(" ");

    System.out.print("Inserta la primera velocidad: ");
    int vel1 = lectura.nextInt();

    Canguro c1 = new Canguro(pos1, vel1);

    System.out.println(" ");

    System.out.print("Inserta la segunda posicion: ");
    int pos2 = lectura.nextInt();

    System.out.println(" ");

    System.out.print("Inserta la segunda velocidad: ");
    int vel2 = lectura.nextInt();

    Canguro c2 = new Canguro(pos2, vel2);

    System.out.println(" ");

    System.out.println(c1.disTotal(c2));
  }

}
