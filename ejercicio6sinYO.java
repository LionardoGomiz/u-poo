/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author sebag
 */
public class seis_dos {
    public static void main(String[] args) {
        int mayor = 0, medio = 0, menor = 0;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número"); 
        int a = scanner.nextInt();
        System.out.println("Ingrese otro número");
        int b = scanner.nextInt();
        System.out.println("Ingrese otro número");
        int c = scanner.nextInt();
        
        if(a > b){
            if (a > c){
                mayor = a;
                if (b > c){
                    medio = b;
                    menor = c;
                }
                else{ 
                    medio = c;
                    menor = b;
                }
            }
            System.out.println("El mayor es " + mayor + " el medio es " + medio + " y el menor es " + menor);
        }
        
        if(b > a){
            if (b > c){
                mayor = b;
                if(a > c){
                    medio = a;
                    menor = c;
                }
                else {
                    medio = c;
                    menor = a;
                }
            }
            System.out.println("El mayor es " + mayor + " el medio es " + medio + " y el menor es " + menor);
        }
        
        if(c > a){
            if (c > b){
                mayor = c;
                if(b > a){
                    medio = b;
                    menor = a;
                }
                else {
                    medio = a;
                    menor = b;
                }
            }
            System.out.println("El mayor es " + mayor + " el medio es " + medio + " y el menor es " + menor);
        }
    }
}
