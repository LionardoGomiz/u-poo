/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abril2;

import java.util.Scanner;

/**
 *
 * @author sebag
 */
public class potencia {
    public static int potencia(int base, int poten){
        int aux, i;
        if (poten == 0){
            aux = 1;
        }
        else {
            aux = base;
            for (i = 2; i <= poten; i = i + 1) {
                aux = aux * base;
            }
        }
        return aux;
    }
    
    public static void main(String[] args){
        int r, base, poten;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Inserte la base");
        base = entrada.nextInt();
        System.out.println("Inserte la potencia");
        poten = entrada.nextInt();
        r = potencia(base, poten);
        System.out.println("Resultado es " + r);
    }
}
