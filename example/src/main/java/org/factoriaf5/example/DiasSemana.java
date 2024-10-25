package org.factoriaf5.example;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class DiasSemana {
    
    private List<String> dias;

    public DiasSemana(){
        dias=new ArrayList<>();
    }

    public void crearListaDias(){
        dias.clear();
        dias.add("Lunes");
        dias.add("Martes");
        dias.add("Miércoles");
        dias.add("Jueves");
        dias.add("Viernes");
        dias.add("Sábado");
        dias.add("Domingo");
    }

    public List<String> devolverDias(){
        return new ArrayList<>(dias);
    }

    public int longitudDias(){
        return dias.size();
    }

    public void eliminarDias(String dia){
        dias.remove(dia);
    }

    public String devolverDia (int indice){
        if (indice>=0 && indice<6){
            return dias.get(indice);
        }
        return null;
    }

    public boolean diasExiste(String dias){
        return dias.contains(dias);
    }

    public void alfabeticamenteDias(){
        Collections.sort(dias);
    }

    public void eliminarLista(){
        dias.clear();
    }
    }

