/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abril2;

import java.util.Scanner;

/**
 *
 * @author ESTUDIANTE
 */
public class tres {
    public static int factorial(int n){
        int i, fac;
        fac = 1;
        for (i = 1; i<=n; i = i + 1){
            fac = fac * i;
        }
        return fac;
    }
    
    public static void main(String[] args){
        int r, num, sum;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Inserte la sumatoria que desea saber");
        num = entrada.nextInt();
        sum = 0;
        for (r = 1; r <= num; r = r + 1) {
            sum = sum + factorial(r);
        }
        System.out.println("La respuesta es " + sum);
    }
}
