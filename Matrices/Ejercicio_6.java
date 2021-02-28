/*
 * Author:  Lunix
 * Created: 
*/
import java.util.*;
/*
* lea N * M (N y M deben dser leidos y validados) almacenenlos en una matriz (por filas), y :
* a) señale si la matriz es cuadrada !
* b) determine y muestre el promedion de los n * m  numeros !
* c) determine y muestre el promedio de filas !
* d) determine y muestre el promedio por columnas !
*/
class Ejercicio_6{
  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);
    String mensaje = new String(" ");

    int filas, columnas = 0;
    int sc= 0;
    int aux = 0;
    int sum_pro = 0;
    int cant_med = 0;
    int med_grup = 0;

    System.out.print("Cuantas filas para la matriz: ");
    filas = scan.nextInt();
    System.out.print("Cuantas columnas para la matriz: ");
    columnas = scan.nextInt();
    if (filas == columnas){
      mensaje = new String("Es una matriz cuadrada");
    } else {
      mensaje = new String("No es una matriz cuadrada");
    }
    int [][] mat=new int[filas][columnas];
    for(int i=0;i<mat.length;i++) {
      for(int j=0;j<mat[i].length;j++) {
        System.out.print("Ingrese componente:");
        mat[i][j] = scan.nextInt();
      }
    }
    for(int i=0;i<mat.length;i++) {
      for(int j=0;j<mat[i].length;j++) {
        aux = mat[i][j];
        sum_pro = sum_pro + aux;
        cant_med++;
      }
      med_grup = sum_pro / cant_med;
    }
    System.out.println("\nMatriz original\n");
    for (int[] most : mat) {
      for (int matr : most) {
        System.out.print("\t"+ matr); // Tabulador
      }
      System.out.print("\n");
    }
    System.out.println("\n\t"+mensaje);
    System.out.println("\nEl promedio de N * M es:");
    System.out.println("\t"+sum_pro+" / "+cant_med+" = "+med_grup+"\n");
    System.out.print("introduzca fila: ");
    sc = scan.nextInt();
    aux = 0;
    sum_pro = 0;
    cant_med = 0;
    med_grup = 0;
    for(int i=0;i<mat[0].length;i++) {
      aux = mat[sc][i];
      sum_pro = sum_pro + aux;
      cant_med++;
      med_grup = sum_pro / cant_med;
    }
    System.out.println("\nEl promedio de la fila "+sc+" * M es:");
    System.out.println("\t"+sum_pro+" / "+cant_med+" = "+med_grup);
    System.out.print("introduzca columna: ");
    sc = scan.nextInt();
    aux = 0;
    sum_pro = 0;
    cant_med = 0;
    med_grup = 0;
    for(int i=0;i<mat.length;i++) {
      aux = mat[i][sc];
      sum_pro = sum_pro + aux;
      cant_med++;
      med_grup = sum_pro / cant_med;
    }
    System.out.println("\nEl promedio de la columna N * "+sc+" es:");
    System.out.println("\t"+sum_pro+" / "+cant_med+" = "+med_grup);

  }
}
