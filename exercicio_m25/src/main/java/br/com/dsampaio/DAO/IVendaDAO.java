/**
 * 
 */
package br.com.dsampaio.DAO;

import br.com.dsampaio.DAO.generics.IGenericDAO;
import br.com.dsampaio.domain.Venda;
import br.com.dsampaio.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author danilo.sampaio
 *
 */
public interface IVendaDAO extends IGenericDAO<Venda, String> {

    public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException;
}