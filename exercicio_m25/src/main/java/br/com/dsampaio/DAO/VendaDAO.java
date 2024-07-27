/**
 * 
 */
package br.com.dsampaio.DAO;

import br.com.dsampaio.DAO.generics.GenericDAO;
import br.com.dsampaio.domain.Venda;
import br.com.dsampaio.domain.Venda.Status;
import br.com.dsampaio.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author danilo.sampaio
 *
 */
public class VendaDAO extends GenericDAO<Venda, String> implements IVendaDAO {

    @Override
    public Class<Venda> getTipoClasse() {
        return Venda.class;
    }

    @Override
    public void atualiarDados(Venda entity, Venda entityCadastrado) {
        entityCadastrado.setCodigo(entity.getCodigo());
        entityCadastrado.setStatus(entity.getStatus());
    }

    @Override
    public void excluir(String valor) {
        throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
    }

    @Override
    public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException {
        venda.setStatus(Status.CONCLUIDA);
        super.alterar(venda);
    }

    @Override
    public Venda consultar(Long long1) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'consultar'");
    }

}