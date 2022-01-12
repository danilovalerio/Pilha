import org.junit.Assert;
import org.junit.Test;

public class TestePilha {

    @Test
    public void pilhaVazio(){
        Pilha p = new Pilha();
        Assert.assertTrue(p.estaVazia());
        Assert.assertEquals(0, p.tamanho());
    }

    @Test
    public void empilhaUmElemento(){
        Pilha p = new Pilha();
        p.empilha("primeiro");
        Assert.assertFalse(p.estaVazia());
        Assert.assertEquals(1, p.tamanho());
        Assert.assertEquals("primeiro", p.topo());
    }

    @Test
    public void empilhaEDesempilha(){
        Pilha p = new Pilha();
        p.empilha("primeiro");
        p.empilha("segundo");
        Assert.assertFalse(p.estaVazia());
        Assert.assertEquals(2, p.tamanho());
        Assert.assertEquals("segundo", p.topo());
        Object desempilhado = p.desempilha();
        Assert.assertEquals(1, p.tamanho());
        Assert.assertEquals("primeiro", p.topo());
        Assert.assertEquals("segundo", desempilhado);
    }
}
