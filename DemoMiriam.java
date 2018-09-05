import java.util.*;
import javax.swing.JOptionPane;

public class DemoMiriam{
  public static void main(String[] args){

    Scanner lectura = new Scanner(System.in);

    double a = 0, b = 0, c = 0, d = 0, e = 0, f = 0, g = 0, h = 0, i = 0, j = 0, res = 0;

    System.out.print("Insert el nombre del wey a analizar: ");
    String vato = lectura.nextLine();

    System.out.println(" ");

    System.out.println("A continuacion habra una serie de preguntas para poder ver que tan probable es que sea chido");

    System.out.println(" ");

    System.out.println("Por favor, solo escribe 'si' o 'no'.");

    System.out.println(" ");

    //PREGUNTA 1
    System.out.println("Es ingeniebrio?");
    String uno = lectura.nextLine();


    if (uno.equalsIgnoreCase("si") || uno.equalsIgnoreCase("no")) {
      if (uno.equalsIgnoreCase("si")) {

      a = .10  ;

      }//primer if "si"
      if (uno.equalsIgnoreCase("no")) {
        a = 0;
      }//primer if "no"
    }//PRIMER IF GENERAL

    System.out.println(" ");

    //PREGUNTA 2
    System.out.println("Es mayor de 21.5 años?");
    String dos = lectura.nextLine();


    if (dos.equalsIgnoreCase("si") || dos.equalsIgnoreCase("no")) {
      if (dos.equalsIgnoreCase("si")) {
        b = .10;
      }//segundo if "si"
      if (dos.equalsIgnoreCase("no")) {
        b = 0;
      }//segundo if "no"
    }//SEGUNDO IF GENERAL

    System.out.println(" ");

    //PREGUNTA 3
    System.out.println("Baila salsa?");
    String tres = lectura.nextLine();


    if (tres.equalsIgnoreCase("si") || tres.equalsIgnoreCase("no")) {
      if (tres.equalsIgnoreCase("si")) {
        c = .10;
      }//tercer if "si"
      if (tres.equalsIgnoreCase("no")) {
        c = 0;
      }//tercer if "no"
    }//TERCER IF GENERAL

    System.out.println(" ");

    //PREGUNTA 4
    System.out.println("Mide mas de 1.75 m?");
    String cuatro = lectura.nextLine();

    if (cuatro.equalsIgnoreCase("si") || cuatro.equalsIgnoreCase("no")) {
      if (cuatro.equalsIgnoreCase("si")) {
        d = .10;
      }
      if (cuatro.equalsIgnoreCase("no")) {
        d = 0;
      }
    }

    System.out.println(" ");

    //PREGUNTA 5
    System.out.println("Tiene novia?");
    String cinco = lectura.nextLine();

    if (cinco.equalsIgnoreCase("si") || cinco.equalsIgnoreCase("no")) {
      if (cinco.equalsIgnoreCase("si")) {
        e = 0;

        System.out.println(" ");

        System.out.println("Que chingados estas pensando?!");
      }
      if (cinco.equalsIgnoreCase("no")) {
        e = 0.10;
      }
    }

    System.out.println(" ");

    //PREGUNTA 6
    System.out.println("Tus amigos dicen que esta feo?");
    String seis = lectura.nextLine();

    if (seis.equalsIgnoreCase("si") || seis.equalsIgnoreCase("no")) {
      if (seis.equalsIgnoreCase("si")) {
        f = 0;
      }
      if (seis.equalsIgnoreCase("no")) {
        f = 0.10;
      }
    }

    System.out.println(" ");

    //PREGUNTA 7
    System.out.println("Tiene una ex loca?");
    String siete = lectura.nextLine();

    if (siete.equalsIgnoreCase("si") || siete.equalsIgnoreCase("no")) {
      if (siete.equalsIgnoreCase("si")) {
        g = 0;
      }
      if (siete.equalsIgnoreCase("no")) {
        g = 0.10;
      }
    }

  System.out.println(" ");

    //PREGUNTA 8
    System.out.println("Le molesta el 'requeson' (slang para reggaeton)");
    String ocho = lectura.nextLine();

    if (ocho.equalsIgnoreCase("si") || ocho.equalsIgnoreCase("no")) {
      if (ocho.equalsIgnoreCase("si")) {
        h = 0;
      }
      if (ocho.equalsIgnoreCase("no")) {
        h = 0.10;
      }
    }

    System.out.println(" ");

    //PREGUNTA 9
    System.out.println("Que preferirias ver? RuPaul o Pitch Perfect");
    String nueve = lectura.nextLine();

    if (nueve.equalsIgnoreCase("RuPaul") || nueve.equalsIgnoreCase("Pitch Perfect") || nueve.equalsIgnoreCase("ninguno")) {
      if (nueve.equalsIgnoreCase("RuPaul")) {

        i= 0.10;
      }
      if (nueve.equalsIgnoreCase("Pitch Perfect")) {
        i = 0.10;
      }
      if (nueve.equalsIgnoreCase("ninguno")) {
        i = 1.00;

        System.out.println(" ");

        System.out.println("Excelente decisión!");
      }
    }

    System.out.println(" ");

    //PREGUNTA 10
    System.out.println("Se llama Fernando?");
    String diez = lectura.nextLine();

    if (diez.equalsIgnoreCase("si") || diez.equalsIgnoreCase("no")) {
      if (diez.equalsIgnoreCase("si")) {
        j = 0;
      }
      if (diez.equalsIgnoreCase("no")) {
        j = 0.10;
      }
    }


    System.out.println(" ");

    res = a + b + c + d + e + f + g + h + i + j;

    res =  res * 100;

    System.out.println("El porcentaje de "+vato+" para ser tu pareja es de: "+res+"%");

  }
}
