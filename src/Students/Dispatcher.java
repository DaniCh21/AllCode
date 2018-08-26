package Students;

class Dispatcher{
    public static void main(String[] args) {
        Group da = new Group(5);
        Student Petrow = new Student("Vasilii", 9.6);
        Student Mogutov = new Student("Ivan", 10.8);
        Student Gasanov = new Student("Jessie", 6.5);
        Student Petrenko = new Student("Iwar", 11.6);
        Student Ivanov = new Student("Vasilii", 8.9);

        //da.namesOfCurrent = new Student[]{Petrow, Mogutov, Gasanov, Petrenko, Ivanov};
        da.namesOfCurrent[0] = Petrow;
        da.namesOfCurrent[1] = Mogutov;
        da.namesOfCurrent[2] = Gasanov;
        da.namesOfCurrent[3] = Petrenko;
        da.namesOfCurrent[4] = Ivanov;
        da.addStudent(new Student("Karlos", 8.0));
        da.addStudent(new Student("Karlos2", 8.0));
        da.kickStudent(3);
        da.addStudent(new Student("Major", 11.99));
        da.addStudent(new Student("Karina", 10.4));
        da.addStudent(new Student("Karina2", 10.4));
        da.addStudent(new Student("Karina3", 10.4));
        da.addStudent(new Student("Karina4", 10.4));

        /*System.out.println("///////////////////");
        System.out.println(da.namesOfCurrent[0].name);
        System.out.println(da.namesOfCurrent[1].name);
        System.out.println(da.namesOfCurrent[2].name);
        System.out.println(da.namesOfCurrent[3].name);
        System.out.println(da.namesOfCurrent[4].name);
        System.out.println(da.namesOfCurrent[5].name);
        System.out.println(da.namesOfCurrent[6].name);
        System.out.println(da.namesOfCurrent[7].name);
        System.out.println(da.namesOfCurrent[8].name);
        System.out.println(da.namesOfCurrent[9].name);
        System.out.println(da.namesOfCurrent[10].name);*/

        da.kickStudent(7);
        da.addStudent(new Student("Karliiitoos", 8.0));
        System.out.println("///////////////////////////////////////");
        da.displayAllCurentStudents();
        da.kickStudent(2);
        da.displayAllCurentStudents();
        da.addStudent(new Student("Lololoshka", 10.1));
        da.displayAllCurentStudents();

    }
}