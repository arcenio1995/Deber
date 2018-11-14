/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jvilatuña.vista;

import javax.swing.JOptionPane;

/**
 *
 * @author UseR
 */
public class Aplicación {
    public static void main(String[] args) {
        //factorial();
        //pares();
        //multiplos3();
        fibonaci();
    }
    public static void factorial() {
        long fac=1;
        int num=8;
        for(int i=num;i>0;i--) {
            fac=fac*i;
        }
        System.out.println("El factorial de "+num+" es: "+fac);
        JOptionPane.showConfirmDialog(null,"El factorial de "+num+" es: "+fac);
    }
    public static void pares() {
        int lim=10;
        int t=0;
        System.out.println("Los números pares son:");
        for (int j=1;j<=lim;j++){
            t=j%2;
            if(t==0){               
                System.out.print("- "+j);
                JOptionPane.showConfirmDialog(null,"Es un número par el número "+j);
            }
        }
        System.out.println("");
    }
    public static void multiplos3() {
        int lim=9;
        int t=0;
        System.out.println("Los números multiplos de 3 son:");
        for (int j=1;j<=lim;j++){
            t=j%3;
            if(t==0){               
                System.out.print("- "+j);
                JOptionPane.showConfirmDialog(null,"Es multiplo de 3 el número "+j);
            }
        }
        System.out.println("");
    }
     public static void fibonaci(){
         
          int i, x=0, y=1,z=1;
          
          for(i=1;i<10;i++){
		z = x + y;
		x = y;
		y = z;
                
                
          }
          JOptionPane.showConfirmDialog(null,"fibonaci es :  "+z);
     }
    
    
    
    
    
    
    
}
