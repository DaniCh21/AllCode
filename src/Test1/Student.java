package Test1;

public class Student extends Group{
    String name;
    double oc;
    Student(String name , double oc){
        this.name=name;
        this.oc=oc;
        add(this);
    }
    public String toString()
    {
        return "Name:"+ this.name+ "   B:"+ this.oc;
    }
}