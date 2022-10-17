package com.vehiculo;

public class coche {
    int puertas = 0;

    public void Acoche(){

        this.puertas++;

    }

    public static void main(String[] args) {

        coche miCoche = new coche();
        miCoche.Acoche();
        miCoche.Acoche();
        miCoche.Acoche();
        System.out.println("este coche tiene: " + miCoche.puertas+ " puertas");

    }
}
