/*
 * Author:  Lunix
 * Created: 
*/
import java.util.*;
class vector{

  public static void main(String[] args){

    final int TAMANIO = 26;
    char [] listadeletras = new char[TAMANIO];
    char letra = 'A';
    for (int i=0;i<TAMANIO;i++){
      listadeletras[i]=letra;
      letra++;
    }
    for (int j=0;j<TAMANIO;j++){
      System.out.print(listadeletras[j]+" ");
    }
  }
}
