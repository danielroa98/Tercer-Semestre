public class FraccionCliente{

  public static void main(String[] args){

    int numerador = 2;

    Fraccion f1 = new Fraccion(3,2); //3/2
    f1.setNumerador(numerador); //2/2
    //f1.numerador = 3; NO HACER NUNCA, NO FUNCIONA ASi

    Fraccion f2 = new Fraccion(4,2);
    Fraccion f3 = new Fraccion();

    f3 = f1.suma_f(f2);
    //f1.suma_f(f2);
    //f2.suma_f(f1); tambien puede ser escrito así
    //f3 = f1.suma(f2);

    System.out.println(f3.getNumerador() + "/" + f3.getDenominador());
  }

}
