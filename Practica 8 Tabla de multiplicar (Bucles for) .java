

package miprimerprograma;
import java.util.Scanner;
public class MiPrimerPrograma 
{
    public static void main(String[] args) 
     {  
        Scanner entrada = new Scanner(System.in);
        
        /* Ejercicio 1: Tabla de Multiplicar
           Crea un programa que:

           Pida al usuario un número
           Muestre la tabla de multiplicar de ese número del 1 al 10
           Usa un bucle for
           
           Ingrese un número: 7

            Tabla del 7:
            7 x 1 = 7
            7 x 2 = 14
            7 x 3 = 21
            7 x 4 = 28
            7 x 5 = 35
            7 x 6 = 42
            7 x 7 = 49
            7 x 8 = 56
            7 x 9 = 63
            7 x 10 = 70
        */
        
        System.out.println("========================");
        System.out.println("  TABLA DE MULTIPLICAR ");
        System.out.println("========================\n");
         
        // ____Variables____
        
        String nombre;
        int numero;
        int resultado;
               
        //____Desarrollo_____
        
        System.out.print("\n  * ¿Cual es tu nombre? : ");
        nombre = entrada.nextLine();
        
        System.out.println("\n   " + nombre + " El dia de hoy vamos recrear una tabla de multiplicacion "
                                             + "para ello necesito que me indiques una tabla del 1 al 10 ");
       
         
        System.out.print("\n  * Por favor digita un numero del 1 al 10 entero  : ");
        numero = entrada.nextInt();
        System.out.println("\n");
        
        // _____OPERACIONES Y RESULTADO_____
              
        for (int i = 1; i <= 10; i++) 
        {
            resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado );
        }
              
        //_____Mensaje final____
        
        System.out.println("\n");
        System.out.println("  ----------------------------------");
        System.out.println("    FIN DEL PROGRAMA!! " + nombre);
        System.out.println("  ----------------------------------");
        
        entrada.close();
     
     }
}


    
