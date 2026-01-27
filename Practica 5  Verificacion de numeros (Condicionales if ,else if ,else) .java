

package miprimerprograma;
import java.util.Scanner;
public class MiPrimerPrograma 
{
    public static void main(String[] args) 
     {  
        Scanner entrada = new Scanner(System.in);
        
        /* Ejercicio 1: Verificador de Números**

        Crea un programa que:
        - Pida al usuario un número entero
        - Verifique y muestre:
        - Si el número es positivo, negativo o cero
        - Si el número es par o impar (usa el operador `%` módulo: `numero % 2 == 0` indica que es par)

        Ejemplo de ejecución:
        ```
        Ingrese un número: 7

        El número 7 es positivo
        El número 7 es impar
        ```
        Ingrese un número: -4

        El número -4 es negativo
        El número -4 es par

        **Pista:** Para saber si un número es par, usa: `numero % 2 == 0`
  
        */
        
        System.out.println("===========================");
        System.out.println("  VERIFICADOR DE NUMEROS");
        System.out.println("===========================\n");
         
        // ____Variables____
        
        int numeroEntero;
        int satisfaccion;
        
        //____Desarrollo_____
        
        System.out.print("   Ahora vamos a verificar si el numero seleccionado es Negativo,Positivo o Cero y ademas si es par o impar para ello..."+"\n");
        System.out.print("\n  * Por favor ingresa un numero entero: ");
        numeroEntero = entrada.nextInt();
        
        // _____OPERACIONES Y RESULTADO_____
        
        
        if (numeroEntero == 0)
        {
            System.out.println("   El numero ingresado es:  Cero Y es un numero Par ");
        }
        else if (numeroEntero >= 0 && numeroEntero % 2 == 0)
            {
                System.out.println("   El numero ingresado es:  Positivo Y es un numero Par "); 
            }
            else if (numeroEntero >=0 && numeroEntero % 2 == 1)
                {
                    System.out.println("   El numero ingresado es:  Positivo Y es un numero Impar ");
                }
                else if (numeroEntero < 0 && numeroEntero % 2 == 0)
                    {
                        System.out.println("   El numero ingresado es:  Negaivo Y es un numero Par ");
                    }
                    else if (numeroEntero < 0 && numeroEntero % 2 == -1)
                        {
                            System.out.println("   El numero ingresado es:  Negativo Y es un numero Impar ");
                        }
                        else
                            {
                                System.out.println(" !!!!!!! ");
                                System.out.println(" ERROR!! el numero ingresado no se ajusta a lo solicitado ");
                                System.out.println(" ________");
                            }
     
        //_____Adicional(opcioanal)____
        
        System.out.print("\n  ¿Te encuentras satisfecho con el resultado? [1]Malo [5]Bueno porfavor escribelo : ");
        satisfaccion= entrada.nextInt();
        
        if (satisfaccion == 5)
        {
            System.out.println("\n   Gracias!! :) "); 
        }
        else 
            {
                System.out.println("\n   Lo lamentamos y lo tendremos en cuenta Gracias :( ");
            }
        
        //_____Mensaje final____
        
        System.out.println("\n");
        System.out.println(" FIN DEL PROGRAMA!! ");
        
        
        entrada.close();
     
     }
}




/* UNA VERSION DEL MISMO EJERCICIO PERO SIMPLIFICADA ES......

-------------------------------------------------------------------------------

//............ Bloque 1: Verificar tipo de número...........


if (numeroEntero > 0) {
    System.out.println("El número " + numeroEntero + " es positivo");
} else if (numeroEntero < 0) {
    System.out.println("El número " + numeroEntero + " es negativo");
} else {
    System.out.println("El número es cero");
}


// ...........Bloque 2: Verificar par o impar.................


if (numeroEntero % 2 == 0) {
    System.out.println("El número " + numeroEntero + " es par");
} else {
    System.out.println("El número " + numeroEntero + " es impar");
}



*/
    
