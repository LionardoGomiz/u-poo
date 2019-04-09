
package rombos;

import java.util.Scanner;

public class Rombo {
    public static void main(String[] args) {
        int tam, f, c;
        System.out.println("Digite el ancho maximo del rombo");
        Scanner entrada = new Scanner(System.in);
        tam = entrada.nextInt();
        tam = tam - 1;
        f = 0;
        while (f < tam){
            c = tam - f;
            while (c >= 1){
                System.out.print(" ");
                c = c - 1;
            }
            c = 0;
            while (c <= f){
                System.out.print(" *");
                c = c + 1;
            }
            System.out.println("");
            f = f + 1;
        }
        
        f = - 1;
        while (f < tam){
            System.out.print(" *");
            f = f + 1;
        }
        System.out.println("");
        f = 0;
        while (f < tam){
            c = 0;
            while (c <= f){
                System.out.print(" ");
                c = c + 1;
            }
            c = tam - f;
            while (c >= 1){
                System.out.print(" *");
                c = c - 1;
            }
            System.out.println("");
            f = f + 1;
        } 
    }  
}
