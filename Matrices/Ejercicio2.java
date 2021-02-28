/*
 * Author:  Lunix
 * Created: 
*/
import java.util.*;
/*
*  Desarrollar una app q ayude a un instituto a gestionar las
*  notas de 5 alunmos, se pide leer el 1, 2 y 3 parcial de
*  cada grupo. Debemos mostrar la media del grupo de cada parcial
*  y la media del alunmo q se encuentre en la posicion N
*/
class Ejercicio2{

  public static int tam_grp = 0;
  public static int sum_pro = 0;
  public static int med_grup = 0;
  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);
    //Random rdm = new Random();

    int [][] notas = new int[3][3];
    int [] prom = new int [3];

    int aux= 0;
    int cant_med = 0;

    System.out.print("Cantidad de grupos: ");
    tam_grp = scan.nextInt();
    for (int h=0;h<tam_grp;h++){
      for (int i=0;i<notas.length;i++){
        for (int j=0;j<notas[i].length;j++){
          System.out.print("alunmo "+ (i+1) +" nota"+ (j+1) +" ");
          aux = scan.nextInt();
          notas [i][j] = aux;

        }
        sum_pro = sum_pro + aux;
        cant_med++;
        med_grup = sum_pro / cant_med;
        prom [h] = med_grup;
      }
    }
    //med_grup = sum_pro / cant_med;
    for (int[] alumno : notas) {
      for (int nota : alumno) {
        System.out.print(nota + "\t"); // Tabulador
      }
      System.out.print("\n"); // Salto de Línea
    }
    for (int pro : prom){
      System.out.println(pro+" ");
    }
    System.out.print(sum_pro+"\n");
    System.out.println(med_grup+"\n "+cant_med);
  }
}
