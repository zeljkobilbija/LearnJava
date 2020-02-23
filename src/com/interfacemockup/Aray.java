package com.interfacemockup;

public class Aray {
    public static void main(String[] args) {


        String nizStringi[] = {"Prvga", "Dva", "tri", "cetiri"};

        int[] brojevi = {1,4,5,7,56};
        /*
           int[] brojevi = new int[3];
           int[] brojevi = {1,2,3};
           int[] brojevi = new int[]{1,2,3};
        */


        System.out.println(brojevi[2]);
        System.out.println(nizStringi[1]);


        pretvoriStringuUBroj();

    }



    public static void  pretvoriStringuUBroj(){
        String str = "105";
        int broj = Integer.parseInt(str);
        System.out.println(broj);
    }
}
