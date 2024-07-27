/**
 * 
 */
package br.com.dsampaio.services;

import br.com.dsampaio.DAO.generics.IGenericDAO;
import br.com.dsampaio.dao.ClienteDaoMock;
import br.com.dsampaio.domain.Cliente;
import br.com.dsampaio.services.generic.GenericService;

/**
 * @author danilo.sampaio
 *
 */
public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {

	// private IClienteDAO clienteDAO;

	public ClienteService(ClienteDaoMock dao) {
		super((IGenericDAO<Cliente, Long>) dao);
		// this.clienteDAO = clienteDAO;
	}

	// @Override
	// public Boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException
	// {
	// return clienteDAO.cadastrar(cliente);
	// }

	@Override
	public Cliente buscarPorCPF(Long cpf) {
		return this.dao.consultar(cpf);
	}

	// @Override
	// public void excluir(Long cpf) {
	// clienteDAO.excluir(cpf);
	// }
	//
	// @Override
	// public void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException{
	// clienteDAO.alterar(cliente);
	// }

}