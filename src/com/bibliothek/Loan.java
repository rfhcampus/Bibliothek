package com.bibliothek;

import java.util.Calendar;

public class Loan {
    //Variablen deklarieren
    int borrowedBook;
    float borrowBegin;
    float borrowEnd;
    int borrowingUser;

    Calendar cal = Calendar.getInstance ();

    // Die Monate werden mit 0 (= Januar) beginnend gezaehlt!
    // (Die Tage im Monat beginnen dagegen mit 1)

    public String getDate; {

  System.out.println("Datum: "+cal.get(Calendar.DAY_OF_MONTH )+
                "."+(cal.get(Calendar.MONTH )+1)+
                "."+cal.get(Calendar.YEAR ));

  System.out.println("Uhrzeit: "+cal.get(Calendar.HOUR_OF_DAY )+":"+
                cal.get(Calendar.MINUTE )+":"+
                cal.get(Calendar.SECOND )+":"+
                cal.get(Calendar.MILLISECOND ));
    }
}
