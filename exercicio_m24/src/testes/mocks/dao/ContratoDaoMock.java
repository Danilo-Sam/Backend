package testes.mocks.dao;

public class ContratoDaoMock implements IContratoDao {
    

    @Override
    public void salvar() {
        System.out.println("Salvando Contrato");
    }

    @Override
    public void buscar() {
        System.out.println("Buscando Contrato");
    }

    @Override
    public void atualizar() {
        System.out.println("Atualizando Contrato");
    }

    @Override
    public void excluir() {
        System.out.println("Excluindo Contrato");
    }
}
