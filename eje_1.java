package com.vehiculo;

public class suma {

    int num1;
    int num2;
    int num3;

    @Override
    public String toString() {
        return "suma{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                ", num3=" + num3 +
                '}';
    }

    public suma(int num1, int num2, int num3){


        int resultado = num1 + num2 + num3;

        System.out.println(resultado);

    }


    public static void main(String[] args) {
        new suma(1,2,3);
        new suma(5,3,5);
        new suma(33,4,55);
    }


}
