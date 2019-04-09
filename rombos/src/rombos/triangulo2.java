
package rombos;

import java.util.Scanner;

public class triangulo2 {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        int tam, f, c;
        System.out.println("Digite el tamaño del triangulo");
        tam = entrada.nextInt();
        f = 1;
        while (f <= tam){
            c = 1;
            while (c <= tam){
                System.out.print("*");
                c = c + 1;
            }
            tam = tam - 1;
            System.out.println("");
        }
    }
}
