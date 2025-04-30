/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg30abril.clase3.sem4;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
/**
 *
 * @author EstudianteAuxiliar
 */
public class Clase3Sem4 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("-LISTAS BASADA EN ARRAYS-");
        List<Integer> listaBasadaEnarrays = new ArrayList<Integer>();
        listaBasadaEnarrays.add(555);
        listaBasadaEnarrays.add(0,33);
        listaBasadaEnarrays.add(listaBasadaEnarrays.size(),44);
        listaBasadaEnarrays.remove(0);
        System.out.println("Tamaño de la lista "+listaBasadaEnarrays.size());
        listaBasadaEnarrays.remove(0);
        System.out.println("Tamaño de la lista "+listaBasadaEnarrays.size());
        
        for (int i=0;i<listaBasadaEnarrays.size();i++){
            System.out.println(listaBasadaEnarrays.get(i));
        }
        /////////////////////////////////////////////////////////////////
        System.out.println("-LISTAS ENLAZADAS-");
        LinkedList<Integer> listaEnlazada = new LinkedList<Integer>();
        for (int j = 0; j < 100; j++){
            listaEnlazada.add(j);
        }
        System.out.println("Tamaño de lista enlazada: "+listaEnlazada.size());
        int valor=0;
        for (int j=0; j<listaEnlazada.size();j++){
            valor+=listaEnlazada.get(j);
        }
        listaEnlazada.addFirst(101);
        listaEnlazada.addLast(-1);
        listaEnlazada.poll();
        listaEnlazada.push(100);
        listaEnlazada.peek();
        
        System.out.println("Tamaño de la lista antes del poll: "+listaEnlazada.size());
        
        Integer pool = listaEnlazada.poll();
        
        System.out.println("Tamaño de la lista después del poll: "+listaEnlazada.size());
        
        Integer peek=listaEnlazada.peek();
        System.out.println("Valor peek: "+peek+", y el tramaño de la lista es: "+listaEnlazada.size());
        
        Queue<Integer> colaPropia = new ConcurrentLinkedQueue<Integer>();
        
        System.out.println("Total: "+valor);
        
    }
    
}
