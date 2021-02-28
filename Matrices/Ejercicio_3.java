/*
 * Author:  Lunix
 * Created: 
*/
import java.util.*;
class Ejercicio_3{

  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);

    System.out.println("De que tamaño quiere el arreglo?.");
    int cantidad = scan.nextInt();

    int[][]arreglo = new int[cantidad][cantidad];


    for ( int i=0;i< arreglo.length ;i++){
      for (int j=0;j<arreglo[0].length;j++){
        int x=i+1;
        int y=j+1;
        if((i==j) ||  (j == (cantidad - x)) || (j==(cantidad-x-y))){
          arreglo[i][j] = 4;
          System.out.print(arreglo[i][j] + " ");
        } else{
          arreglo[i][j] = 1;
          System.out.print(arreglo[i][j] + " ");
        }
      }
      System.out.println();
    }

    for (int [] au:arreglo){
      for (int most:au){
        System.out.print(" "+most);
      }
      System.out.print("\n");
    }
//    System.out.print(x);
  }
}
