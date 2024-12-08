
import java.util.Scanner;


public class Ejercicio05 {

    public static void main(String[] args) {
        // Escribe un algoritmo que determine si una matriz cuadrada m y m es simétrica 
        // (es decir, si m[i][j]=m[j][i] para todos i,j).

        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese el tamaño de la matriz (m*m):");
        int m = leer.nextInt();
        int [][] matriz = Matriz(leer, m);

        System.out.println("Matriz: ");
        Imprimir(matriz, m);
        
        System.out.println("");
        Simetrica(matriz, m);

    
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
   
    
    public static void Simetrica (int [][] matriz, int m){
        for ( int i=0; i<m; i++){
            for (int j=0; j<m; j++){
                if (matriz[i][j] != matriz[j][i]){
                    System.out.println("La matriz NO es simetrica. ");
                    return;
                }
            }
        }
        System.out.println("La matriz es SIMETRICA. ");

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


