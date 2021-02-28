/*
 * Author:  Lunix
 * Created: 
*/
import java.util.*;
/*
*  Leer 20 números y almacenarlos de manera
*  ordenada en un vector
*/
class Quinto_Ejercicio{

  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);
    Random rdm = new Random();

    int [] vec_a = new int[20];
    int [] vec_aux = new int[20];

    int aux = 0;

    for (int i=0;i<vec_a.length;i++){
      vec_a [i] = rdm.nextInt(9)+1;
      vec_aux[i] = vec_a[i];
    }
    for (int i=0;i<19;i++){
      for (int j =0;j<19;j++){
        if (vec_a[j] > vec_a[j+1]){
          aux = vec_a[j];
          vec_a[j] = vec_a[j+1];
          vec_a[j+1] = aux;
        }
      }
    }
    for (int j=0;j<vec_a.length;j++){
      System.out.print("  aux "+j+" [ "+vec_aux[j]+" ]  "); //  contiene al vector original
      System.out.println("   A [ "+vec_a[j]+ " ] * ");//  vector ordenado
    }
  }
}
