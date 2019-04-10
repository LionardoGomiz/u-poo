/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

import java.util.Scanner;

/**
 *
 * @author ESTUDIANTE
 */
public class JavaApplication13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
         int i,fac,num;
         fac=1;
          System.out.println("Por favor escriba un numero");
        num = entrada.nextInt();
        
        for(i=2;i<=num;i++){
            
            fac=fac*i;
        }
             System.out.println("El factorial es"+fac);  
    }
    
}
