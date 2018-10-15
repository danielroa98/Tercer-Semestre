/*
Prueba ENUM
Daniel Roa
A01021960
2 de octubre del 2018
*/

public class EnumTest{
  Day day;

  public EnumTest(Day day){
    this.day = day;
  }

  public void tellItLikeItIs(){
    switch(day){
      case MONDAY:
        System.out.println("Mondays suck.");
        break;

      case FRIDAY:
        System.out.println("Fridays rule!");
        break;

      case SATURDAY: case SUNDAY:
        System.out.println("Weekends are the best.");
        break;

      default:
        System.out.println("Midweeks are alright.");
        break;
    }
  }
}
