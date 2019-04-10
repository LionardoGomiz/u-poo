
package javaapplication13;

import java.util.Scanner;


public class dos {
        public static int factorial(int n) 
    {
        Scanner entrada = new Scanner(System.in);
         int i,fac;
         fac=1;
         i=2;
         while(i<=n){
             fac=fac*i;
             i=i+1;
         }
         return fac;
             
         }
            public static void main(String[] args) 
    {
    int r,num;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor escriba un numero");
        num = entrada.nextInt();
        r=factorial(num);
        System.out.println("El factorial es"+r);  
    }
}