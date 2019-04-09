
package rombos;

import java.util.Scanner;

public class triangulo4 {
    public static void main(String[] args) {
        int tam, c, f;
        System.out.println("Digite el tamaño del triangulo");
        Scanner entrada = new Scanner(System.in);
        tam = entrada.nextInt();
        f = 0;
        while (f < tam){
            c = tam - f;
            while (c >= 1){
                System.out.print(" ");
                c = c - 1;
            }
            c = 0;
            while (c <= f){
                System.out.print("*");
                c = c + 1;
            }
            System.out.println("");
            f = f + 1;
        }
    }
}
