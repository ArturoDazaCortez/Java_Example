/*
 * Author:  Lunix
 * Created: 
*/
import java.util.*;
/*
* lea una matriz de N * M y acontinuacion;
* a) elimine la fila x(x se debe leer y validar)
* b) elimine la columna y(y se debe leer y validar)
* c) inserte una nueva fila en x (x se debe leer y validar)
* d) inserte una columna y (y se debe leer y validar)
*/
class Ejercicio_5{

  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);

    int filas, columnas = 0;
    int sc = 0;

    System.out.print("Cuantas filas para la matriz: ");
    filas = scan.nextInt();
    System.out.print("Cuantas columnas para la matriz: ");
    columnas = scan.nextInt();
    int [][] mat=new int[filas][columnas];
    int [][] mat1=new int[filas-1][columnas];
    int [][] mat2=new int [mat.length][mat[0].length-1];
    int [][] mat3=new int[mat.length][mat[0].length+1];
    int [][] mat4=new int[mat.length+1][mat[0].length];
    for(int i=0;i<mat.length;i++) {
      for(int j=0;j<mat[i].length;j++) {
        System.out.print("Ingrese componente:");
        mat[i][j] = scan.nextInt();
      }
    }
    System.out.println("\nMatriz original\n");
    for (int[] most : mat) {
      for (int matr : most) {
        System.out.print("\t"+ matr); // Tabulador
      }
      System.out.print("\n");
    }
    System.out.print("Fila a eliminar (entre 1 y "+mat.length+"): ");
    sc = scan.nextInt();
    sc = sc-1;
    int aux=0;
    for(int i=0;i<mat.length;i++){
      if(i!=sc){
        System.arraycopy(mat, i, mat1, aux, 1);
        aux++;
      }
    }
    System.out.println("\nMatriz eliminando una fila\n");
    for (int[] most : mat1) {
      for (int matr : most) {
        System.out.print("\t"+ matr); // Tabulador
      }
      System.out.print("\n");
    }
    System.out.print("Columna a eliminar (entre 1 y "+mat[0].length+"): ");
    sc = scan.nextInt();
    sc = sc-1;
    for(int fil=0;fil<mat.length;fil++){
      for(int col=0, k=0;col<mat[0].length;col++){
        if(col!=sc){
          mat2[fil][k]=mat[fil][col];
          k++;
        }
      }
    }
    System.out.println("\nMatriz eliminando una columna\n");
    for (int[] most : mat2) {
      for (int matr : most) {
        System.out.print("\t"+ matr); // Tabulador
      }
      System.out.print("\n");
    }
    System.out.print("Insertar en fila (entre 1 y "+mat.length+"): ");
    sc = scan.nextInt();
    if (sc > mat.length){
      System.out.println("Error..,no puede ser mayor de "+ mat.length);
    } else {
      for(int i=0;i<sc;i++) {
        for(int j=0;j<mat[0].length;j++) {
          mat4[i][j] = mat[i][j];
        }
      }
      if (mat.length == mat[0].length){
        for (int i=0; i<mat.length; i++) {
          mat4[sc-1][i]=-99;
        }
        for(int i=sc;i<mat.length+1;i++) {
          for(int j=0;j<mat[0].length;j++) {
            mat4[i][j] = mat[i-1][j];
          }
        }
      } else {
        for (int i=0; i<mat.length+1; i++) {
          mat4[sc-1][i]=-99;
        }
        for(int i=sc;i<mat.length+1;i++) {
          for(int j=0;j<mat[0].length;j++) {
            mat4[i][j] = mat[i-1][j];
          }
        }
      }
    }
    System.out.println("\nMatriz insertando una fila\n");
    for (int[] most : mat4) {
      for (int matr : most) {
        System.out.print("\t"+ matr); // Tabulador
      }
      System.out.print("\n");
    }
    System.out.print("Insertar en columna (entre 1 y "+mat[0].length+"): ");
    sc = scan.nextInt();
    if (sc > mat.length){
      System.out.println("Error..,no puede ser mayor de "+ mat[0].length);
    } else {
      for (int j=0;j<sc-1;j++) {
        for (int i=0;i<mat.length;i++) {
          mat3[i][j] = mat[i][j];
        }
      }
      for (int i=0; i<mat.length; i++) {
        mat3[i][sc-1]=-99;
      }
      for (int j = sc;j<mat[0].length+1; j++) {
        for (int i=0;i<mat.length;i++) {
          mat3[i][j] = mat[i][j-1];
        }
      }
    }
    System.out.println("\nMatriz insertando una columna\n");
    for (int[] most : mat3) {
      for (int matr : most) {
        System.out.print("\t"+ matr); // Tabulador
      }
      System.out.print("\n");
    }
  }
}
