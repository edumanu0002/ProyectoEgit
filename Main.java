package pe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Lectura de números
        System.out.print("Introduce el primer número: ");
        int numero1 = sc.nextInt();
        
        System.out.print("Introduce el segundo número: ");
        int numero2 = sc.nextInt();
        
        System.out.println("Números ingresados: " + numero1 + " y " + numero2);
    }
}