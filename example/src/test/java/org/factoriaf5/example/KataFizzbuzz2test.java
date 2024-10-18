package org.factoriaf5.example;

import static org.junit.jupiter.api.Assertions.*;

public class KataFizzbuzz2test {
    public class KataFizzbuzzTest {

    @Test
    public void testFizzBuzz() {
        assertEquals("Fizz", KataFizzbuzz.fizzBuzz(3));
        assertEquals("Fizz", KataFizzbuzz.fizzBuzz(13));
        assertEquals("Fizz", KataFizzbuzz.fizzBuzz(6));
        assertEquals("Buzz", KataFizzbuzz.fizzBuzz(5));
        assertEquals("Buzz", KataFizzbuzz.fizzBuzz(25));
        assertEquals("Fizz", KataFizzbuzz.fizzBuzz(30));
        assertEquals("1", KataFizzbuzz.fizzBuzz(1));
        assertEquals("7", KataFizzbuzz.fizzBuzz(7));
    }
}
}
