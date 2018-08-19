package Test1;

import java.util.*;

public class Main {



    public static void swap (GregorianCalendar a, GregorianCalendar b) {
        GregorianCalendar temp = a;
        a = new GregorianCalendar(2012, 1, 1);
        b.set(100000, 1, 1);
    }

    public static void main(String [] args) {
        GregorianCalendar one = new GregorianCalendar(2010, 1, 1);
        GregorianCalendar two = new GregorianCalendar(2011, 1, 1);

        swap(one, two);

        //System.out.println(c1.get(Calendar.DATE) + c1.get(Calendar.MONTH) + c1.get(Calendar.YEAR));
        System.out.println(two.get(Calendar.YEAR));
    }
}

