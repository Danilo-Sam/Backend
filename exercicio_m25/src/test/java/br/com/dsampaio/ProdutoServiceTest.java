/**
 * 
 */
package br.com.dsampaio;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.dsampaio.dao.ProdutoDaoMock;
import br.com.dsampaio.domain.Produto;
import br.com.dsampaio.exceptions.TipoChaveNaoEncontradaException;
import br.com.dsampaio.services.IProdutoService;
import br.com.dsampaio.services.ProdutoService;

/**
 * @author danilo.sampaio
 *
 */
public class ProdutoServiceTest {

	private IProdutoService produtoService;

	private Produto produto;

	public ProdutoServiceTest() {
		ProdutoDaoMock dao = new ProdutoDaoMock();
		produtoService = new ProdutoService(dao);
	}

	@Before
	public void init() {
		produto = new Produto();
		produto.setCodigo("A1");
		produto.setDescricao("Produto 1");
		produto.setNome("Produto 1");
		produto.setValor(BigDecimal.TEN);
	}

	@Test
	public void pesquisar() {
		Produto produtor = this.produtoService.consultar(produto.getCodigo());
		Assert.assertNotNull(produtor);
	}

	@Test
	public void salvar() throws TipoChaveNaoEncontradaException {
		Boolean retorno = produtoService.cadastrar(produto);
		Assert.assertTrue(retorno);
	}

	@Test
	public void excluir() {
		produtoService.excluir(produto.getCodigo());
	}

	@Test
	public void alterarCliente() throws TipoChaveNaoEncontradaException {
		produto.setNome("Danilo Sampaio");
		produtoService.alterar(produto);

		Assert.assertEquals("Danilo Sampaio", produto.getNome());
	}
}