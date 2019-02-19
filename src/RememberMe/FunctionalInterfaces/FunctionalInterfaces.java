package RememberMe.FunctionalInterfaces;

/*
Функціональний інтерфейс - це інтерфейс, який має довільну кількість default'них та static'них методів, але тільки
ОДИН abstract'ний метод.
*/

public class  FunctionalInterfaces {
    public static void main(String[] args) {
        Parent p = new Child();
        p.m();
    }
}

interface I1{
    default void m1(){}
    default void m2(){}
    static void m3(){}
    static void m4(){}
    void m5();
    void m6();
}

@FunctionalInterface            // annotation metaData
interface I2{
    default void m1(){}
    default void m2(){}
    static void m3(){}
    static void m4(){}
    void m5();
//  void m6();                   /////////ONLY ONE ABSTRACT METHOD///////////
}

class Parent{
    protected void m(){
        System.out.println("Parent");
    }
}
class Child extends Parent{
    @Override                   // By doing this if we incidently overload method with something like "public void m(int x)" below we will get an error
    public void m(/*int x*/){   // !! If uncomment this we will get an error
        System.out.println("Child");
    }
}