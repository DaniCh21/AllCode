package Birthdays;

import java.util.Calendar;
import java.util.*;

public class Birthdays {
    public static void main (String[] args) {
        GregorianCalendar c1 = new GregorianCalendar(2018, 0, 21);
        System.out.println("Your birthdays in near future:");
        fiveYearsBithdays(c1);
    }

    private static void fiveYearsBithdays(GregorianCalendar c1){
        String temp;
        for (int i = 0 ;i < 5 ; i++){
            c1.set(c1.get(Calendar.YEAR) + 1, Calendar.JANUARY, 21);
            switch (c1.get(Calendar.DAY_OF_WEEK)){
                case(1): temp = "Sunday"; break;
                case(2): temp = "Monday"; break;
                case(3): temp = "Tuesday"; break;
                case(4): temp = "Wednesday"; break;
                default:
                case(5): temp = "Thursday"; break;
                case(6): temp = "Friday"; break;
                case(7): temp = "Saturday"; break;
            }
            System.out.print(temp + ", ");
            System.out.print(c1.get(Calendar.DATE) + ".");
            System.out.print(c1.get(Calendar.MONTH) + "1.");
            System.out.print(c1.get(Calendar.YEAR));
            System.out.println();
        }

    }
}
