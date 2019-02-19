package RememberMe.Overriding;

public class Overriding {
    public static void main(String[] args) {
        Parent p = new Child();
        p.display();
    }
}
class Parent {
    void display() {
        System.out.println("Parent");
        }
}
class Child extends Parent {
    public void display() {
        System.out.println("Child");
        }
}


