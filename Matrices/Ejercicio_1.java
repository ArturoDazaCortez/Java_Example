/*
 * Author:  Lunix
 * Created: 
*/
import java.util.*;
/*
* Leer una matriz C de orden p (matriz cuadrada), mostrar los
* elementos de la diagonal principal, secundaria, de la matriz
* superior y de la matriz triangular interior
*/
class Ejercicio_1{

  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);
    Random rdm = new Random();

    int tam_mat = 0;
    int aux = 0;

    System.out.println("Tamaño de la matriz:");
    tam_mat = scan.nextInt();
    int [][] c = new int [tam_mat][tam_mat];
    int [] diagoPrincipal = new int[c.length];
    int [] diagoSecundaria = new int[c.length];

    for (int i=0;i<c.length;i++){
      for (int j=0;j<c[i].length;j++){
        aux = rdm.nextInt(9)+1;
        c [i][j] = aux;
      }
    }

    for(int i=0;i<c.length;i++){
      for(int j=0;j<c[i].length;j++){
        if(i==j){
          diagoPrincipal[i] = c[i][j];
        }
        if(i+j == c.length-1){
          diagoSecundaria[i] = c[i][j];
        }
      }
    }
    for (int[] most : c) {
      for (int mat : most) {
        System.out.print(mat + "\t"); // Tabulador
      }
      System.out.print("\n"); // Salto de Línea
    }
    System.out.print("\n");
    System.out.println("\nDiagonal Principal");
    for(int i=0;i<diagoPrincipal.length;i++){
      System.out.print("\t" + diagoPrincipal[i]);
    }
    System.out.println("\n\nDiagonal Secundaria");
    for(int i=0;i<diagoSecundaria.length;i++){
      System.out.print("\t" + diagoSecundaria[i]);
    }
    System.out.println("\nTriangulo inferior");
    for (int i = 0;i<c.length; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print("\t"+c[i][j]);
      }
    }
    System.out.println("\nTriangulo superior");
    for (int i=0;i<c.length; i++) {
      for (int j=0;j<=i;j++) {
        System.out.print("\t"+ c[j][i]);
      }
    }
    System.out.print("\n");

  }
}
