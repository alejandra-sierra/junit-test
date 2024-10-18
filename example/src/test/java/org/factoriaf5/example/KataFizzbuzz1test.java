package org.factoriaf5.example;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class KataFizzbuzz1test {

    rivate Example example;

    //por cada test que haga estancia el new example init=inicializacion
    @BeforeEach
    public void init(){
        this.example = new Example();
    }

    @Test
    public void() testFizz{
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe un numero");
        int i=scanner.nextInt();
  
        assertEquals("fizz", );

        

    }

    @Test
    public void testBuzz{

    }
}
