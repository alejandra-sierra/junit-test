package org.factoriaf5.example;

import java.util.Scanner;
public class KataFizzbuzz2 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe un numero");
        int i=scanner.nextInt();

        String numero = String.valueOf(i);

            if(i%3==0 || numero.contains("3")){
                System.out.println("Fizz");
            }

            else if (i%5==0 || numero.contains("5")){
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }
    
        }
}