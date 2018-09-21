import java.util.*;

public class ClienteGaleria{

  public static void main(String[] args){
    Scanner lectura = new Scanner(System.in);//scanner para String

    Scanner demo = new Scanner(System.in); //Scanner para int


    int id;
    String nombreP;
    String comprador;
    int costo;
    int pagado;

    System.out.print("Id de la pintura: ");
    id = demo.nextInt();

    System.out.print("Nombre de la pintura: ");
    nombreP = lectura.nextLine();

    System.out.print("Nombre del comprador: ");
    comprador = lectura.nextLine();

    System.out.print("Costo de la pintura: ");
    costo = demo.nextInt();

    System.out.print("Cuánto pagó el comprador? ");
    pagado = demo.nextInt();

    int dia;
    String mes;
    int anio;

    System.out.println(" ");

    System.out.print("En que día la compró? ");
    dia = demo.nextInt();

    System.out.print("En que mes la compró? ");
    mes = lectura.nextLine();

    System.out.print("En que año la compró? ");
    anio = demo.nextInt();

    Galeria g1 = new Galeria(id, nombreP, comprador, costo, pagado);

    Galeria g2 = new Galeria(dia, mes, anio);

  }

}
