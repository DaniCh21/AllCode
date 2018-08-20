package Сalendar;

import java.util.*;
import java.util.Calendar;

public class Calendar1 {
    public static void main(String[] args){
        GregorianCalendar g1 = new GregorianCalendar(2018, 8, 1);
        doing(g1);
    }

    static int r = 0;

    static void doing(GregorianCalendar g) {
        for (int d = 0; d < 7; d++) {
            switch (d) {
                case(0): System.out.print("  Mon"); break;
                case(1): System.out.print("  Tue"); break;
                case(2): System.out.print("  Wed"); break;
                case(3): System.out.print("  Thu"); break;
                case(4): System.out.print("  Fri"); break;
                case(5): System.out.print("  Sat"); break;
                case(6): System.out.println("  Sun"); break;
            }
        }
        for (int j = 0; j < 5; j++){
            for (int i = 0; i < 7; i++){
                System.out.printf("%3f", g.get(Calendar.DAY_OF_MONTH) + r);
                r++;
            }
            System.out.println();
        }
    }
}
