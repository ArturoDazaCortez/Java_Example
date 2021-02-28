/*
 * Author:  Lunix
 * Created: 
*/
import java.util.*;
class Ejercicio3{

  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);

    int tam = 0;
    System.out.print("Tamaño de la matriz: ");
    tam = scan.nextInt();
    int [][] matriz = new int [tam][tam];
    for (int i=0;i<matriz.length;i++){
      for (int j=0;j<matriz[0].length;j++){
        if (matriz[i][j]==matriz[0][j] || matriz[i][j] == matriz[0][matriz[0].length-1]){
          matriz[i][j] = 4;
          matriz[i][tam/2] = 1;
          //matriz[i][matriz[0].length-1] = 4;
          //matriz[tam/2][j] = 3;
        } //else {
          if (matriz[i][j]==matriz[1][j] || matriz[i][j] == matriz[1][matriz[0].length-1]){
            matriz[i][j] = 4;
            //matriz[i][matriz.length-(tam/2)] = 2;
          }
        //}
      }
    }
  for (int [] most : matriz){
    for (int mo : most){
      System.out.print("\t"+mo);
    }
    System.out.print("\n");
  }
  }
}
