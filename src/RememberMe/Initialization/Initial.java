package RememberMe.Initialization;

/* Статические поля инициализируются при первом обращении к класу, даже перед ПЕРВЫМ вызовом метода "main". Не
статические поля инициализируются перед каждым вызовом конструктора.

                                        Initialization priority:
                            Static fields (even before "main" and only one time)
                                                !!!
                            Non-static fields (everytime when constructor called)
                                                !!!
                                             Constructor
                                                !!!

*/

class Machines{
    int amount;
    Machines(int amount){
        this.amount = amount;
        System.out.println("There are " + amount + " machines");
    }
}

class Factory{
    int size;
    Machines m1 = new Machines(67);
    Factory(int size){
        this.size = size;
        System.out.println("Inside Factory's constructor");
        System.out.println("Factory with size: " + size);
    }
    Machines m3 = new Machines(29);
    static Machines m2 = new Machines(34);                              // prints only onetime because of static field
}

class MegaFactory{
    static Factory fac1 = new Factory(257);
        void met1(int a){
            System.out.println("Met1 - " + a);
    }
    static Factory fac2 = new Factory(789);
}



public class Initial {
    public static void main(String[] args) {
        Factory mainfac1 = new Factory(678);
        mega2.met1(13);                                                               // can't write mega3.met1 because this field is non-static and due to we do not have a constructor in class Initial
    }
    static MegaFactory mega1 = new MegaFactory();                                       // summons 34-static -> 67,29-non-static -> inside -> size257
    static MegaFactory mega2 = new MegaFactory();                                       // summons 67,29-non-static -> inside -> size257
    MegaFactory mega3 = new MegaFactory();                                              // can't used - no constructor in class
}
