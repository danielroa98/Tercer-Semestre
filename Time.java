//Ejemplo de Sobrecagra de Constructores

public class Time{

  private int hour = 0;
  private int min = 0;
  private int sec = 0;

  /*public Time(){
    hour = 12;
    min = 0;
    sec = 0;
  }*/

  public Time(){
    this(24, 24, 24);
  }

  public Time(int hour){
    this.hour = hour;
    min = 0;
    sec = 0;
  }

  public Time(int hour, int min){
    this.hour = hour;
    this.min = min;
    sec = 0;
  }

  public Time(int hour, int min , int sec){

    if (hour < 0 || hour > 24){
      System.out.println("Por favor, cheque su hora nuevamente, debe ser de 0 a 23");
    }

    if (min < 0 || min > 60){
      System.out.println("Por favor, cheque el valor de sus minutos otra vez, debe ser de 0 a 59");
    }

    if (sec < 0 || sec > 60){
      System.out.println("Por favor, cheque nuevamente el valor de sus segundos, debe ser de 0 a 59");
    }

    this.hour = hour;
    this.min = min;
    this.sec = sec;
  }

  public int getHour(){
    return hour;
  }

  public int getMin(){
    return min;
  }

  public int getSec(){
    return sec;
  }

  public int militaryTime(int hour, int min, int sec){
    String hora;

  }

}
