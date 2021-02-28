/*
 * Author:  Lunix
 * Created: 
*/
import java.util.*;

class s_p
{
  static Scanner teclado = new Scanner(System.in);
  public static String a = new String("si");
  public static String b = new String();
  public static void main(String main[])
  {
    while (a.equals("si"))
    {
      System.out.println("\n          *****************");
      System.out.println("          *  ECUACIONAAP  *");
      System.out.println("          *****************");
      System.out.println("\n  + APLICACION DISEÑADA PARA RESOLOVER ECUCUACIONES DE SEGUNDO GRADO");
      System.out.println("  + UTILIZANDO LA FORMULA DE OPERACION CUADRATICA: ");
      System.out.println("\n\nForma de utilizar:");
      System.out.println("  1) Introduzca el primer valor correspondiente al primer termino de su ecuacion y presione enter");
      System.out.println("  2) Repita el mismo procedimiento para el segundo y tercer termino");
      System.out.println("  3) Cuando el resultado pertenece a los numeros complejos, se incluyen todas las raices de los polinomios");
      System.out.println("  4) El resultado es nulo si no es una ecuacion de segundo grado");

      try
      {
        System.out.println("\nDime un valor para a...");
        double a=teclado.nextDouble();
        System.out.println("Dime un valor para b...");
        double b=teclado.nextDouble();
        System.out.println("Dime un valor para c...");
        double c=teclado.nextDouble();
        if(b*b<4*a*c){
          System.out.println("\nLa solucion es perteneciente al campo de los numeros complejos.");
        }
        else if(a!=0&&b*b>4*a*c){
          System.out.println("\n   * La primera solucion es "+(-b+Math.sqrt(b*b-4*a*c))/(2*a));
          System.out.println("\n   * La segunda solucion es "+(-b-Math.sqrt(b*b-4*a*c))/(2*a));
          System.out.println("\n");
        }
        else {
          System.out.println("Esta ecuacion no es de segundo grado,");
          System.out.println("Intente nuevamente.");
        }
        //teclado.close();
      }
      catch (Exception e)
      {
        System.out.println("Error, no has escrito un número entero");
      }
      System.out.println("      Desea continuar si/no (Escriba no para salir):");
      b = teclado.next();
      if (b.equals("no"))
      {
        a = new String("no");
      }
    }
  }
}
