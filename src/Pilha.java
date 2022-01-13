import exceptions.PilhaCheiaException;
import exceptions.PilhaVaziaException;

public class Pilha {

    private Object[] elementos;
    private int quantidade = 0;

    public Pilha(int maximo) {
        elementos = new Object[maximo];
    }

    public boolean estaVazia() {
        return quantidade == 0;
    }

    public int tamanho() {
        return quantidade;
    }

    public void empilha(String ele) {
        if (quantidade >= this.elementos.length)
            throw new PilhaCheiaException("Não é possível empilhar, pilha cheia.");
        this.elementos[quantidade] = ele;
        quantidade++;
    }

    public Object topo() {
        return elementos[quantidade - 1];
    }

    public Object desempilha() {
        if (estaVazia())
            throw new PilhaVaziaException("Não é possível desempilhar, pilha vazia");
        Object topo = topo();
        quantidade--;
        return topo;
    }
}
