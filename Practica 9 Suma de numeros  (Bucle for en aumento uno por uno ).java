

package miprimerprograma;
import java.util.Scanner;
public class MiPrimerPrograma 
{
    public static void main(String[] args) 
     {  
        Scanner entrada = new Scanner(System.in);
        
        /* Ejercicio 2: Suma de Números
           Crea un programa que:

           Pida al usuario un número entero positivo (por ejemplo: 5)
           Calcule la suma de todos los números desde 1 hasta ese número
           Muestre el proceso y el resultado
           Usa un bucle for

           Ejemplo de ejecución 1:
           Ingrese un número: 5

           Calculando: 1 + 2 + 3 + 4 + 5
           La suma total es: 15
           Ejemplo de ejecución 2:
           Ingrese un número: 10

           Calculando: 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10
           La suma total es: 55
        */
        
        System.out.println("===================");
        System.out.println("  SUMA DE NUMEROS ");
        System.out.println("===================\n");
         
        // ____Variables____
        
        String nombre;
        int numero;
        int suma = 0;
               
        //____INICIO_____
        
        System.out.print("\n  * ¿Cual es tu nombre? : ");
        nombre = entrada.nextLine();
        
        System.out.println("\n   " + nombre + " El dia de hoy vamos a sumar los numeros para ello "
                                             + "necesito que elijas un numero entero positivo ");
       
         
        System.out.print("\n  * Por favor digita un numero : ");
        numero = entrada.nextInt();
        System.out.println("\n");
        
        // _____OPERACIONES Y RESULTADO (PROCESO)_____
              
        for (int i = 1; i <= numero; i++) 
        {
            suma = suma + i;  // Acumular
            
            System.out.print(i);
            
            /*
            Primera iteración (i = 1):
            suma = suma + i;
            suma = 0 + 1;      // suma tenía 0, i vale 1
            suma = 1;          // Ahora suma vale 1
            
            Segunda iteración (i = 2):
            suma = suma + i;
            suma = 1 + 2;      // suma tenía 1, i vale 2
            suma = 3;          // Ahora suma vale 3
            */
            
            if (i < numero) 
            {
                System.out.print(" + ");
            }
        }
        // _______SALIDA______
        
        System.out.println("\nLa suma total es: " + suma);
        
        
        //_____Mensaje final____
        
        System.out.println("\n");
        System.out.println("  ----------------------------------");
        System.out.println("    FIN DEL PROGRAMA!! " + nombre);
        System.out.println("  ----------------------------------");
        
        entrada.close();
     
     }
}


   
    
