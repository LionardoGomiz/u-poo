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
public class uno {
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner (System.in);
        int dia;
        System.out.println("Digite el dia.");
        dia = entrada.nextInt();
        if (dia == 1)
            System.out.println("Lunes");
        else
            if (dia == 2)
                System.out.println("Martes");
            else
                if (dia == 3)
                    System.out.println("Miercoles");
                else
                    if (dia == 4)
                        System.out.println("Jueves");
                    else
                        if (dia == 5)
                            System.out.println("Viernes");
                        else
                            if (dia == 6)
                                System.out.println("Sabado");
                            else
                                if (dia == 7)
                                    System.out.println("Domingo");
                                else
                                    System.out.println("que putas paso");
    }
}
