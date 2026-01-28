

package miprimerprograma;
import java.util.Scanner;
public class MiPrimerPrograma 
{
    public static void main(String[] args) 
     {  
        Scanner entrada = new Scanner(System.in);
        
        /* Ejercicio: Conversor de Días**

        Crea un programa que:
        - Pida al usuario un número del 1 al 7
        - Muestre el día de la semana correspondiente usando **switch**:
        - 1 = Lunes
        - 2 = Martes
        - 3 = Miércoles
        - 4 = Jueves
        - 5 = Viernes
        - 6 = Sábado
        - 7 = Domingo
        - Si ingresa un número fuera del rango, mostrar error

        Ejemplo:
        ```
        Ingrese un número (1-7): 3
        El día es: Miércoles
  
        */
        
        System.out.println("=====================");
        System.out.println("  CONVERSOR DE DIAS ");
        System.out.println("=====================\n");
         
        // ____Variables____
        
        String nombre;
        int numero;
               
        //____Desarrollo_____
        
        System.out.print("\n  * ¿Cual es tu nombre? : ");
        nombre = entrada.nextLine();
        
        System.out.println("\n   " + nombre + " Aqui se muestra un menu de opciones porfavor elige la opcion que deseas");
        
        System.out.println("\n");
        System.out.print(" --- MENU DE OPCIONES --- ");
        System.out.println("\n");
        System.out.println("      * 1.  DIA ");
        System.out.println("      * 2.  DIA ");
        System.out.println("      * 3.  DIA ");
        System.out.println("      * 4.  DIA ");
        System.out.println("      * 5.  DIA ");
        System.out.println("      * 6.  DIA ");
        System.out.println("      * 7.  DIA ");
         
        System.out.print("\n  * Por favor digita un numero del menu  : ");
        numero = entrada.nextInt();
        System.out.println("\n");
        
        // _____OPERACIONES Y RESULTADO_____
        
        switch (numero)
        {
            case 1:
                System.out.println("\n Elegiste el dia Lunes :) ");
                break;
            case 2:
                System.out.println("   Elegiste el dia Martes :) ");
                break;
            case 3:
                System.out.println("   Elegiste el dia Miercoles :) ");
                break;
            case 4:
                System.out.println("   Elegiste el dia Jueves :) ");
                break;
            case 5:
                System.out.println("   Elegiste el dia Viernes :) ");
                break;
            case 6:
                System.out.println("   Elegiste el dia Sabado :) ");
                break;
            case 7:
                System.out.println("   Elegiste el dia Domingo :) ");
                break;
            default:
                System.out.println("   ERROR!! LA OPCION SOLICITADA ES INVALIDA ");
                break;
                
        }
    
              
        //_____Mensaje final____
        
        System.out.println("\n");
        System.out.println("  ----------------------------------");
        System.out.println("    FIN DEL PROGRAMA!! " + nombre);
        System.out.println("  ----------------------------------");
        
        entrada.close();
     
     }
}


    
