package org.factoriaf5.example;
import java.util.Scanner;

public class Multiplicar {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("De que numero quieres saber la tabla de multiplicar?");
        int principal = scanner.nextInt();

        for (int i=0; i<=10; i++)
        {int resultado= principal * i;
        System.out.println( principal +"*"+ i +" = "+ resultado);}

    }
}
