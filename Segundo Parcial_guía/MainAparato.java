import java.util.*;

public class MainAparato{
  public static void main(String[] args) {
    Scanner lecturaI = new Scanner(System.in);
    Scanner lecturaS = new Scanner(System.in);

    int seleccion, aparato, tipoPul;

    Pulgadas pulg;

    String des, modelo;

    double precio, descuento;

    System.out.println("************************");
    System.out.println("*****MENU PRINCIPAL*****");
    System.out.println("************************");
    System.out.println("*1) Para seleccionar un*\n*aparato, presione 1*");
    seleccion = lecturaI.nextInt();

    if (seleccion == 1) {
      System.out.println("Que aparato desea?\n1) TV\n2) Sonido");
      aparato = lecturaI.nextInt();

      if (aparato == 1) {
        System.out.println("Descuento? s/n");
        des = lecturaS.nextLine();

        if (des.equalsIgnoreCase("s")) {
          System.out.println("\nQue modelo es?");
          modelo = lecturaS.nextLine();

          System.out.println("\nQue precio tiene?");
          precio = lecturaS.nextDouble();

          System.out.println("De cuanto es el descuento?");
          descuento = lecturaI.nextDouble();

          System.out.println("\nDe cuantas pulgadas es?\nSólo hay de estos tamaños: \nTV1 24\nTV2 32\nTV3 55\nTV4 65\nTV5 70\nTV6 75");
          tipoPul = lecturaI.nextInt();

          TV tv1 = new TV();

          switch (tipoPul) {
            case 1:
            tv1 = new TV(modelo, precio, descuento, Pulgadas.TV1);
              break;
            case 2:
            tv1 = new TV(modelo, precio, descuento, Pulgadas.TV2);
              break;
            case 3:
            tv1 = new TV(modelo, precio, descuento, Pulgadas.TV3);
              break;
            case 4:
            tv1 = new TV(modelo, precio, descuento, Pulgadas.TV4);
              break;
            case 5:
            tv1 = new TV(modelo, precio, descuento, Pulgadas.TV5);
              break;
            case 6:
            tv1 = new TV(modelo, precio, descuento, Pulgadas.TV6);
              break;
        }


        }else if (des.equalsIgnoreCase("n")) {

          System.out.println("\nQue modelo es?");
          modelo = lecturaS.nextLine();

          System.out.println("\nQue precio tiene?");
          precio = lecturaS.nextDouble();

          System.out.println("\nDe cuantas pulgadas es?\nSólo hay de estos tamaños: \nTV1 24\nTV2 32\nTV3 55\nTV4 65\nTV5 70\nTV6 75");

          tipoPul = lecturaI.nextInt();

          TV tv1 = new TV();

          switch (tipoPul) {
            case 1:
            tv1 = new TV(modelo, precio, Pulgadas.TV1);
              break;
            case 2:
            tv1 = new TV(modelo, precio, Pulgadas.TV2);
              break;
            case 3:
            tv1 = new TV(modelo, precio, Pulgadas.TV3);
              break;
            case 4:
            tv1 = new TV(modelo, precio, Pulgadas.TV4);
              break;
            case 5:
            tv1 = new TV(modelo, precio, Pulgadas.TV5);
              break;
            case 6:
            tv1 = new TV(modelo, precio, Pulgadas.TV6);
              break;
        }

            //TV tv1 = new TV(modelo, precio, pulg);

        }
      }

      if (aparato == 2) {
        System.out.println("Descuento? s/n");
        des = lecturaS.nextLine();

        if (des.equalsIgnoreCase("s")) {
          System.out.println("\nQue modelo es?");
          modelo = lecturaS.nextLine();

          System.out.println("\nQue precio tiene?");
          precio = lecturaS.nextDouble();

          System.out.println("De cuanto es el descuento?");
          descuento = lecturaI.nextDouble();

          //EqSonido sonido1 = new TV(modelo, precio, descuento);

        }else if (des.equalsIgnoreCase("n")) {

          System.out.println("\nQue modelo es?");
          modelo = lecturaS.nextLine();

          System.out.println("\nQue precio tiene?");
          precio = lecturaS.nextDouble();

          //EqSonido sonido1 = new TV(modelo, precio);

        }
    }


    }
  }
}
