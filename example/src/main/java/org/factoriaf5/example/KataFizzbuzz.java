package org.factoriaf5.example;
import java.util.Scanner;

public class KataFizzbuzz {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe un numero");
        int i=scanner.nextInt();

            if(i/3==0){
                System.out.println("Fizz");
            }
            else if (i/5==0){
                System.out.println("Buzz");
            }
            else if (i/3==0 && i/5==0){
                System.out.println("FizzBuzz");
            }
            else {System.out.println(i);}
        }
}
