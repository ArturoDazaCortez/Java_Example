/*
 * Author:  Lunix
 * Created: 
*/
import java.util.*;
class matriz{

  public static void main(String[] args){

    int A [][] = new int [3][3];
    for (int i=0;i<A.length;i++)
    {
      for (int j=0;j<A.length;j++)
      {
        A[i][j]=(i*A.length+(j+5));
        System.out.print(A[i][j]+" ");
      }
      System.out.println("");
    }
  }
}
