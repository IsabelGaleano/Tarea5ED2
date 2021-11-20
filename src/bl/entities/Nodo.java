package bl.entities;

public class Nodo {
    int vertice;
    int pesoArista;
    Nodo sgte;

    public Nodo(int v, int a){
        this.vertice = v;
        this.pesoArista = a;
        this.sgte = null;
    }
}
