
import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * Programa para determinar el tiempo que se debe ahorrar para lograr una meta  * 
 * @author Mario Dorado - Santiago Velasquez - Jeimmy Naranjo   
 * @version 1.0
 */
public class Principal  //Declaracion de la clase Principal
{
    public static void main(String[] args) 
    {
        // Datos de entrada: 
        // 1. Definicion de variables
        // Datos de entrada
        int Meta, Sueldo;
        double Porcentaje;
    
        // Datos de salida
      
        
            
        
        //Variables adicionales
        
        
        
        
        // Necesito acceso al teclado
        Scanner teclado = new Scanner(System.in);
        // Preguntar datos de entrada
        System.out.print("Ingrese el valor que desea ahorrar: ");
        Meta = teclado.nextInt();
        System.out.print("Ingrese el valor de su salario mensual: ");
        Sueldo = teclado.nextInt();
        System.out.print("Ingrese el porcentaje que desea ahorrar de su sueldo: ");
        Porcentaje = teclado.nextDouble();
        
        
        // 2. Realizar calculos
        double iMeta = (double)Meta; //Cambiar todas las variables a double 
        double iSueldo = (double)Sueldo;
        double iMeses; 
        Porcentaje = (iSueldo * Porcentaje) / 100;
        iMeses = iMeta / Porcentaje;
        double dias = (iMeses -((int)iMeses)) * 30.44;
        double Adia = (((((int)iMeses)) * Porcentaje) - iMeta) / (int) dias ;
        int iPorcentaje = (int)Porcentaje;
        int iAdia = (int)Adia;
        if (iAdia < 0)
        {
            iAdia = iAdia * -1;
        }
        
        
        if ((iMeses -((int)iMeses))>0)
        {
          
           System.out.println("Para cumplir la meta de  "+ Meta + "  debe ahorrar por: " + (int)iMeses + "  meses y " +(int) dias+ "  dias");
           System.out.println("Mensualmente debe ahorrar: "+ iPorcentaje + "  y cada dia extra  " + iAdia); 
          
        }
        else
        {
            System.out.println("Para cumplir la meta de " + Meta + "debe ahorrar por:" + (int)iMeses);
            System.out.println("Mensualmente debe ahorrar: " + iPorcentaje);
        }
        
        
                
  } //Fin de la clase principal
}
