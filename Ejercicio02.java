import java.util.Scanner;

public class Ejercicio02 {

    public static void main(String[] args) {
        // Dada una matriz cuadrada mmm de dimensión ddd, escribe un algoritmo 
        // que permita rotar la matriz 90° en el sentido de las agujas del reloj.
        
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese el tamaño de la matriz (m*m):");
        int m = leer.nextInt();
        int [][] matriz = Matriz(leer, m);

        System.out.println("Matriz: ");
        Imprimir(matriz, m);
 
        int [][] MatrizNueva = Rotacion(matriz,  m);
     
        System.out.println("Matriz Rotada 90º: ");
        Imprimir(MatrizNueva, m);  
    
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
   
    public static int [][] Rotacion (int [][] matriz, int m){
        int [][] MatrizNueva = new int [m][m];
        int b = m-1;    
        for ( int i=0; i<m; i++){
            int a = 0;
            for (int j=0; j<m; j++){
                MatrizNueva[a][b]=matriz[i][j];
                a++;
            }
            b--;
        }
        return MatrizNueva; 
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

