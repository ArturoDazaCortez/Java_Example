/*
 * Author:  Lunix
 * Created: 
*/
import java.util.*;
class suma_vectores{

  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);
    int largo,largoA,largoB,pos_vec_uno,pos_vec_dos;
    System.out.println("introduzca el tamaño del vector uno: ");
    largoA = scan.nextInt();
    System.out.println("introduzca el tamaño del vector dos: ");
    largoB = scan.nextInt();
    int [] vec_uno = new int[largoA];
    int [] vec_dos = new int[largoB];

    for (int i = 0; i < vec_uno.length; i++)
    {
      System.out.println("Ingrese el valor de la siguiente posicion en el vector uno: ");
      pos_vec_uno = scan.nextInt();
      vec_uno[i] = pos_vec_uno;
    }
    for (int j=0;j<vec_dos.length;j++)
    {
      System.out.println("Ingrese el valor de la siguiente posicion en el vector dos: ");
      pos_vec_dos = scan.nextInt();
      vec_dos[j] = pos_vec_dos;
    }
    if (vec_dos.length != vec_uno.length)
    {
      int aux_uno = vec_uno[j];
      int [] vec_tres = new int[vec_uno.length];
      for (int h=0;h<vec_tres.length;h++)
      {
        vec_tres[h] = vec_uno[h] + vec_dos[h];
        //System.out.println("la suma de los vectores UNO y DOS es: ");
        System.out.print(vec_tres[h]+" ");
      }
    }

  }
}
