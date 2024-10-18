package org.factoriaf5.example;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;


public class KataFizzbuzz1test {
    
    @BeforeEach
    public void init(){
        this.example = new Example();
    }

    @Test
    public void testFizzBuzz() {
        assertEquals("FizzBuzz", fizzBuzz(15));
        assertEquals("Buzz", fizzBuzz(10));
        assertEquals("Fizz", fizzBuzz(9));
        assertEquals("4", fizzBuzz(4));
        assertEquals("FizzBuzz", fizzBuzz(30));
        assertEquals("Fizz", fizzBuzz(6));
        assertEquals("Buzz", fizzBuzz(25));
        assertEquals("1", fizzBuzz(1));
    }

    private String fizzBuzz(int i) {
        if (i % 3 == 0 && i % 5 == 0) {
            return "FizzBuzz";
        } else if (i % 5 == 0) {
            return "Buzz";
        } else if (i % 3 == 0) {
            return "Fizz";
        } else {
            return String.valueOf(i);
        }
    }
}

}
