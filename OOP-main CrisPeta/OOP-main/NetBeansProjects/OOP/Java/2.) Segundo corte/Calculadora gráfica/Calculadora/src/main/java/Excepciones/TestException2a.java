/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class TestException2a {
    
     public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        boolean continuarEjecucion = true;

        do {
            try {
                System.out.println("Ingrese N1");
                int n1 = leer.nextInt();
                System.out.println("Ingrese N2");
                int n2 = leer.nextInt();

                int resultado = dividir(n1, n2);             

                //int resultado = 4/0;
                System.out.println("Resultado" + resultado);
                continuarEjecucion = false;
                
            } catch (InputMismatchException e) {
                System.err.println("Ocurrio un error: Ingrese solo numeros enteros");
                e.printStackTrace(System.out);
                leer.nextLine();
            } catch (Exception e) {
                e.printStackTrace(System.out);
            } finally {
                System.out.println("Se revisó la división");
            }
        } while (continuarEjecucion);
             
    }
    
    //static int dividir(int n, int d) throws OperadorExcepcion{
    static int dividir(int n, int d){
        if (d == 0) {
            throw new OperadorExcepcion("Dividir entre cero");
        }
        return n/d;
    }    

    
}
