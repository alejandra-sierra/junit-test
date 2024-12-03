package org.factoriaf5.example;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ImcTest {
    
        @Test
        public void testCalcularIMC() {
            assertEquals(22.86, Imc.calcularImc(70, 1.75), 0.01);
            assertEquals(19.53, Imc.calcularImc(50, 1.60), 0.01);
            assertEquals(27.78, Imc.calcularImc(90, 1.80), 0.01);
        }
    
        @Test
        public void testClasificarIMC() {
            assertEquals("Bajo peso", Imc.clasificarImc(18));
            assertEquals("Peso normal", Imc.clasificarImc(22));
            assertEquals("Sobrepeso", Imc.clasificarImc(27));
            assertEquals("Obesidad", Imc.clasificarImc(32));
        }
    
        @Test
        public void testEstaturaInvalida() {
            Exception exception = assertThrows(IllegalArgumentException.class, () -> {
                Imc.calcularImc(70, 0);
            });
            assertEquals("La estatura debe ser mayor que cero", exception.getMessage());
        }
    
        @Test
        public void testPesoInvalido() {
            Exception exception = assertThrows(IllegalArgumentException.class, () -> {
                Imc.calcularImc(0, 1.75);
            });
            assertEquals("El peso debe ser mayor que cero", exception.getMessage());
        }
    }
    


