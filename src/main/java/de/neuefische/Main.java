package de.neuefische;

public class Main {

    public static void main(String[] args) { //psvm oder main

        //primitive Datentypen

        //Ganzzahlen
        byte exampleByte = 1; //8-bit => -128 - 127
        short exampleShort = 1; //16-bit => -32.768 - 32.767
        int exampleInt = 1; //32-bit => -2.147.483.648 - 2.147.483.647 !!!
        long exampleLong = 2147483648L; //64-bit Wenn int mal nicht ausreichend!

        //Kommazahlen
        float exampleFloat = 1.1f; //32-bit => Nicht so genau nach dem Komma!
        double exampleDouble = 1.0; //64-bit Go to für Kommazahlen die KEIN Geld sind!

        //Wahrheitszustände
        boolean exampleBoolean = true; //AUSSCHLIEßLICH true oder false sein!

        //Zeichen
        char exampleChar = 'a';

        //Operatoren für primitive Datentypen
          //Mathematische Operatoren
            int sum = exampleInt+exampleInt; //Addition
            int dif = exampleInt-exampleInt; //Substraktion
            int prod = exampleInt*exampleInt; //Multiplikation
            int qout = exampleInt/exampleInt; //Division
            int modulo = exampleInt%exampleInt; //Errechnet Rest

          //Vergleichsoperatoren
            boolean isEqual = exampleInt == exampleInt; //Gleichheit prüfen
            boolean isGreater = exampleInt > exampleInt; //Größer als
            boolean isLower = exampleInt < exampleInt; //Kleiner als
            boolean isNotEqual = exampleInt != exampleInt; //Ist NICHT gleich

          //Logische Operatoren
            boolean logicalAnd = exampleInt < 2 && exampleInt >0; //Logisches UND
            boolean logicalOr = exampleInt < 2 || exampleInt >0; //Logisches ODER
            boolean logicalNot = !(exampleInt == exampleInt); //Logisches NICHT



        //komplexe Datentypen

        //Zeichenketten
        String exampleString = "Hallo alle!";

        System.out.println("Hallo Welt"); // sout

    }
}