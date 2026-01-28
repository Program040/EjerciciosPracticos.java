

package miprimerprograma;
import java.util.Scanner;
public class MiPrimerPrograma 
{
    public static void main(String[] args) 
     {  
        Scanner entrada = new Scanner(System.in);
        
        /* Ejercicio 2: Sistema de Calificaciones**

        Crea un programa que:
        - Pida al usuario una calificación numérica (0-100)
        - Muestre la letra correspondiente según esta escala:
        - 90-100: A (Excelente)
        - 80-89: B (Muy bien)
        - 70-79: C (Bien)
        - 60-69: D (Suficiente)
        - 0-59: F (Reprobado)
        - Si el número está fuera del rango 0-100, mostrar un mensaje de error

        Ejemplo de ejecución:
        ```
        Ingrese su calificación (0-100): 85
        Su calificación es: B (Muy bien)
        ```
        Ingrese su calificación (0-100): 105
        Error: La calificación debe estar entre 0 y 100
  
        */
        
        System.out.println("=============================");
        System.out.println("  SISTEMA DE CALIFICACIONES ");
        System.out.println("=============================\n");
         
        // ____Variables____
        
        String nombre;
        double calificacion;
        
        
        //____Desarrollo_____
        
        System.out.print("\n  * ¿Cual es tu nombre? : ");
        nombre = entrada.nextLine();
        
        System.out.print("\n  * Por favor " + nombre + " ingresa una calificacion entre o - 100 : ");
        calificacion = entrada.nextDouble();
        
        // _____OPERACIONES Y RESULTADO_____
        
        
    if (calificacion >= 90 && calificacion <= 100) 
    {
        System.out.println("\n   Calificacion es A (Exelente!!) ");
    } 
    else if (calificacion >= 80 && calificacion <= 89) 
        {
           System.out.println("\n   Calificacion es B (Muy bien!) ");
        } 
        else if (calificacion >= 70 && calificacion <= 79)
           {
               System.out.println("\n   Calificacion es C (Bien) ");
           }
            else if (calificacion >= 60 && calificacion <= 69)
                {
                    System.out.println("\n   Calificacion es D (Suficiente) ");
                }
                 else if (calificacion >= 0 && calificacion <= 59)
                    {
                        System.out.println("\n   Calificacion es F (Reprobado) ");
                    }
                    else
                        {
                            System.out.println("\n    ERROR!! la calificacion ingresada npo se encuentra en el rango de 0 -100 ");
                        }
              
        //_____Mensaje final____
        
        System.out.println("\n");
        System.out.println("  ----------------------------------");
        System.out.println("    FIN DEL PROGRAMA!! " + nombre);
        System.out.println("  ----------------------------------");
        
        entrada.close();
     
     }
}


    
