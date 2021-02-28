/*
 * Author:  Lunix
 * Created: 
*/
import java.util.*;
/*
*  Dado una secuencia de número leídos y almacenados
*  en un vector A y un numero leido determinar si dicho
*  número se encuentra o no en el vector.
*/
class Tercer_Ejercicio{

  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);
    Random rdm = new Random();

    int [] vec_a = new int[10];

    int aux, num_buscado = 0;
    int indice =0;
    String mensaje = new String("");

    for (int i=0;i<vec_a.length;i++){
      vec_a [i] = rdm.nextInt(9)+1;
      System.out.print("A "+i+"["+vec_a[i]+"]  ");
    }
    System.out.print("\nNumero: ");
    aux = scan.nextInt();
      for (int j =0;j<9;j++){
        if (vec_a[j] == aux){
          num_buscado = vec_a[j];
          indice = j;
        } else {
            mensaje = new String("no hay numero");
        }
      }
    if (num_buscado != 0){
      System.out.println("\n  "+indice+"   "+num_buscado);
    } else {
      System.out.println("\n"+mensaje);
    }
  }
}
