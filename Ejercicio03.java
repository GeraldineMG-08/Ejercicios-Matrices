
import java.util.Scanner;


public class Ejercicio03 {

    public static void main(String[] args) {
        // Dada una matriz mmm de números enteros y dimensión ddd, escribe un algoritmo que calcule
        // la suma de los elementos en el "perímetro" de la matriz (es decir, los elementos que están en los bordes).

        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese el tamaño de la matriz (m*m):");
        int m = leer.nextInt();
        int [][] matriz = Matriz(leer, m);

        System.out.println("Matriz: ");
        Imprimir(matriz, m);

     
        System.out.println("Suma del perimetro es: " + SumaPerimetro(matriz, m, 0));

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
   
    public static int SumaPerimetro(int[][] matriz, int d, int k) {
        int SumaPerimetro = 0;
        int limSuperior = k;
        int limInferior = d - 1 - k;

        for (int j = limSuperior; j <= limInferior; j++) {
            SumaPerimetro += matriz[limSuperior][j]; 
            if (limSuperior != limInferior) { 
                SumaPerimetro += matriz[limInferior][j]; 
            }
        }

        for (int i = limSuperior + 1; i < limInferior; i++) { 
            SumaPerimetro += matriz[i][limSuperior]; 
            SumaPerimetro += matriz[i][limInferior]; 
        }
        return SumaPerimetro; 
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

