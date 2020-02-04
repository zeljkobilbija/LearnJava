package com.interfacemockup;

public class Funkcije {
    public static void main(String[] args) {

        mojMethod();

        int broj = vratiBroj(5,9);
        System.out.println(broj);

    }


    public static void mojMethod(){
        System.out.println("Hallo svete");
    }

    public static void drugaFunkcija(int a, int b){

    }

    public static int vratiBroj(int x, int y){
        int zbir = x + y;
        return zbir;
    }


}
