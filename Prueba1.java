package prueba1; // {}   []
import java.util.Scanner;
public class Prueba1{
    private int cantElementos(){
        System.out.println("Cuantos elementos tendra la lista?");
        int num = new Scanner(System.in).nextInt();
                return num; /*se usa para controlar el for del
                metodo "cargarElementos"*/
    }
    private int[] cargaElementos(int dim){ 
        int[] numeros = new int[dim];
        Scanner scan = new Scanner(System.in);
        
        for(int i = 0; i < dim; ++i){
            numeros[i]= scan.nextInt();
        }
        return numeros;
    }
    
    private void mostrarLista(int[] xnum){
        System.out.println("Desordenado es asi: ");
        for(int i = 0; i < xnum.length; ++ i){
            System.out.print(xnum[i] + " - ");
        }
    }
    
    private void ordenamiento(int[] xnum){//ordenar el array ingresado
        boolean intercambio;
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("pero ordenado queda: ");
        
        do{ 
             intercambio = false;
            for(int j = 1; j < xnum.length; ++ j){
                if (xnum[j - 1] > xnum[j]){
                    int aux = xnum[j - 1];
                    xnum[j - 1] = xnum[j];
                    xnum[j] = aux;
                    intercambio = true;
                }  
               } 
             } 
         while( intercambio == true);
        
        for(int j = 0; j < xnum.length; ++ j){
            System.out.print(xnum[j] + " - ");
        } 
    }
    public static void main(String[] args){
        Prueba1 ordenar = new Prueba1();
        int elementos = ordenar.cantElementos();
        int[] xnum = ordenar.cargaElementos(elementos);
        ordenar.mostrarLista(xnum);
        ordenar.ordenamiento(xnum);
    }   
}
