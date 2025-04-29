/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg23abril.clase2.sem3;

/**
 *
 * @author santi
 */
public class Clase2Sem3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                int[] a = {4,5,6,20,1,54,100,2,80};
        int m=5;
        int n = a.length;
        int valor = a[0];
        if (m>=1 && m>=n){
            for (int i=1;i<n;i++){
                if (i>m){
                    break;
                }
                if (valor < a[i]){
                    valor = a[i];
                }
            }   
        }
        System.out.println("El valor mayor es: "+valor);
    }
    
}
