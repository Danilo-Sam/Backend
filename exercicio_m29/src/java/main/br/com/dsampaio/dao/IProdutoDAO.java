package br.com.dsampaio.dao;

import java.util.List;

import br.com.dsampaio.domain.Produto;

public interface IProdutoDAO {
	
	public Integer cadastrar(Produto produto) throws Exception;

	public Integer atualizar(Produto produto) throws Exception;

	public Produto consultar(String codigo) throws Exception;

	public List<Produto> consultarAll() throws Exception;

	public Integer excluir(Produto produtoDB) throws Exception;
}
