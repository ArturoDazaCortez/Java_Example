/*
 * Author:  Lunix
 * Created: 
*/
import java.util.*;
/*
*  Dado dos vectores A y B de 15 elementos cada uno,
*  obtener un vector C donde la posición i se almacene
*  la suma de A[i]+B[i] y mostrar el mayor de los C[i].
*/
class Primer_Ejercicio{

  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);
    Random rdm = new Random();

    int [] vec_a = new int[15];
    int [] vec_b = new int[15];
    int [] vec_c = new int[15];

    int aux = 0;

    for (int i=0;i<vec_a.length;i++){
      vec_a [i] = rdm.nextInt(9)+1;
      vec_b [i] = rdm.nextInt(9)+1;
      vec_c [i] = (vec_a [i] + vec_b [i]);
      if (vec_c[i] > aux){
        aux = vec_c[i];
      }
    }
    for (int j=0;j<vec_a.length;j++){
      System.out.print("  A[ "+vec_a[j]+" ]  + ");
      System.out.print("  B[ "+vec_b[j]+" ]  =  ");
      System.out.println("  c[ "+vec_c[j]+" ] ");
    }
    System.out.println("\n  Mayor [ "+aux+" ] \n");
  }
}
