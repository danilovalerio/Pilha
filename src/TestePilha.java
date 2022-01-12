import org.junit.Assert;
import org.junit.Test;

public class TestePilha {

    @Test
    public void pilhaVazio(){
        Pilha p = new Pilha();
        Assert.assertTrue(p.estaVazia());
        Assert.assertEquals(0, p.tamanho());
    }
}
