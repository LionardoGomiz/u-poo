/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abril9;

import java.util.Scanner;

/**
 *
 * @author ESTUDIANTE
 */
public class binomio_de_newton {
    public static int factorial(int num){
        int i, f;
        f = 1;
        for (i = 2; i <= num; i++) {
            f = f * i;
        }
        return f;
    }
    
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int r,n,m,t,numerador,deno1,deno2;
        System.out.println("Ingrese el tamaño del triangulo de pascal");
        t = entrada.nextInt();
        for (m = 0; m <= t; m++) {
            for (n = 0; n <= m; n++) {
                numerador = factorial(m);
                deno1 = factorial(n);
                deno2 = factorial(m-n);
                r = numerador/(deno1*deno2);
                System.out.print(" " + r);
            }
            System.out.println();
        }
    }
}
