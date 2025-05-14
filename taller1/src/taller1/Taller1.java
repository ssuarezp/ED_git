/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller1;

/**
 *
 * @author santi
 */
public class Taller1 {

    /**
     * @param args the command line arguments
     */
    public static String[] agregarDato(String[] array, String dato) {
        // Crear un nuevo array con una posición adicional
        String[] nuevoArray = new String[array.length + 1];

        // Copiar los elementos existentes
        for (int i = 0; i < array.length; i++) {
            nuevoArray[i] = array[i];
        }

        // Agregar el nuevo dato al final
        nuevoArray[array.length] = dato;

        return nuevoArray;
    }

    public static void main(String[] args) {
        // Prueba
        String[] resultado = agregarDato(new String[] {}, "Estas");

        // Mostrar resultado como "Hola, Como, Estas"
        System.out.println(String.join(", ", resultado));
    }
    
    
}
