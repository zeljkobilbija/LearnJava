package com.interfacemockup;


import org.jetbrains.annotations.Contract;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;


public class Main {

    public static void main(String[] args) {
	// write your code here
        int brojA = 22;

        //DateTimeFormatter format = DateTimeFormatter.BASIC_ISO_DATE;
        //LocalDate datum = LocalDate.now();
        DateTimeFormatter format = DateTimeFormatter.BASIC_ISO_DATE;
        LocalDate datum = LocalDate.now();
        String str = datum.format(format);

        int rez = zbir(10,20);
        System.out.println(rez);

        System.out.println(str);
        System.out.println(format);


        Locale lokal = new Locale("fr", "FR");
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DAY_OF_YEAR_FIELD, lokal);
        String date = dateFormat.format(new Date());
        System.out.print(date);


    }

    // TODO: 13/11/2019  Dovrsiti funkciju
    @Contract(pure = true)
    public static int zbir(int prviBroj, int drugiBroj){
        Locale lokal = new Locale("fr", "FR");
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DAY_OF_YEAR_FIELD, lokal);
        String date = dateFormat.format(new Date());
        System.out.print(date);



        int zbir = prviBroj + drugiBroj;
        return zbir;
    }


}
