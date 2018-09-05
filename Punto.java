import java.util.*;

public class Punto{

  private int x = 0;
  private int y = 0;

  public Punto(){

  }

  public Punto(int x, int y){
    this.x = x;
    this.y = y;
  }

  public void setX(int x){
    this.x = x;
  }

  public int getX(){
    return x;
  }

  public void setY(int y){
    this.y = y;
  }

public int getY(){
  return y;
}

  public double disTotal(Punto p){

    //int ultimo = Math.sqrt((((this.x - this.x)*(this.x - this.x))+((this.y - this.y)*(this.y - this.y))));
    int x0 = p.getX();

    int y0 = p.getY();

    double a = 0;

    double b = 0;

    double c = 0;


    a = (((x0)-(this.x))*((x0)-(this.x)));

    b = (((y0)-(this.y))*((y0)-(this.y)));

    c = Math.sqrt(a + b);

    return c;

  }

}
