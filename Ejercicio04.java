import java.util.Scanner;

public class Ejercicio04 {

    public static void main(String[] args) {
        // Dada una matriz mmm de n×mn \times mn×m, escribe un algoritmo que genere la matriz transpuesta.
        
        Scanner leer = new Scanner (System.in);
        System.out.println("Matriz: ");
        int filas=filas(leer); //n = filas
        int columnas=columnas(leer); //m=columnas
       
        int [][] matriz = Matriz(leer, filas, columnas);
        int [][] Traspuesta = Traspuesta(matriz, filas, columnas);
        
        System.out.println("Matriz: ");
        Imprimir(matriz, filas, columnas);
        System.out.println("Su Matriz Traspuesta es: ");
        Imprimir(Traspuesta, columnas, filas);  
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
    
    public static int [][] Traspuesta (int [][] matriz, int filas, int columnas){
        int [][] Traspuesta = new int [columnas][filas];
        int b = 0;    
        for ( int i=0; i<filas; i++){
            int a = 0;
            for (int j=0; j<columnas; j++){
                Traspuesta[a][b]=matriz[i][j];
                a++;
            }
            b++;
        }
        return Traspuesta; 
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
