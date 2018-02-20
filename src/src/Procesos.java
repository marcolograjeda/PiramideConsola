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
public class Procesos {
    public void Iniciar(){
        //Metodo que llama a todos los procesos
        boolean preguntar;
        do{
            int lineas;            
            lineas = Leer();
            Imprimir(lineas);
            preguntar = Repetir();
        }while(preguntar==true);
    }
    
    public int Leer(){
        //Metodo para ingresar el numero de lineas, con validación de numero positivo
        Scanner scan = new Scanner(System.in);
        boolean verificar=false;
        int cantidadLineas = 0;
        do{
            System.out.println("Ingrese el numero de lineas");
            try{
                cantidadLineas = scan.nextInt();
                if(verificar==false && cantidadLineas>0){
                    verificar = true;
                }else{
                    System.out.println("Debe ingresar un numero positivo.\n");
                }
            }catch(java.util.InputMismatchException e){
                System.out.println("Debe ingresar un valor numerico o numero un entero.\n");
                verificar = false;
                scan.next();
            }
        }while(verificar==false);
        return cantidadLineas;
    } 
     
    public void Imprimir(int cantidadLineas){
        //Impresión de caracteres
        for(int numeroLinea=1;numeroLinea<=cantidadLineas;numeroLinea++){
            for(int b=cantidadLineas-numeroLinea;b>0;b--){
                System.out.print(" ");
            }
            System.out.print("/");
            for(int c=numeroLinea-1;c>0;c--){
                System.out.print("/\\");
            }
            System.out.println("\\");
        }
    }
    
    public boolean Repetir(){
        //Pregunta si se desea dibujar alguna otra piramide
        System.out.println("\nDesea dibujar otra piramide (s/n)");
        Scanner scan = new Scanner(System.in);
        boolean repetir;
        String rep = scan.nextLine();
        switch(rep){
            case "s":
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
