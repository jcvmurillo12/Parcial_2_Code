package Parcial_2_Code; 

import java.util.Scanner;

public class parcial_2_code {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de elementos del array: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] array = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el valor " + (i + 1) + ": ");
            array[i] = sc.nextLine();
        }

        System.out.println("\nArray original:");
        mostrarArray(array);

        String[] invertido = invertirArray(array);

        System.out.println("\nArray invertido:");
        mostrarArray(invertido);

        sc.close();
    }

    public static String[] invertirArray(String[] array) {
        String[] invertido = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            invertido[i] = array[array.length - 1 - i];
        }
        return invertido;
    }

    public static void mostrarArray(String[] array) {
        System.out.print("[ ");
        for (String elem : array) {
            System.out.print(elem + " ");
        }
        System.out.println("]");
    }
}
