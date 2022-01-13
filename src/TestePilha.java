import exceptions.PilhaCheiaException;
import exceptions.PilhaVaziaException;
import org.junit.Assert;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.Test;

public class TestePilha {

    private Pilha p;

    //antes de qualquer teste cria a instancia
    @Before
    public void  inicializaPilha(){
        p = new Pilha(10);
    }

    @Test
    public void pilhaVazio(){
        Assert.assertTrue(p.estaVazia());
        Assert.assertEquals(0, p.tamanho());
    }

    @Test
    public void empilhaUmElemento(){
        p.empilha("primeiro");
        Assert.assertFalse(p.estaVazia());
        Assert.assertEquals(1, p.tamanho());
        Assert.assertEquals("primeiro", p.topo());
    }

    @Test
    public void empilhaEDesempilha(){
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

    @Test(expected = PilhaVaziaException.class)
    public void removeDaPilhaVazia(){
        p.desempilha();
    }

    @Test
    public void adicionaNaPilhaCheia(){
        for (int i=0; i < 10; i++){
            p.empilha("elemento"+i);
        }
        try {
            p.empilha("elemento");
            fail();
        } catch (PilhaCheiaException e){}
    }

}
