package Students;

final class FinalGroup extends Group {

     Group receivedGroup;

    protected void displayAllCurrentStudents(){
        System.out.println("////////////////////////////////////");
        System.out.println("STUDENTS IN GROUP (FINAL VERSION):");

        for (int i = 0; i < receivedGroup.numberOfStudents; i++){
            System.out.println((i+1) + ". Student " + receivedGroup.students[i].name + " has average estimate: " + receivedGroup.students[i].averageMark + ". Index (" + i + ")");
        }

        System.out.println("////////////////////////////////////");

    }
    protected void displayKickedStudents(){
        System.out.println("------------------------------------");
        System.out.println("These students were kicked (final version):");

        for (int i = 0; i < receivedGroup.numberOfKicked; i++){
            System.out.println((i+1) + ". Student " + receivedGroup.students[i].name + " has average estimate: " + receivedGroup.students[i].averageMark + ". Index (" + i + ")");
        }

        System.out.println("------------------------------------");

    }

    FinalGroup (){
        super(null);
        }
}

