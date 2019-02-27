/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana;

import java.util.Scanner;

/**
 *
 * @author sebag
 */
public class treh {
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        int edad;
        System.out.println("Digite la edad.");
        edad = entrada.nextInt();
        if (edad <= 17)
            System.out.println("Colegial.");
        else
            if (edad <= 50)
                System.out.println("Universitario.");
            else
                if (edad > 50)
                    System.out.println("Pensionado.");
                else
                    System.out.println("WTF.");
    }
}
