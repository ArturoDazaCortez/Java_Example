/*
 * Author:  Lunix
 * Created: 
*/
import java.util.*;
public class MultiplicacionAleatoriaVectores
{

	public static void main (String args[])
  {

    Random r=new Random();
	  Scanner scan=new Scanner(System.in);

    System.out.println("Ingrese la dimension de la matriz");
    int x1 = scan.nextInt();
    int z1 = x1;
    int x2 = x1;
    int z2 = x1;

    int[][] m1=new int[x1][z1];
    int[][] m2=new int[x2][z2];
    int[][] mR=new int[x1][z2];

		System.out.println("\n");
		System.out.println("	La matriz 1:");

    for(int i=0;i<x1;i++)
		{
      System.out.print("		[ ");
      for(int j=0;j<z1;j++)
      {
        m1[i][j]=r.nextInt(9);
        System.out.print(m1[i][j]+" ");
      }
      System.out.print("]");
      System.out.println("");
    }

		System.out.println("\n");
    System.out.println("	La matriz 2:");
    for(int i=0;i<x2;i++)
    {
      System.out.print("		[ ");
      for(int j=0;j<z2;j++)
      {
        m2[i][j]=r.nextInt(9);
        System.out.print(m2[i][j]+" ");
      }
      System.out.print("]");
      System.out.println("");
    }

		System.out.println("\n");
		System.out.println("	La matriz resultante es: ");
    for(int i=0;i<x1;i++)
    {
      System.out.print("		[ ");
      for(int j=0;j<z2;j++)
      {
        for(int h=0;h<z1;h++)
        {
          mR[i][j]+=m1[i][h]*m2[h][j];
        }
        System.out.print(mR[i][j]+" ");
      }
      System.out.print("]");
      System.out.println("");
    }
  }
}
