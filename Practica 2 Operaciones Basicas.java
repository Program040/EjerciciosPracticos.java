

package miprimerprograma;

public class MiPrimerPrograma 
{
    public static void main(String[] args) 
     {  
        /* Ejercicio 2: Calculadora Simple
        Crea un programa que:
        - Declare dos variables numéricas (int) con los valores 15 y 7
        - Calcule y muestre:
        - La suma de ambos números
        - La resta
        - La multiplicación
        - La división (usa double para el resultado)

        Ejemplo de salida esperada:
```
        15 + 7 = 22
        15 - 7 = 8
        15 * 7 = 105
        15 / 7 = 2.14
         
        */
        
        System.out.println("===============");
        System.out.println("  OPERACIONES");
        System.out.println("===============\n");
         
        // Variables 
        
        int valor1 = 15;
        int valor2 = 7;
        int resultado;
        double resultadoDecimal;
        
        //Desarrollo
        
        // OPERACIONES.... SUMA
        
        resultado = valor1 + valor2;
        System.out.println("Sum " + valor1 + " + " + valor2 + " = "+ resultado);
         
        // .... RESTA
        
        resultado = valor1 - valor2;
        System.out.println("Res " + valor1 + " - " + valor2 + " = "+ resultado);
        
        // .... MULIPLICACION
        
        resultado = valor1 * valor2;
        System.out.println("Mul " + valor1 + " * " + valor2 + " = "+ resultado);
        
        // .... DIVISION
        // Casting de tipos de datos (double)
        
        resultadoDecimal = (double) valor1 / (double) valor2;
        System.out.println("Div " + valor1 + " / " + valor2 + " = "+ resultadoDecimal);
        
        //Mensaje final 
        
        System.out.println("\n");
        System.out.println(" FIN DEL PROGRAMA!! ");
     
     }
}
    
