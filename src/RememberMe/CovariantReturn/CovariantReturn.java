package RememberMe.CovariantReturn;

//It's when you can return different type from method (but only type of classes, that extend Parent class)

public class CovariantReturn{
    public static void main(String[] args) {
        DogCreator d = new DogCreator();
        Dog pupp = d.process();
        System.out.println(pupp);
        d = new PoodleCreator();
        pupp = d.process();
        System.out.println(pupp);

    }
}

class Dog{
    public String toString(){
        return "Dog";
    }
}
class Poodle extends Dog{
    public String toString(){
        return "Poodle";
    }
}
class DogCreator {
    Dog process() {
        return new Dog();
    }
}

class PoodleCreator extends DogCreator{
    Poodle process() {
        return new Poodle();
    }
}