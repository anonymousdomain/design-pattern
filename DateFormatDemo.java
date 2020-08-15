package SpringFrameWork.DateFormatDemo;

import java.text.*;
import java.util.*;

public class DateFormatDemo {

    public static void main(String[] args) {
        Date date = new Date();
        DateFormat df;
        df = DateFormat.getDateInstance(DateFormat.SHORT, Locale.JAPAN);
        System.out.println("Japen:" + df.format(date));
        df = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.UK);
        System.out.println("uk:" + df.format(date));
        df = DateFormat.getDateInstance(DateFormat.LONG, Locale.US);
        System.out.println("us:" + df.format(date));
        df = DateFormat.getDateInstance(DateFormat.FULL, Locale.CANADA);
        System.out.println("canada:" + df.format(date));
        System.out.println();
        df = DateFormat.getTimeInstance(DateFormat.SHORT, Locale.JAPAN);
        System.out.println("japan:" + df.format(date));
        df = DateFormat.getTimeInstance(DateFormat.SHORT, Locale.UK);
        System.out.println("uk:" + df.format(date));
        df = DateFormat.getTimeInstance(DateFormat.SHORT, Locale.US);
        System.out.println("us:" + df.format(date));
        df = DateFormat.getTimeInstance(DateFormat.SHORT, Locale.CANADA);
        System.out.println("Canada:" + df.format(date));
    }

}