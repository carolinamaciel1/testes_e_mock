import Classes.ItemNotaFiscal;
import Classes.NotaFiscal;
import Classes.Produto;
import junit.framework.TestCase;
import org.junit.Test;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;
public class Test_CalculoNotaFiscal extends TestCase {

    @Test
    //testa o valor final da nota fiscal
    public void test_ValorNotaFiscal() {
        Produto p1 = new Produto("Farinha", "KG", 2.00f);
        Produto p2 = new Produto("Arroz", "KG", 3.50f);

        ItemNotaFiscal inf1 = new ItemNotaFiscal(1, 10, p1);
        ItemNotaFiscal inf2 = new ItemNotaFiscal(2, 10, p2);

        NotaFiscal nf1 = new NotaFiscal();

        nf1.inserirItemNotaFiscal(inf1);
        nf1.inserirItemNotaFiscal(inf2);

        float valor_esperado = 55.00f;
        float valor_retornado = nf1.calcularValorNota();
        assertEquals(valor_esperado, valor_retornado);
    }

    @Test
    //faz um mock
    public void test_MockNotaFiscal() {
        Produto p1 = new Produto("Farinha", "KG", 2.00f);
        ItemNotaFiscal inf1 = new ItemNotaFiscal(1, 10, p1);
        //criando o mock do objeto que eu quero simular, no caso: notafiscalMock.
        NotaFiscal notafiscalMock = mock(NotaFiscal.class);
        notafiscalMock.inserirItemNotaFiscal(inf1);
        when(notafiscalMock.calcularValorNota()).thenReturn(20.00f);
        assertEquals(20.00f,notafiscalMock.calcularValorNota());

    }

}