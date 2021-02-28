/*
 * Author:  Lunix
 * Created: 
*/
import java.util.*;
class VectorAleatorioMayor
{

  public static void main(String[] args)
  {

    Scanner scan = new Scanner(System.in);
    Random rdm = new Random();

    int val_min,val_max;

    System.out.println("Ingrese la dimension del vector");
    int dim_vec = scan.nextInt();
    System.out.println("\n");
    int [] vec = new int [dim_vec];
    for (int i=0;i<vec.length;i++)
    {
      vec [i] = (int) (Math.random() * 100) + 1;
      System.out.println("     "+vec[i]+" ");
    }

    val_min=val_max=vec[0]; //

    for(int j=0;j<vec.length;j++)
    {
      if(val_min>vec[j])
      {
        val_min=vec[j];
      }
        if(val_max<vec[j])
        {
          val_max=vec[j];
        }
    }
    System.out.println("\n");
    System.out.println("El máximo es "+val_max+" y el minimo es "+val_min);
    System.out.println("Se generaron "+dim_vec+" numeros");
  }
}
