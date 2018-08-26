package Students;

class Group{
    int numberOfStudents;
    final Student namesOfCurrent[] = new Student[30];
    Student temp;
    int numberOfKicked = 0;
    final Student namesOfKicked[] = new Student[30];

    void addStudent(Student student){
        if (numberOfStudents < namesOfCurrent.length){
        numberOfStudents++;
        namesOfCurrent[numberOfStudents - 1] = student;
            System.out.println("Student " + student.name + " added.");
        } else System.out.println("This group already have 30 students.");
    }

    void kickStudent (int index){
        temp = namesOfCurrent[index];
        if (numberOfKicked < namesOfKicked.length) {                            //creating an array of kicked students
            numberOfKicked++;
            namesOfKicked[numberOfKicked - 1] = temp;
        } else System.out.println("This group already had kicked 30 students.");

        for (int g = 1; g < (numberOfStudents - index + 1); g++){
            namesOfCurrent[index - 1 + g] = namesOfCurrent[index + g];
        }
        System.out.println("Student " + temp.name + " kicked.");
        numberOfStudents--;
    }

    void displayAllCurrentStudents(){
        System.out.println("////////////////////////////////////");
        System.out.println("CURRENT STUDENTS IN GROUP:");
        for (int i = 0; i < numberOfStudents; i++){
                System.out.println((i+1) + ". Student " + namesOfCurrent[i].name + " has average estimate: " + namesOfCurrent[i].ovverageMark + ". Index (" + i + ")");
        }
        System.out.println("////////////////////////////////////");

    }
    void displayKickedStudents(){
        System.out.println("------------------------------------");
        System.out.println("These students were kicked:");
        for (int i = 0; i < numberOfKicked; i++){
                System.out.println((i+1) + ". Student " + namesOfKicked[i].name + " has average estimate: " + namesOfKicked[i].ovverageMark + ". Index (" + i + ")");
        }
        System.out.println("------------------------------------");

    }

    Group(int numberOfStudents){
        this.numberOfStudents = numberOfStudents;
    }

}

