package org.factoriaf5.example;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
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

    @Test
    public void testCheckPositivoError(){
        int number=-4;
        assertThrows(IllegalArgumentException.class,()->{
            example.checkPositivo(number);
        });
    }

//3
    @Test
    public void testContarLetrasA(){

        assertEquals(3, example.contarLetrasA("macarena"));
        assertEquals(0, example.contarLetrasA("pez"));
    }

    @Test
    public void testContarLetrasASinA(){
        String cadena ="kcghnmioltsh";
        int result = this.example.contarLetrasA(cadena);
        assertEquals(0,result);
    }

    @Test
    public void testContarLetrasAEmpty(){
        String cadena = "";
        int result = this.example.contarLetrasA(cadena);
        assertEquals(0,result);
    }



//4
    @Test
    public void testContieneElempento(){
        List <String> animales = Arrays.asList("perro" , "gato" , "raton");
        String animal = "perro";
        boolean result = this.example.contieneElemento(animales, animal);
        assertTrue(result);

    }

    @Test
    public void testContieneElementoNoExiste(){
        List <String> animales = Arrays.asList("perro" , "gato" , "raton");
        String animal = "serpiente";
        boolean result = this.example.contieneElemento(animales, animal);
        assertFalse(result);
    }

//5
    @Test
    public void testRevertirCadena(){
        String cadena = ("mar");
        String result = this.example.revertirCadena(cadena);
        assertEquals("ram",result);
    }

//6
    @Test
    public void testFactorial(){
        int number = 6;
        long result = this.example.factorial(number);
        assertEquals(720,result);
    }

    @Test
    public void testFactorialError(){
        int number = -6;
        assertThrows(IllegalArgumentException.class, () -> {
            this.example.factorial(number);
        });
    }

//7
    @Test
    public void testEsPrimo(){
        assertTrue(example.esPrimo(3));
        assertTrue(example.esPrimo(7));
        assertFalse(example.esPrimo(8));
        assertFalse(example.esPrimo(10));
    }

//8
    @Test
    public void testMensajeConRetraso () throws InterruptedException{
        String result = this.example.mensajeConRetraso();
        assertEquals("Listo después de retraso",result);
    }

    @Test
    public void testMensajeConRetrasoInterrumpido(){
        Thread.currentThread().interrupt();
        assertThrows(InterruptedException.class, () -> {
            this.example.mensajeConRetraso();
        });
        Thread.interrupted();
    }
    
//9
    @Test
    public void testConvertirAString(){
        List<Integer> lista = Arrays.asList(1, 2, 3, 4);
        List<String> cambio = Arrays.asList("1", "2", "3", "4");
        assertEquals(cambio, example.convertirAString(lista));
    }
}

