package org.factoriaf5.example;

public class Imc {
    

        public static double calcularImc(double peso, double estatura) {
            if (estatura <= 0) {
                throw new IllegalArgumentException("La estatura debe ser mayor que cero");
            }
            if (peso <= 0) {
                throw new IllegalArgumentException("El peso debe ser mayor que cero");
            }
            return peso / (estatura * estatura);
        }
    
        public static String clasificarImc(double imc) {
            if (imc < 18.5) {
                return "Bajo peso";
            } else if (imc >= 18.5 && imc < 24.9) {
                return "Peso normal";
            } else if (imc >= 25 && imc < 29.9) {
                return "Sobrepeso";
            } else {
                return "Obesidad";
            }
        }
    }
    
    
}
