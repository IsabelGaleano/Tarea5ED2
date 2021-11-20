package bl.entities;

public class ListaAdyacencia {

    private Nodo grafo[];
    private int vertices;

    public ListaAdyacencia(int vertices){
        this.vertices = vertices;
        grafo = new Nodo[this.vertices];

        for(int i = 0; i < this.vertices; i++){
            grafo[i] = null;
        }
    }


    public boolean existeArista(int v1, int v2)
    {
        if(grafo[v1] == null) return false;
        Nodo actual = grafo[v1];
        while(actual != null){
            if(actual.vertice == v2)return true;
            actual = actual.sgte;
        }
        return false;
    }

    public void insertaArista(int v1, int v2, int peso){

        if(!existeArista(v1, v2)){
            Nodo nuevo = new Nodo(v2, peso);

            if(grafo[v1] == null){
                grafo[v1] = nuevo;
            }
            else{
                Nodo actual = grafo[v1];
                while(actual.sgte !=  null){
                    actual = actual.sgte;
                }

                actual.sgte = nuevo;
            }
        }
        else{
            System.out.println("Ya existe una arista entre:" + v1 + " y " + v2);
        }
    }

    public void mostrarGrafo(){
        for(int i = 0; i < grafo.length; i++){
            Nodo actual = grafo[i];

            while(actual != null){
                System.out.printf("%d -> ", i);
                System.out.printf("%d(%d)\n", actual.vertice, actual.pesoArista);

                actual = actual.sgte;
            }
            System.out.println();
        }
    }
}
