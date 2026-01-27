

package miprimerprograma;
import java.util.Scanner;
public class MiPrimerPrograma 
{
    public static void main(String[] args) 
     {  
        Scanner entrada = new Scanner(System.in);
        
        /* Ejercicio 2: Conversor de Temperatura**

        Crea un programa que:
        - Pida al usuario una temperatura en grados Celsius
        - Convierta esa temperatura a Fahrenheit
        - Muestre el resultado

        **Fórmula:** Fahrenheit = (Celsius × 9/5) + 32

        Ejemplo de ejecución:
        ```
        Ingrese la temperatura en Celsius: 25
        25°C equivale a 77.0°F
         
        */
        
        System.out.println("============================");
        System.out.println("  CONVERSOR DE TEMPERATURA");
        System.out.println("============================\n");
         
        // ____Variables____
        
        double temperatura;
        double resultadoEnDecimal;
        
        //____Desarrollo_____
        
        System.out.print("Por favor ingresa una temperatura en grados celcius: ");
        temperatura = entrada.nextDouble();
        
        // _____OPERACIONES_____
        
        //   **Fórmula:** Fahrenheit = (Celsius × 9/5) + 32
        
        resultadoEnDecimal =  temperatura * 9/5 + 32;
        
        //_____Resultado____
        
        System.out.println("\nLa conversion de la temperatura a grados Fahrenheit es: " + resultadoEnDecimal + "°F");
        
        
        //_____Mensaje final____
        
        System.out.println("\n");
        System.out.println(" FIN DEL PROGRAMA!! ");
        
        
        entrada.close();
     
     }
}
    
