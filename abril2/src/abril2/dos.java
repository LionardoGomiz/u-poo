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
public class dos {
    public static int factorial(int n){
        int i, fac;
        fac = 1;
        for (i = 1; i<=n; i = i + 1){
            fac = fac * i;
        }
        return fac;
    }
    
    public static void main(String[] args){
        int r, num;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Inserte el numero del que quiere saber el factorial");
        num = entrada.nextInt();
        r = factorial(num);
        System.out.println("El factorial de " + num + " es " + r);
    }
}
