package DaysOfWorldWarll;

import java.util.*;

public class DaysOfWorldWarll {
    public static void main(String[] args){
        GregorianCalendar startOfWar = new GregorianCalendar(1939, 9, 1);
        GregorianCalendar endOfWar = new GregorianCalendar(1945, 9, 2);
        allWar(startOfWar);
        int dayOfStart = startOfWar.get(Calendar.DAY_OF_YEAR);
        int dayOfEnd = endOfWar.get(Calendar.DAY_OF_YEAR);
        System.out.println("War was " + (daysOfWar - dayOfStart + dayOfEnd) + " days long.");
    }

    public static int daysOfWar = 0;

    private static void allWar(GregorianCalendar g){
        GregorianCalendar g1 = new GregorianCalendar(2000, 4 , 5);
        for (int i = 0; i < 6; i++){
            g1.set(g.get(Calendar.YEAR)+ i, Calendar.DECEMBER, 31);
            daysOfWar += g1.get(Calendar.DAY_OF_YEAR);
        }
    }
}
