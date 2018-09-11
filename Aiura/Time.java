public class Time {


  private int hour;
  private int min;
  private int seg;
  private String h;
  private String m;
  private String s;
  private String t;


public Time (){
  this(0,0,0);

}

public Time (int hour, int min, int seg){//pone las variables en 0

  if (hour<0||hour>24){
    System.out.println("La hora debe de estar entre 0 y 24");
    hour=12;
  }

  if (min<0||min>=60){
    System.out.println("Los minutos deben de estar entre 0 y 59");
    min=0;
  }

  if (seg<0||seg>=60){
    System.out.println("Los segundos deben de estar entre 0 y 59");
    seg=0;
  }
  this.hour=hour;
  this.min=min;
  this.seg=seg;

}


public Time (int hour){

  this(hour,0,0);

}

public Time (int hour, int min){

  this(hour,min,0);

}

public String printTs(){

  if (hour>12) {
      t = "PM";
  }else{
    t = "AM";
  }

  if (min<10) {
    m="0"+min;

  }else{
    m=String.valueOf(min);
  }

  if (seg<10) {
    s="0"+seg;

  }else {
    s=String.valueOf(seg);
  }

  return(hour+":"+m+":"+s+t);

}//printTs

public int printM(){

  hour =hour*100;

  return hour;


}//printM



}//class
