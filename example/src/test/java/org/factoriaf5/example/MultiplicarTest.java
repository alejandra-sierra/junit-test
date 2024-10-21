import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MultiplicarTest {
    
    @Test
    public void testResultado() {


        Multiplicar multiplicar = new Multiplicar();

        String[] valorEsperado = {
            "2 x 1 = 2",
            "2 x 2 = 4",
            "2 x 3 = 6",
            "2 x 4 = 8",
            "2 x 5 = 10",
            "2 x 6 = 12",
            "2 x 7 = 14",
            "2 x 8 = 16",
            "2 x 9 = 18",
            "2 x 10 = 20"
        };
        
        String[] resultadoObtenido = multiplicar.resultado(2);
        
    }
}
