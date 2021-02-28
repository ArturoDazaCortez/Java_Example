/*
 * Author:  Lunix
 * Created: 
*/
import java.util.*;
/*
* Leer una matriz X de orden a*b y hallar su transpuesta.
* mostrar ambas matrices.
*/
class Ejercicio_2{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    Random r = new Random();
    int [][] matrizCuadrada = new int[5][5];
    int [][] matriz = new int [5][3];
    int [][] transpuesta = new int [matriz[0].length][matriz.length];
    int aux = 0;
    for(int i=0;i<matrizCuadrada.length;i++){
        for(int j=0;j<matrizCuadrada[i].length;j++){
            matrizCuadrada[i][j] = r.nextInt(25) + 1;
        }
    }
    System.out.println("Matriz cuadrada original\n");
    for(int i=0;i<matrizCuadrada.length;i++){
        for(int j=0;j<matrizCuadrada[i].length;j++){
            System.out.print(matrizCuadrada[i][j] + "\t");
        }
        System.out.println();
    }
    for(int i=0;i<matrizCuadrada.length;i++){
      for(int j=0;j<matrizCuadrada[i].length;j++){
        if (i>j){
          aux = matrizCuadrada[i][j];
          matrizCuadrada[i][j] = matrizCuadrada[j][i];
          matrizCuadrada[j][i] = aux;
        }
      }
    }
    System.out.println("\n\nMatriz cuadrada transpuesta\n");
    for(int i=0;i<matrizCuadrada.length;i++){
      for(int j=0;j<matrizCuadrada[i].length;j++){
        System.out.print(matrizCuadrada[i][j] + "\t");
      }
      System.out.println();
    }
    for(int i=0;i<matriz.length;i++){
        for(int j=0;j<matriz[i].length;j++){
            matriz[i][j] = r.nextInt(25) + 1;
        }
    }
    for(int i=0;i<matriz.length;i++){
        for(int j=0;j<matriz[i].length;j++){
            transpuesta[j][i] = matriz[i][j];
        }
    }
    System.out.println("\nMatriz original\n");
    for(int i=0;i<matriz.length;i++){
      for(int j=0;j<matriz[i].length;j++){
        System.out.print(matriz[i][j] + "\t");
      }
      System.out.println();
    }
    for(int i=0;i<matriz.length;i++){
        for(int j=0;j<matriz[i].length;j++){
            transpuesta[j][i] = matriz[i][j];
        }
    }
    System.out.println("\n\nMatriz transpuesta\n");
    for(int i=0;i<transpuesta.length;i++){
      for(int j=0;j<transpuesta[i].length;j++){
        System.out.print(transpuesta[i][j] + "\t");
      }
      System.out.println();
    }

  }
}
