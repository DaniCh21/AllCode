package Students;

class Dispatcher{
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

        System.out.println("finalized\n");
        da = new Group(da);
        da.displayAllCurrentStudents();
        da.displayKickedStudents();

        System.out.println("edited\n");

        System.out.println("status: " + da.addStudent(new Student("Karina5", 10.4)));

        da.displayAllCurrentStudents();

    }
}