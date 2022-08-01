package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        System.out.println("Enunciado: Employing TDD, create a method that takes in an integer n and returns an array of all odd integers from 1 to n. Write your tests first!");
        System.out.println("Resultado del ejercicio 1 \nEscribe un valor numérico positivo");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        writeOdd(num);
        System.out.println(Arrays.toString(writeOdd(num)));
    }


    // Ejercicio 1
    private static int[] array;

    public static int[] writeOdd(int n){
        if (n > 0){
            if ( n%2 == 0){
                int length = n/2;
                array = createArray(length);
            } else {
                int length = (n+1)/2;
                array = createArray(length);
            }
        } else {
            throw new IllegalArgumentException("El numero debe ser mayor que 0");
        }
        return array;
    }

    public static int[] createArray(int length) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++){
            int value = 2*i + 1;
            array[i] = value;
        }
        return array;
    }
}
