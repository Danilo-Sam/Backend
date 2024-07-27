/**
 * 
 */
package br.com.dsampaio.services;

import br.com.dsampaio.DAO.IProdutoDAO;
import br.com.dsampaio.domain.Produto;
import br.com.dsampaio.services.generic.GenericService;

/**
 * @author danilo.sampaio
 *
 */
public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

    public ProdutoService(IProdutoDAO dao) {
        super(dao);
    }

    @Override
    public void excluir(Long long1) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'excluir'");
    }

    @Override
    public Produto consultar(Long long1) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'consultar'");
    }

}