package ui;

import bl.entities.ListaAdyacencia;
import bl.entities.MatrizAdyacencia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Grafo2Lista {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;
    static ListaAdyacencia listaAdyacencia;

    public static void main(String[] args) throws IOException {


        start();
    }


    public Grafo2Lista() {
    }

    public static void start() throws IOException {
        boolean salir = false;
        do {
            imprimirMenu();
            int opcion = leerOpcion();
            salir = ejecutarOpcion(opcion);

        } while (!salir);


    }

    public static void imprimirMenu() {
        System.out.println("======= MENU DEL PROGRAMA ======= ");
        System.out.println("");
        System.out.println("======= GRAFO 2 ======= ");
        System.out.println("1. Inicializar Lista");
        System.out.println("2. Agregar");
        System.out.println("3. Visualizar");
        System.out.println("4. Salir");

    }

    public static int leerOpcion() throws IOException {
        System.out.println("Ingrese la opcion que desea: ");
        return Integer.parseInt(in.readLine());
    }

    public static boolean ejecutarOpcion(int opcion) throws IOException {
        boolean salir = false;
        int dato1 = 0;
        int dato2 = 0;
        int vertices = 0;
        int peso = 0;
        switch (opcion) {
            case 1:
                System.out.print("Ingrese la cantidad de vertices que posee el grafo: ");
                vertices = Integer.parseInt(in.readLine());
                listaAdyacencia =  new ListaAdyacencia(vertices);

                break;
            case 2:
                boolean out = false;
                do {
                    System.out.println("======= Ingrese los arcos ======= ");
                    System.out.print("Digite el valor o ingrese (-1) para salir: ");
                    dato1 = Integer.parseInt(in.readLine());
                    System.out.print("Digite el valor o ingrese (-1) para salir: ");
                    dato2 = Integer.parseInt(in.readLine());
                    System.out.print("Digite el peso del arco o ingrese (-1) para salir: ");
                    peso = Integer.parseInt(in.readLine());
                    if (dato1 == -1 || dato2 == -1 ) {
                        out = true;
                    } else {
                        listaAdyacencia.insertaArista(dato1,dato2,peso);
                    }

                } while (!out);
                break;

            case 3:
                listaAdyacencia.mostrarGrafo();
                break;
        }

        return salir;
    }

}
