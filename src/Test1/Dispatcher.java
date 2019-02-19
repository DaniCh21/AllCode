package Test1;


 class Contact {
 String doStuff() { return "howdy "; }
 int a = 10;
 }

 class Supplier extends Contact {
 String doStuff() { return "send money ";}
 }

public class Dispatcher {
    public static void main(String[] args) {
        Supplier s1 = new Supplier();
        System.out.println(s1.doStuff());
        Contact c3 = new Contact();
        System.out.println(c3.doStuff());
        Contact c1 = s1;
        System.out.println(c1.doStuff());
        System.out.println(c1.a);
        Supplier s2 = (Supplier) c1;
        System.out.println(s2.doStuff());
        //Supplier s3 = (Supplier) c3;
        //Supplier s4 = new Contact();
        }
 }

