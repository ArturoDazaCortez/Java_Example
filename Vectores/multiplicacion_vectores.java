/*
 * Author:  Lunix
 * Created: 
*/
import java.util.*;
import java.lang.Thread;

class multiplicacion_vectores{

  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);
    Random rdm = new Random();

    int largo,pos_vec_uno,pos_vec_dos;
    System.out.println("Ingrese la dimension de los vector: ");
    largo = scan.nextInt();
    int [] vec_uno = new int[largo];
    int [] vec_dos = new int[largo];

    System.out.println("Porfavor espere mientras se llenan los Vectores");
    //Thread.sleep(1000);
    for (int i = 0; i < vec_uno.length; i++)
    {
      System.out.print("..");
      pos_vec_uno = rdm.nextInt() * 100 + 1;
      vec_uno[i] = pos_vec_uno;
      pos_vec_dos = rdm.nextInt() * 100 + 1;
      vec_dos[i] = pos_vec_dos;
    }
    for (int j=0; j<vec_uno.length; j++)
    {
      int [] vec_resultado = new int[vec_uno.length];
      int aux_uno = ;
    }

  }
}
