package Students;

class Group {
    private boolean isChangeable = true;
    private static final int MAX_STUDENTS = 30;
    int numberOfStudents;
    final Student students[] = new Student[MAX_STUDENTS];
    Student temp;
    int numberOfKicked = 0;
    final Student namesOfKicked[] = new Student[MAX_STUDENTS];

    private boolean changeStudentsMarks(int index, double newMark) {
        if (!isChangeable) {
            System.out.println("Can't change, because this is final group");
            return false;
        }

        if (index < numberOfStudents) {
            System.out.println("Student " + students[index].name + " used to have average estimate: " + students[index].averageMark + ", but now it is: " + newMark + ".");
            students[index].averageMark = newMark;
        } else {
            System.out.println("Can't change average estimate, due to student with this index (" + index + ") does not exist.");
            return false;
        }
        return true;
    }

    private boolean addStudent(Student student) {

        if (!isChangeable) {
            System.out.println("Can't change, because this is final group");
            return false;
        }

        if (numberOfStudents < students.length) {
            numberOfStudents++;
            students[numberOfStudents - 1] = student;
            System.out.println("Student " + student.name + " added.");
        } else {
            System.out.println("This group already have 30 students.");
            return false;
        }

        return true;
    }

    private boolean kickStudent(int index) {
        if (!isChangeable) {
            System.out.println("Can't change, because this is final group");
            return false;
        }
        temp = students[index];
        if (index < numberOfStudents) {
            if (numberOfKicked < namesOfKicked.length) {                            //creating an array of kicked students
                numberOfKicked++;
                namesOfKicked[numberOfKicked - 1] = temp;
                System.out.println("Student " + temp.name + " kicked.");
                for (int g = 1; g < (numberOfStudents - index + 1); g++) {
                    students[index - 1 + g] = students[index + g];
                }
                numberOfStudents--;
            } else{
                System.out.println("This group already had kicked 30 students. Student " + temp.name + " can't be kicked.");
                return false;
            }
        } else{
            System.out.println("Can't kick, due to student with this index (" + index + ") does not exist.");
            return false;
        }
        return true;
    }

    protected void displayAllCurrentStudents() {
        System.out.println("////////////////////////////////////");
        System.out.println("CURRENT STUDENTS IN GROUP:");

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println((i + 1) + ". Student " + students[i].name + " has average estimate: " + students[i].averageMark + ". Index (" + i + ")");
        }

        System.out.println("////////////////////////////////////");

    }

    protected void displayKickedStudents() {
        System.out.println("------------------------------------");
        System.out.println("These students were kicked:");

        for (int i = 0; i < numberOfKicked; i++) {
            System.out.println((i + 1) + ". Student " + namesOfKicked[i].name + " has average estimate: " + namesOfKicked[i].averageMark + ". Index (" + i + ")");
        }

        System.out.println("------------------------------------");

    }



    Group(Group group) {
        if (group != null) {
            isChangeable = false;

            for (int cnt = 0; cnt < group.students.length; cnt++) {
                this.students[cnt] = group.students[cnt];
            }

            for (int cnt = 0; cnt < group.namesOfKicked.length; cnt++) {
                this.namesOfKicked[cnt] = group.namesOfKicked[cnt];
            }

            this.temp = group.temp;
            this.numberOfStudents =
                    group.numberOfStudents;
            this.numberOfKicked = group.numberOfKicked;

        }

    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        Group da = new Group(null);
        Student Petrow = new Student("Vasilii", 9.6);
        Student Mogutov = new Student("Ivan", 10.8);
        Student Gasanov = new Student("Jessie", 6.5);
        Student Petrenko = new Student("Iwar", 11.6);
        Student Ivanov = new Student("Vasilii", 8.9);

        da.addStudent(Petrenko);
        da.addStudent(Petrow);
        da.addStudent(Mogutov);
        da.addStudent(Gasanov);
        da.addStudent(Ivanov);

        da.addStudent(new Student("Karlos", 8.0));
        da.addStudent(new Student("Karlos2", 8.0));
        da.kickStudent(3);
        da.addStudent(new Student("Major", 11.99));
        da.addStudent(new Student("Karina", 10.4));
        da.addStudent(new Student("Karina2", 10.4));
        da.addStudent(new Student("Karina3", 10.4));
        da.addStudent(new Student("Karina4", 10.4));


        da.kickStudent(7);
        da.addStudent(new Student("Karliiitoos", 8.0));
        System.out.println("///////////////////////////////////////");
        da.displayAllCurrentStudents();
        da.kickStudent(2);
        da.displayAllCurrentStudents();
        da.addStudent(new Student("Lololoshka", 10.1));
        da.displayAllCurrentStudents();
        da.displayKickedStudents();
        da.changeStudentsMarks(6, 9.9);
        da.displayAllCurrentStudents();
        da.displayAllCurrentStudents();

        System.out.println("finalized\n");
        da = new Group(da);
        da.displayAllCurrentStudents();
        da.displayKickedStudents();

        System.out.println("edited\n");

        System.out.println("status: " + da.addStudent(new Student("Karina5", 10.4)));

        da.displayAllCurrentStudents();


    }
}

