
package spp.pserranoh.a10;
import java.util.Scanner;

public class SPPPSERRANOHA10 {

  
    public static void main(String[] args) {
        // TODO code application logic here
    // Definir tamaño de la matriz
        int tamaño=Int("el tamaño de los arreglos: ");
        // Definir los valores dentro de la matriz
        int [][] a=crearMatriz("A",tamaño);
        int [][] b=crearMatriz("B",tamaño);
        // Realizar operación de multiplicación
        restaMatriz(a,b);
        multiplicacionMatriz(a,b);
        
    }
    public static int Int(String mensaje){
        Scanner kb = new Scanner (System.in);
        int varEntera = 0;
        boolean flag;
        
        do{
        System.out.print("Introduzca " + mensaje);
        try{
        varEntera = kb.nextInt();
        flag=false;
    }catch (Exception ex){
            System.out.println("Introdujo una variable incorrecta " + ex);
            flag=true;
            kb.nextLine();
    } 
  } while (flag); 
    return varEntera;
    }
    public static int [][] crearMatriz(String mensaje, int tamaño){
        System.out.println("\nIntroduzca el contenido de la matriz "+mensaje);
        int[][]Matrix=new int[tamaño][tamaño];
        int valor;
        System.out.println("El tamaño de la matriz es "+Matrix.length);
        for (int i=0; i<Matrix.length; i++){
            for (int j=0; j<Matrix[i].length; j++){
            Matrix[i][j]=Int("el valor ("+i+","+j+"): ");
            }
        }
        return Matrix;
        }
    public static void multiplicacionMatriz(int[][] a,int[][] b){
        int[][]r=new int[a.length][a.length];
        System.out.println("\nProductos");
        for (int i=0; i<r.length; i++){
            for (int j=0; j<r.length; j++){
                for (int z=0; z<r.length; z++){
                    r[i][j]+=(a[i][z]*b[z][j]);
                }
            System.out.println("El valor ("+i+","+j+") es igual a: "+(r[i][j]));
            }
        }
    }    
    public static void restaMatriz(int[][] a,int[][] b){
        int[][]r=new int[a.length][a.length];
        System.out.println("\nResta");
        for (int i=0; i<r.length; i++){
            for (int j=0; j<r[i].length; j++){
            r[i][j]=a[i][j]-b[i][j];
            System.out.println("El valor ("+i+","+j+") es igual a: "+(r[i][j]));
            }
        }
    }    
}   
    