
import java.util.Scanner;


public class Ejercicio01 {

    public static void main(String[] args) {
        // Dada una matriz cuadrada mmm de números enteros de dimensión ddd, escribe un algoritmo que calcule la suma de:
        // Los elementos de la diagonal principal y Los elementos de la diagonal secundaria 
        
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese el tamaño de la matriz (m*m):");
        int m = leer.nextInt();
        int [][] matriz = Matriz(leer, m);

        System.out.println("Matriz: ");
        Imprimir(matriz, m);
        System.out.println("Suma diagonal principal: "+ SumaDiagonalPrincipal(matriz, m));  
        System.out.println("Suma diagonal secundaria: "+ SumaDiagonalSecundaria(matriz, m));  
    }

    public static int [][] Matriz (Scanner leer, int m){
        int [][] Matriz = new int [m][m];

        System.out.println("Ingrese los elementos de la matriz: ");
        for ( int i=0; i<m; i++){
            for (int j=0; j<m; j++){
                Matriz[i][j]=leer.nextInt();
            }
        }
        return Matriz; 
    }
   
    public static int SumaDiagonalPrincipal (int [][] matriz, int m){
        int sum = 0;
        for (int i=0; i<m; i++){
            for (int j=0; j<m; j++){
                if(i == j){
                sum += matriz[i][j];
                }
            } 
        }
        return sum;
    }
    
    public static int SumaDiagonalSecundaria (int [][] matriz, int m){
        int sum = 0;
        for (int i=0; i<m; i++){
            for (int j=0; j<m; j++){
                if(i + j == m-1){
                sum += matriz[i][j];
                }
            } 
        }
        return sum;
    }


    public static void Imprimir (int [][] matriz, int m){
        for ( int i=0; i<m; i++){
            for (int j=0; j<m; j++){
                System.out.print(matriz[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
