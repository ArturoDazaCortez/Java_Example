/*
 * Author:  Lunix
 * Created: 
*/
import java.util.*;
class DivisibilidadAleatoriaCinco
{

  public static void main(String[] args)
  {

    Scanner scan = new Scanner(System.in);
    Random rdm = new Random();

    int cont =0;

    System.out.println("Ingrese la cantidad de numeros para ser generados");
    int cant_gen = scan.nextInt();
    System.out.println("\n");
    int [] vec_gen = new int [cant_gen];
    for (int i=0;i<vec_gen.length;i++)
    {
      vec_gen [i] = (int) (Math.random() * 100) + 1;
      System.out.println("  "+vec_gen[i]+" ");
      if (vec_gen[i]%5 == 0)
      {
        System.out.println("  ---");
        cont = ++cont;
      }
    }
    System.out.println("\n");
    System.out.println("Existen "+cont+" numero(s) divisible(s) entre 5");
    System.out.println("Se generaron "+cant_gen+" numeros");
  }
}
