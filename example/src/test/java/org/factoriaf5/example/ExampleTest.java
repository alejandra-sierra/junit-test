package org.factoriaf5.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertTrue;


import static org.junit.jupiter.api.Assertions.assertFalse;


import static org.junit.jupiter.api.Assertions.assertThrows;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ExampleTest {

    private Example example;

    //por cada test que haga estancia el new example init=inicializacion
    @BeforeEach
    public void init(){
        this.example = new Example();
    }

//1
@Test
    public void testSumar (){
    //Given
    int num1=35;
    int num2 =79;
    //When
    int result = example.sumar(num1, num2);
    //Then
    assertEquals(114, result);
    }

//2
@Test
    public void testCheckPositivo(){
        int number= 4;
        boolean result =example.checkPositivo(number);
        assertTrue(result);
    }

//3
@Test
    public void testContarLetrasA(){

        assertEquals(3, example.contarLetrasA("macarena"));
        assertEquals(0, example.contarLetrasA("pez"));
    }

//4
@Test
    public void testContieneElempento(){
        List <String> animales = Arrays.asList("perro" , "gato" , "raton");
        assertTrue(example.contieneElemento(animales, "perro"));
        assertFalse(example.contieneElemento(animales,"zorro"));
    }

//5
@Test
    public void testRevertirCadena(){
        List <String> principal = Arrays.asList("perro" , "gato" , "raton");
        List <String> inversa = Arrays.asList("raton" , "gato" , "perro");
        assertEquals(inversa, principal);
    }

//6
@Test
    public void testFactorial(){
        assertEquals(120, example.factorial(5));
        assertThrows(IllegalArgumentException("Factorial no definido para números negativos"),example.factorial(-1));

    }

//7
@Test
    public void 
}

