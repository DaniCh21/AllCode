package UniversityPractice;

import java.util.Scanner;

public class ReverseOrder {
    String command1="view" ,command2="end" ,command3="ref" ,command4="rev" ,command5="help" ;
    int index ;
    static int array[] = new int[50];
    Scanner scaner = new Scanner(System.in);
    public static void main(String[] args) {
        ReverseOrder start = new ReverseOrder() ;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println(" list comand : \n"+"view - show array \n"+ "ref- refresh array\n"+"rev - reverse array \n"+"end - exit program \n");
        start.entered();
        System.out.println();
    }
    void entered (){
        String command = scaner.next();
        checkComand(command);
    }

    void end (){
        // exit program
        System.out.println("BB");
    }

    void view(){
        System.out.println("Defolt array :");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        entered();
    }

    void refresh (){
        //  filling new array
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println("refresh complete");
        System.out.println();
        entered();
    }

    void reverse (){
        //Reverse
        System.out.println("Reverse array :");
        for (int i = 0 ; i <array.length/2; i++){
            System.out.print(array[array.length-1-i]+" ");
            System.out.print(array[i]+" ");
        }
        System.out.println();
        entered();
    }

    void help (){
        System.out.println("view - show array \n"+ "ref- refresh array\n"+"rev - reverse array \n"+"end - exit program \n");
        entered();
    }

    void checkComand(String s) {
        //check entered command
        if (s.compareTo(command1) == 0) {
            view();
        } else if (s.compareTo(command2) == 0) {
            end();
        } else if (s.compareTo(command3) == 0) {
            refresh();
        } else if (s.compareTo(command4) == 0) {
            reverse();
        } else if (s.compareTo(command5) == 0) {
            help();
        } else {
            System.out.println("uncorrect command (for check command list entered \"help\") ");
            entered();
        }
    }







}
