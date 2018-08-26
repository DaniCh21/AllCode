package Сalendar;

class MotorVehicle {
 protected int doStuff(int x) { return x * 2; }
 }


 class Bicycle {
 void go(MotorVehicle m) {
         System.out.print(m.doStuff(21) + " ");
         }
}



  class Beemer extends MotorVehicle {
 public static void main(String[] args) {
         System.out.print(new Beemer().doStuff(11) + " ");
        new Bicycle().go(new Beemer());
         new Bicycle().go(new MotorVehicle());
         }
 //int doStuff(int x) { return x * 3; }                // must be public or protected, not default
}
