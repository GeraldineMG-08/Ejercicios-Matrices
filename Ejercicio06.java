
import java.util.Scanner;


public class Ejercicio06 {

    public static void main(String[] args) {
        // Escribe un algoritmo que recorra una matriz cuadrada o rectangular M en forma de espiral, 
        // comenzando desde la esquina superior izquierda y moviéndose en sentido horario. 
        // El algoritmo debe devolver los elementos en el orden en que son visitados.

        Scanner leer = new Scanner (System.in);
        System.out.println("Matriz: ");
        int filas=filas(leer); //n = filas
        int columnas=columnas(leer); //m=columnas
       
        int [][] matriz = Matriz(leer, filas, columnas);
        int [] array = recorrerEnEspiral(matriz, filas, columnas);
        
        System.out.println("Matriz: ");
        Imprimir(matriz, filas, columnas);
        System.out.println("Elementos visitados: ");
        for (int i=0; i< filas*columnas; i++){
                System.out.print(array[i]+"  ");
            }
            System.out.println();  

    }

    public static int filas (Scanner leer){
        System.out.println("Ingrese la cantidad de filas:");
        int F = leer.nextInt();
        return F;
    }
    
    public static int columnas (Scanner leer){
        System.out.println("Ingrese la cantidad de columnas:");
        int C = leer.nextInt();
        return C;
    }
    
    public static int [][] Matriz (Scanner leer, int filas, int columnas){
        int [][] Matriz = new int [filas][columnas];
        
        System.out.println("Ingrese los elementos de la matriz: ");
        for ( int i=0; i<filas; i++){
            for (int j=0; j<columnas; j++){
                Matriz[i][j]=leer.nextInt();
            }
        }
        return Matriz; 
    }
   
    public static int[] recorrerEnEspiral(int[][] matriz, int filas, int columnas) {

        int[] resultado = new int[filas * columnas];
        int indice = 0;

        int arriba = 0, abajo = filas - 1;
        int izquierda = 0, derecha = columnas - 1;

        while (arriba <= abajo && izquierda <= derecha) {
            // Recorrer de izquierda a derecha
            for (int j = izquierda; j <= derecha; j++) {
                resultado[indice++] = matriz[arriba][j];
            }
            arriba++;

            // Recorrer de arriba a abajo
            for (int i = arriba; i <= abajo; i++) {
                resultado[indice++] = matriz[i][derecha];
            }
            derecha--;

            if (arriba <= abajo) {
                // Recorrer de derecha a izquierda
                for (int j = derecha; j >= izquierda; j--) {
                    resultado[indice++] = matriz[abajo][j];
                }
                abajo--;
            }

            if (izquierda <= derecha) {
                // Recorrer de abajo hacia arriba
                for (int i = abajo; i >= arriba; i--) {
                    resultado[indice++] = matriz[i][izquierda];
                }
                izquierda++;
            }
        }

        return resultado;
    }

    public static void Imprimir (int [][] matriz, int filas, int columnas){
        for ( int i=0; i<filas; i++){
            for (int j=0; j<columnas; j++){
                System.out.print(matriz[i][j]+"  ");
            }
            System.out.println();
        }
    }
}


