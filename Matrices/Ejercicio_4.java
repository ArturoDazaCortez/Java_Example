/*
 * Author:  Lunix
 * Created: 
*/
import java.util.*;
/*
* lea 2 matrices de orden N * M y :
* a) Genere la tercera matriz con la suma de ambas
* b) Genere la tercera con la multiplicacion de ambas, si es posible
* para cada caso anterior, muestre la matriz resultante
*/
class Ejercicio_4{

  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);

    int filas, columnas = 0;
    int sc = 0;

    System.out.print("Cuantas filas para la matriz 1: ");
    filas = scan.nextInt();
    System.out.print("Cuantas columnas para la matriz 1: ");
    columnas = scan.nextInt();
    int [][] mat=new int[filas][columnas];
    System.out.print("Cuantas filas para la matriz 2: ");
    filas = scan.nextInt();
    System.out.print("Cuantas columnas para la matriz 2: ");
    columnas = scan.nextInt();
    int [][] mat1=new int[filas][columnas];

    int [][] mat2=new int [mat.length][mat[0].length];
    int [][] mat3=new int[mat.length][mat[0].length];

    for(int i=0;i<mat.length;i++) {
      for(int j=0;j<mat[i].length;j++) {
        System.out.print("Ingrese componente:");
        mat[i][j] = scan.nextInt();
      }
    }
    for(int i=0;i<mat1.length;i++) {
      for(int j=0;j<mat1[i].length;j++) {
        System.out.print("Ingrese componente:");
        mat1[i][j] = scan.nextInt();
      }
    }
    if ((mat.length == mat1.length) && (mat[0].length == mat1[0].length)){
      for (int x=0;x<mat.length; x++) {
        for (int y=0;y<mat[x].length; y++) {
          mat2[x][y] = mat[x][y]+mat1[x][y];
          mat3[x][y] = mat[x][y]*mat1[x][y];
        }
      }

    } else {
      System.out.println("No son cuadras las matrices!!!");
    }
    System.out.println("\nMatriz original\n");
    for (int i=0;i<mat.length;i++) {
      for (int j=0;j<mat[i].length;j++) {
        System.out.print("\t"+ mat[i][j]); // Tabulador
        System.out.print("\t"+ mat1[i][j]); // Tabulador
      }
      System.out.print("\n");
    }
    System.out.print("\nLa suma es: \n");
    for (int[] most : mat2) {
      for (int matr : most) {
        System.out.print("\t"+ matr); // Tabulador
      }
      System.out.print("\n");
    }
    System.out.print("\nLa multiplicacion es: \n");
    for (int[] most : mat3) {
      for (int matr : most) {
        System.out.print("\t"+ matr); // Tabulador
      }
      System.out.print("\n");
    }
  }
}
