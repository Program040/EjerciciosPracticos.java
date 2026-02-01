

package miprimerprograma;
import java.util.Scanner;
public class Explicacion 

{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        
        //EXPLICACION BUCLE WHILE 
        //Explicacion ejercios y ejemplos de como utilizar el bucle while
        
        /* ¿Qué es el bucle WHILE?
        El bucle while significa "mientras" en español. Se usa cuando NO sabes cuántas veces
        se repetirá el código, pero SÍ sabes la condición que debe cumplirse para continuar.

        //ESTRUCTURA BASICA DE WHILE

        while (condición) 
        {
        // Código que se repite
        }
        
        ¿Cómo funciona?

        1) Verifica la condición ANTES de ejecutar el código
        2) Si la condición es true, ejecuta el código dentro de {}
        3) Vuelve al paso 1
        4) Si la condición es false, sale del bucle y continúa con el resto del programa

        ==========================
             EJEMPLO SIMPLE 
        ==========================

        int contador = 1;

        while (contador <= 5) 
        {
            System.out.println("Contador: " + contador);
            contador++;  // MUY IMPORTANTE
        }
        ```

                **Salida:**
        ```
                Contador: 1
                Contador: 2
                Contador: 3
                Contador: 4
                Contador: 5
        ```

        ### Paso a paso:
```
        ANTES del bucle:
        contador = 1

        VERIFICACIÓN 1: ¿contador <= 5?  →  ¿1 <= 5?  →  SÍ
            Ejecuta: Imprime "Contador: 1"
            Ejecuta: contador++ → contador = 2

        VERIFICACIÓN 2: ¿contador <= 5?  →  ¿2 <= 5?  →  SÍ
            Ejecuta: Imprime "Contador: 2"
            Ejecuta: contador++ → contador = 3

        VERIFICACIÓN 3: ¿contador <= 5?  →  ¿3 <= 5?  →  SÍ
            Ejecuta: Imprime "Contador: 3"
            Ejecuta: contador++ → contador = 4

        VERIFICACIÓN 4: ¿contador <= 5?  →  ¿4 <= 5?  →  SÍ
            Ejecuta: Imprime "Contador: 4"
            Ejecuta: contador++ → contador = 5

        VERIFICACIÓN 5: ¿contador <= 5?  →  ¿5 <= 5?  →  SÍ
            Ejecuta: Imprime "Contador: 5"
            Ejecuta: contador++ → contador = 6

        VERIFICACIÓN 6: ¿contador <= 5?  →  ¿6 <= 5?  →  NO
            Sale del bucle

           !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
               ⚠️ PELIGRO: El bucle infinito
           ¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡

           Si olvidas modificar la variable que controla la condición, el bucle NUNCA terminará:
           
           int i = 1;

            while (i <= 5) 
            {
             System.out.println(i);
            // ¡OLVIDAS i++!
            // La condición SIEMPRE será true
            // El bucle imprimirá "1" infinitamente 😱
            }

            Regla de oro: Siempre asegúrate de que la condición eventualmente se vuelva false.

               ============================================
                  🎯 Ejemplo práctico 1: Validar entrada
               ============================================

                Este bucle obliga al usuario a ingresar un número válido.
            ___________________________________________________________________________

            Scanner entrada = new Scanner(System.in);
            int numero = -1;  // Valor inicial que NO cumple lo que queremos

            while (numero < 0) 
            {
                System.out.print("Ingresa un número positivo: ");
                numero = entrada.nextInt();

                if (numero < 0) 
                {
                    System.out.println("Error: Debe ser positivo. Intenta de nuevo.");
                }
            }

            System.out.println("Gracias, ingresaste: " + numero);
            ```

            **Ejecución ejemplo:**
            ```
            Ingresa un número positivo: -5
            Error: Debe ser positivo. Intenta de nuevo.
            Ingresa un número positivo: -2
            Error: Debe ser positivo. Intenta de nuevo.
            Ingresa un número positivo: 10
            Gracias, ingresaste: 10

              =============================================
                Ejemplo práctico 2: Adivinar contraseña
              =============================================

              Nota: .equals() se usa para comparar Strings (no uses == con Strings)
          ______________________________________________________________________



                 Scanner entrada = new Scanner(System.in);

                String passwordCorrecta = "java123";
                String passwordIngresada = "";

                while (!passwordIngresada.equals(passwordCorrecta)) {
                    System.out.print("Ingresa la contraseña: ");
                    passwordIngresada = entrada.nextLine();

                    if (!passwordIngresada.equals(passwordCorrecta)) {
                        System.out.println("Incorrecta. Intenta de nuevo.\n");
                    }
                }

                System.out.println("¡Acceso concedido!");
                ```

                **Ejecución ejemplo:**
                ```
                Ingresa la contraseña: hola
                Incorrecta. Intenta de nuevo.

                Ingresa la contraseña: 1234
                Incorrecta. Intenta de nuevo.

                Ingresa la contraseña: java123
                ¡Acceso concedido!


              =============================================
                  🎯 Ejemplo práctico 3: Contar dígitos
              =============================================

            ___________________________________________________________________

            Scanner entrada = new Scanner(System.in);

                System.out.print("Ingresa un número: ");
                int numero = entrada.nextInt();

                int copiaNumero = numero;  // Guardamos el original
                int cantidadDigitos = 0;

                while (copiaNumero != 0) {
                    copiaNumero = copiaNumero / 10;  // Elimina el último dígito
                    cantidadDigitos++;
                }

                System.out.println("El número " + numero + " tiene " + cantidadDigitos + " dígitos");
                ```

                **Ejemplo:**
                ```
                Ingresa un número: 12345

                Paso 1: copiaNumero = 12345 / 10 = 1234, cantidadDigitos = 1
                Paso 2: copiaNumero = 1234 / 10 = 123, cantidadDigitos = 2
                Paso 3: copiaNumero = 123 / 10 = 12, cantidadDigitos = 3
                Paso 4: copiaNumero = 12 / 10 = 1, cantidadDigitos = 4
                Paso 5: copiaNumero = 1 / 10 = 0, cantidadDigitos = 5

                El número 12345 tiene 5 dígitos


------------------------------------------------------------------------------------------

            🔄 Comparación: FOR vs WHILE
            Usa FOR cuando:

            ✓ Sabes cuántas veces se repetirá
            ✓ Tienes un contador que aumenta de forma predecible
            ✓ Ejemplo: "Repite 10 veces", "Del 1 al 100"

            Usa WHILE cuando:

            ✓ NO sabes cuántas veces se repetirá
            ✓ Depende de una condición que puede cambiar
            ✓ Ejemplo: "Hasta que el usuario adivine", "Mientras la respuesta sea incorrecta"


            🎓 Conceptos clave del WHILE:

            La condición se verifica ANTES de cada iteración
            Si la condición es false desde el inicio, el código nunca se ejecuta
            Debes modificar algo dentro del bucle para que eventualmente termine
            Es perfecto para validaciones y cuando no sabes cuántas iteraciones necesitas

            📝 Resumen visual:
            
            // WHILE
            int i = 1;
            while (i <= 5) 
            {
                System.out.println(i);
                i++;
            }

            // Es equivalente a este FOR:
            for (int i = 1; i <= 5; i++) 
            {
                System.out.println(i);
            }

    }
    
}
