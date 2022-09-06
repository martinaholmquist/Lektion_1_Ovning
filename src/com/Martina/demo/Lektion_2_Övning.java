package com.Martina.demo;

public class Lektion_2_Övning {

    //en metod
    public static void ifStatement(){
        int age = 20;
        if (age < 18) {
            System.out.println("underage");
        } else {
            System.out.println("adult");
        }

    }
    public static void forLoop(){
        for (int i = 1; i < 11; i++)
            System.out.println(i);

        for (int j = 1; j < 11; j++)
            if (j==10){
                System.out.println("index is 10");
            } else{
                System.out.println("index is not 10");
            }

    }
    public static void switcch(){
        String name = "Anton";
        switch (name){
            case "Johanna":
                System.out.println("Benny björn!");
                break;
            case "Anton":
                System.out.println("Anton hej å hå");
                break;
            default:
                System.out.println("nån annnan");
        }
    }

    public static void main(String[] args) {
        //skriver ut metoden
        ifStatement();
        forLoop();
        switcch();


      /*  int age = 20;
        String name = "Anton";

        if (age < 18) {
            System.out.println("underage");
        } else {
            System.out.println("adult");
        }

        for (int i = 1; i < 11; i++)
            System.out.println(i);

        for (int j = 1; j < 11; j++)
            if (j==10){
                System.out.println("index is 10");
        } else{
                System.out.println("index is not 10");
            }

        switch (name){
            case "Johanna":
                System.out.println("Benny björn!");
                break;
            case "Anton":
                System.out.println("Anton hej å hå");
                break;
            default:
                System.out.println("nån annnan");
        }
*/

    }
}
