
package javaapplication13;

import java.util.Scanner;


public class tres {
        public static int factorial(int n) 
    {
        Scanner entrada = new Scanner(System.in);
         int i,fac;
         fac=1;
         i=2;
         return fac;
             
         }
            public static void main(String[] args) 
    {
    int r,num,k,sum;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor escriba un numero");
        num = entrada.nextInt();
        sum=0;
        for(k=1;k<=num;k++)
        {
            sum=sum+fac(k);
        }
        System.out.println("Sumatoria"+sum);
    }
}