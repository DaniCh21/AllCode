package Test1;

public class Group {


    Group  C []= new Student[30] ;
    void print () {
        System.out.println(this);
    }

    public void add(Student a) {
        for (int i = 0 ; i<C.length ; i++) {

            if (C[i]== null) {
                C[i]=a;
                C[i].print();
                break;

            }
            C[0].print();
            break;
        }


    }
}