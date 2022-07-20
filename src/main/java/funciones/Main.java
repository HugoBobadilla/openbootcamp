/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;

/**
 *
 * @author hugo
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(sum(5, 10, 20));
        
        System.out.println("-----Mi Coche-----");
        Coche miCoche = new Coche();
        miCoche.incrementarPuertas();
        miCoche.incrementarPuertas();
        System.out.println("Número de puertas: " + miCoche.numPuertas);
    }
    
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }
    
}

class Coche {
    int numPuertas = 0;
    
    public void incrementarPuertas() {
        this.numPuertas += 1;
    }
}