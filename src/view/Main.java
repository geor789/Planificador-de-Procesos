package view;

import java.util.ArrayList;
import java.util.List;
import model.Manejador;
import model.Metodo;
import model.Proceso;

public class Main {

    public static void main(String[] args) {
        Manejador manejador = new Manejador();
        Metodo metodo;
        
        /*Lista de procesos Cuestionario 1 - Parte 2 - Ejercicio 1*/
        List<Proceso> listaFCFS = new ArrayList();

        listaFCFS.add(new Proceso("P1", 0, 10));
        listaFCFS.add(new Proceso("P2", 0, 1));
        listaFCFS.add(new Proceso("P3", 0, 2));
        listaFCFS.add(new Proceso("P4", 0, 1));
        listaFCFS.add(new Proceso("P5", 0, 5));
        /* Lista de procesos Cuestionario 1 - Parte 2 - Ejercicio 1*/

        /*listaFCFS.add(new Proceso("A", 0, 2));
        listaFCFS.add(new Proceso("B", 1, 3));
        listaFCFS.add(new Proceso("C", 2, 4));
        listaFCFS.add(new Proceso("D", 3, 3));
        listaFCFS.add(new Proceso("E", 4, 1));
        listaFCFS.add(new Proceso("F", 5, 4));
        listaFCFS.add(new Proceso("G", 6, 3));*/
        /* PRUEBA FCFS 
        metodo = manejador.firstComeFirtServed(listaFCFS);
        System.out.println(metodo);
        
        
        
        /* PRUEBA Prioridad */
        Manejador manejador2 = new Manejador();
        List<Proceso> listaP = new ArrayList();
        listaP.add(new Proceso("A", 0, 2, 2));
        listaP.add(new Proceso("B", 1, 3, 3));
        listaP.add(new Proceso("C", 2, 4, 4));
        listaP.add(new Proceso("D", 3, 3, 2));
        listaP.add(new Proceso("E", 4, 1, 0));
        listaP.add(new Proceso("F", 5, 4, 3));
        listaP.add(new Proceso("G", 6, 3, 1));
        /* PRUEBA FCFS */
        metodo = manejador2.priority(listaP);
        System.out.println(metodo);
        
        
        
    }

}
