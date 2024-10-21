package org.factoriaf5.example;

public class Multiplicar {

    public String [] resultado (int num){
        
        String [] tabla = new String[10];
        
        for (int multiplicador=1; multiplicador <= 10; multiplicador++){
            tabla [multiplicador-1]= num + " x " + multiplicador +" = "+(num*multiplicador);
        }
        return tabla;
    }
}

