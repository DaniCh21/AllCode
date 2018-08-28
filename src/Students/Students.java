package Students;

class Student {
    String name;
    //public Student n[] = new Student[30];
    double averageMark;
    /*Student(String name, double averageMark){                                             // это я делал по-твоему (авто в массив)
        Student s = new Student();
        s.name = name;
        s.averageMark = averageMark;
        for (int i = 0; i < n.length; i++){
            if (n[i] == null) {
                n[i] = s;
                System.out.println("Name: " + n[i].name + "   Average estimate: " + n[i].averageMark);
                break;
            }
        }


    }
    private Student() {
        this.name = "non";
        this.averageMark = 0.00;
    }*/

    Student (String name, double averageMark){
        this.name = name;
        this.averageMark = averageMark;
    }
}



