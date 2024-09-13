/**
 * 
 */
package br.com.dsampaio;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import br.com.dsampaio.dao.IProdutoDao;
import br.com.dsampaio.dao.ProdutoDao;
import br.com.dsampaio.domain.Produto;

/**
 * @author dsampaio
 *
 */
public class ProdutoTest {
    private IProdutoDao produtoDao;

    public ProdutoTest() {
        produtoDao = new ProdutoDao();
    }

    @Test
    public void cadastrar() {
        Produto produto = new Produto();
        produto.setCodigo("Notebook");
        produto.setNome("Asus");
        produto.setValor(2600.0);
        produto = produtoDao.cadastrar(produto);

        assertNotNull(produto);
        assertNotNull(produto.getId());
    }
}