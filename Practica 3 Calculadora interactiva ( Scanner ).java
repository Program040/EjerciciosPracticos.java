

package miprimerprograma;
import java.util.Scanner;
public class MiPrimerPrograma 
{
    public static void main(String[] args) 
     {  
        Scanner entrada = new Scanner(System.in);
        
        /* Ejercicio 1: Calculadora Interactiva**

        Crea un programa que:
        - Pida al usuario que ingrese dos números (puedes usar int o double)
        - Calcule y muestre:
        - La suma
        - La resta
        - La multiplicación  
        - La división

        Ejemplo de ejecución:
        ```
        Ingrese el primer número: 20
        Ingrese el segundo número: 4

        Resultados:
        20 + 4 = 24
        20 - 4 = 16
        20 * 4 = 80
        20 / 4 = 5.0
         
        */
        
        System.out.println("===========================");
        System.out.println("  CALCULADORA INTERACTIVA");
        System.out.println("===========================\n");
         
        // ____Variables____
        
        int numero1;
        int numero2;
        int resultado;
        double resultadoDecimal;
        
        //____Desarrollo_____
        
        System.out.print("Por favor ingresa tu primer numero: ");
        numero1 = entrada.nextInt();
        System.out.print("Por favor ingresa el segundo numero: ");
        numero2 = entrada.nextInt();
        
        // _____OPERACIONES_____
        
        //.... SUMA
        
        resultado = numero1 + numero2;
        System.out.println("\nSum " + numero1 + " + " + numero2 + " = "+ resultado);
         
        // .... RESTA
        
        resultado = numero1 - numero2;
        System.out.println("Res " + numero1 + " - " + numero2 + " = "+ resultado);
        
        // .... MULIPLICACION
        
        resultado = numero1 * numero2;
        System.out.println("Mul " + numero1 + " * " + numero2 + " = "+ resultado);
        
        // .... DIVISION
        // Casting de tipos de datos (double)
        
        resultadoDecimal = (double) numero1 / (double) numero2;
        System.out.println("Div " + numero1 + " / " + numero2 + " = "+ resultadoDecimal);
        
        //_____Mensaje final____
        
        System.out.println("\n");
        System.out.println(" FIN DEL PROGRAMA!! ");
        
        
        entrada.close();
     }
}
    
