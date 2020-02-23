package com.interfacemockup;

import java.util.ArrayList;

public class Array_List {

    public static void main(String[] args) {

        ArrayList<String> spisak = new ArrayList<String>(3);
        spisak.add("Hallo");
        spisak.add(" svete");
        spisak.add(" ne");
        spisak.add(" budi");
        spisak.add(" dete");
        spisak.add(" bre!");


        for (String s : spisak){
            System.out.print(s);
        }

        System.out.println("");

        spisak.remove(2);
        for (String s : spisak){
            System.out.print(s);
        }

        System.out.println("next line is");

        spisak.set(0, "SSSSSSSSSSSSSS");
        for (String s : spisak){
            System.out.print(s);
        }

        System.out.println("next line is");
        spisak.clear();

        for (String s : spisak){
            System.out.print(s);
        }


    }
}
