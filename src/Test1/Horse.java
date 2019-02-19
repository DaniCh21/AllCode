package Test1;

public class Horse {
 static String s = "";
 void beBrisk() { s += "trot "; }
 }

 class Andi extends Horse {
 void beBrisk() { s += "tolt "; }
 public static void main(String[] args) {
     Horse x0 = new Horse();
     Horse x1 = new Andi(); x1.beBrisk();
     Andi x2 = (Andi)x1; x2.beBrisk();
     //Andi x3 = (Andi)x0; x3.beBrisk();                // because we can't cast to Parent
     System.out.println(s);
     }
}

