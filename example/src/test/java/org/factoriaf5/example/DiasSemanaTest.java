package org.factoriaf5.example;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DiasSemanaTest {
    private DiasSemana diasSemana;

    @BeforeEach
    public void init() {
        diasSemana = new DiasSemana();
    }

    @Test
    public void testCrearListaDias() {
        diasSemana.crearListaDias();
        List<String> dias = diasSemana.devolverDias();
        assertEquals(7, dias.size());
        assertTrue(dias.contains("Lunes"));
        assertTrue(dias.contains("Martes"));
        assertTrue(dias.contains("Miércoles"));
        assertTrue(dias.contains("Jueves"));
        assertTrue(dias.contains("Viernes"));
        assertTrue(dias.contains("Sábado"));
        assertTrue(dias.contains("Domingo"));
    }

    @Test
    public void testDevolverDias() {
        diasSemana.crearListaDias();
        List<String> dias = diasSemana.devolverDias();
        assertEquals(7, dias.size());
    }

    @Test
    public void testLongitudDias() {
        diasSemana.crearListaDias();
        assertEquals(7, diasSemana.longitudDias());
    }

    @Test
    public void testEliminarDias() {
        diasSemana.crearListaDias();
        diasSemana.eliminarDias("Lunes");
        assertFalse(diasSemana.devolverDias().contains("Lunes"));
    }

    @Test
    public void testDevolverDia() {
        diasSemana.crearListaDias();
        assertEquals("Lunes", diasSemana.devolverDia(0));
        assertNull(diasSemana.devolverDia(6));
    }

    @Test
    public void testDiasExiste() {
        diasSemana.crearListaDias();
        assertTrue(diasSemana.diasExiste("Lunes"));
        assertFalse(diasSemana.diasExiste("Juernes"));
    }

    @Test
    public void testAlfabeticamenteDias() {
        diasSemana.crearListaDias();
        diasSemana.alfabeticamenteDias();
        List<String> dias = diasSemana.devolverDias();
        assertEquals("Domingo", dias.get(0));
        assertEquals("Viernes", dias.get(6));
    }

    @Test
    public void testEliminarLista() {
        diasSemana.crearListaDias();
        diasSemana.eliminarLista();
        assertEquals(0, diasSemana.longitudDias());
    }
}
