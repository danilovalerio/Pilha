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
}
