package Students;

class Group{
    int numberOfStudents;
    Student temp;
    final Student namesOfCurrent[]= new Student[30];
    void addStudent(Student student){
        numberOfStudents++;
        for (int i = 0; i < numberOfStudents; i++){
            if (namesOfCurrent[i] == null){                                 //проверка на null (при удалении индекс ссылается на null) и запись в эту ячейку
                namesOfCurrent[i] = student;
                break;
            }
        }
    }
    void kickStudent (int index){
        numberOfStudents--;
        temp = namesOfCurrent[index];
        System.out.println("Student " + namesOfCurrent[index].name + " was kicked");
        namesOfCurrent[index] = null;
    }

    void displayAllCurentStudents(){
        System.out.println("////////////////////////////////////");
        System.out.println("CURRENT STUDENTS IN GROUP:");
        for (int i = 0; i < numberOfStudents; i++){
            if (namesOfCurrent[i] != null) {
                System.out.println((i+1) + ". Student " + namesOfCurrent[i].name + " has average estimate: " + namesOfCurrent[i].ovverageMark + ". Index (" + i + ")");
            } else System.out.println("Sorry. Student " + temp.name + " that had average estimate: " + temp.ovverageMark + " and with this index (" + i + ") was kicked");
        }
        System.out.println("////////////////////////////////////");

    }

    Group(int numberOfStudents){
        this.numberOfStudents = numberOfStudents;
    }


}

