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
public class dos {
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        int dia;
        System.out.println("Digite el dia.");
        dia = entrada.nextInt();
        switch(dia){
            case 1: {System.out.println("Lunes"); break;}
            case 2: {System.out.println("Martes"); break;}
            case 3: {System.out.println("Miercoles"); break;}
            case 4: {System.out.println("Jueves"); break;}
            case 5: {System.out.println("Viernes"); break;}
            case 6: {System.out.println("Sabado"); break;}
            case 7: {System.out.println("Domingo"); break;}
        }
    }
}
