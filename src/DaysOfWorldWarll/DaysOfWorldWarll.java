package DaysOfWorldWarll;

import java.util.*;

public class DaysOfWorldWarll {
    public static void main(String[] args){
        GregorianCalendar start = new GregorianCalendar(1939, Calendar.SEPTEMBER, 1);
        GregorianCalendar end = new GregorianCalendar(1945, Calendar.SEPTEMBER, 2);
        allWar(start, end);
        int dayOfStart = start.get(Calendar.DAY_OF_YEAR);
        int dayOfEnd = end.get(Calendar.DAY_OF_YEAR);
        System.out.println("War was " + (daysOfWar - dayOfStart + dayOfEnd) + " days long.");
    }

    private static int daysOfWar = 0;

    private static void allWar(GregorianCalendar start, GregorianCalendar end){
        GregorianCalendar g1 = new GregorianCalendar();
        for (int i = 0; i < end.get(Calendar.YEAR) - start.get(Calendar.YEAR); i++){
            g1.set(start.get(Calendar.YEAR)+ i, Calendar.DECEMBER, 31);
            daysOfWar += g1.get(Calendar.DAY_OF_YEAR);
        }
    }
}
