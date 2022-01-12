public class Pilha {

    private Object elemento;
    private int quantidade;

    public boolean estaVazia() {
        return (elemento == null);
    }

    public int tamanho() {
        return quantidade;
    }

    public void empilha(String ele) {
        this.elemento = ele;
        quantidade++;
    }

    public Object topo() {
        return elemento;
    }

    public Object desempilha() {
        return null;
    }
}
