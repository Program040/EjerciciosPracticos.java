
package miprimerprograma;

public class MiPrimerPrograma 
{
    public static void main(String[] args) 
     {
        /* Ejercicio 1: Información Personal**
        Crea un programa que declare variables con tu información personal y la muestre en consola:
        - Tu nombre (String)
        - Tu edad (int)
        - Tu ciudad (String)
        - Si te gusta programar (boolean)
        - Tu estatura en metros (double)

        Imprime toda esta información con mensajes descriptivos.*/
         
        System.out.println("Informacion personal");
         
        // Variables 
        
        String nombre = "AJ";
        String ciudad = "Bogota";
        int edad = 21;
        double altura = 1.61;
        boolean leGustaProgramar = true;
        
        //Resultado final
        
        System.out.println("Hola mi nombre es " + nombre + " y yo vivo en la ciudad de " + ciudad 
        + " tengo " + edad+ " años y mi altura en metros es mas o menos " + altura + 
                " y que si me gusta programar " + leGustaProgramar  );
     
     }
}
    
