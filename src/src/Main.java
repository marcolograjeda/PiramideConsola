/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;
import java.util.Scanner;
/**
 *
 * @author Junior
 */
public class Main {
     public static void main (String args[]) {
        boolean preguntar;
        do{
            int lineas;            
            lineas = Leer();
            Imprimir(lineas);
            preguntar = Repetir();
        }while(preguntar==true);      
    }
    
    public static int Leer(){
        Scanner scan = new Scanner(System.in);
        boolean verificar = true;
        int numeroLineas = 0;
        do{
            System.out.println("Ingrese el numero de lineas");
            try{
                if(verificar==false){
                    verificar = true;
                }
                numeroLineas = scan.nextInt();
            }catch(java.util.InputMismatchException e){
                System.out.println("Debe ingresar un valor numerico.");
                verificar = false;
                scan.next();
            }
        }while(verificar==false);
        return numeroLineas;
    } 
     
    public static void Imprimir(int numLineas){
        String espacio = " ";
        for(int a=1;a<=numLineas;a++){
            for(int b=numLineas-a;b>0;b--){
                System.out.print(espacio);
            }
            switch(a){
                case 1:
                    System.out.print("/");
                    System.out.println("\\");
                    break;
                case 2:
                    System.out.print("//");
                    System.out.println("\\\\");
                    break;
            }
            if(numLineas>2 && a>2){
                System.out.print("//");
                for(int c=a-2;c>0;c--){
                    System.out.print("\\/");
                }
                System.out.println("\\\\");
            }
        }
    }
    
    public static boolean Repetir(){
        System.out.println("");
        System.out.println("Desea dibujar otra piramide (y/n)");
        Scanner scan = new Scanner(System.in);
        boolean repetir= true;
        String rep;
        rep = scan.nextLine();
        switch(rep){
            case "y":
                repetir = true;
                break;
            case "n":
                repetir = false;
                System.out.println("Feliz dia!");
                break;
            default:
                System.out.println("No escogiste ninguna opcion. Feliz dia!");
                repetir = false;
                
        }
        return repetir;
    }
}
