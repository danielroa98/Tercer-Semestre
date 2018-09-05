public class Fraccion{

  private int numerador = 0;
  private int denominador = 0;

  public Fraccion(){

  }

  //constructor
  public Fraccion(int numerador, int denominador){

    this.numerador = numerador;
    this.denominador = denominador;

  }

  //metodo set del numerador
  public void setNumerador(int numerador){
    this.numerador = numerador;
  }


  //metodo get del denominador
  public int getNumerador(){
    return this.numerador;
  }

  public int getDenominador(){
    return this.denominador;
  }

  public Fraccion suma_f(Fraccion f){
    int n = (this.numerador * f.denominador) + (this.denominador * this.numerador);

    int d = this.denominador * f.denominador;

    Fraccion f_res = new Fraccion(n,d);
    return f_res;
  }

}
