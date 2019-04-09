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
public class factorial {
    public static void main(String[] args){
        int fac, i, num;
        fac = 1;
        System.out.println("Inserte el numero del que quiere saber el factorial");
        Scanner entrada = new Scanner(System.in);
        num = entrada.nextInt();
        for (i = 1;i <= num;i = i + 1){
            fac = fac * i;
        }
        System.out.println("El factorial de " + num + " es " + fac);
    }
}
