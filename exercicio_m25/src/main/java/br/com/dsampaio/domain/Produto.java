package br.com.dsampaio.domain;

import java.math.BigDecimal;

import anotacao.TipoChave;
import br.com.dsampaio.DAO.Persistente;

/**
 * @author danilo.sampaio
 *
 */
public class Produto implements Persistente {

	@TipoChave("getCodigo")
	private Long codigo;

	private String nome;

	private String descricao;

	private BigDecimal valor;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long valor2) {
		this.codigo = valor2;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

}