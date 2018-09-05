public class Cuenta{

  private double saldo; //también puede llamarse "public"
  private String nombre; //tambien puede llamarse "public"

  public double ConsultaSaldo(){
  return saldo;
  }

  public void RealizarDeposito(double cantidad){
    this.saldo = this.saldo + cantidad;
  }
}

/*
Para compilar se deben declarar los dos archivos en la misma instancia

*/
