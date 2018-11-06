/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

/**
 *
 * @author juanfran
 */
public class Agenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Gestor gestor = new Gestor("Alfredo tu culpa es");
        System.out.println(gestor.mostrarTodasPersonas());
        
    }
    
}
