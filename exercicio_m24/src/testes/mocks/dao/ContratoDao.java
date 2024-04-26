package testes.mocks.dao;

public class ContratoDao implements IContratoDao {
    
    @Override
    public void salvar() {
        System.out.println("Salvando...");
    }

    @Override
    public void buscar() {
        System.out.println("Buscando...");
    }

    @Override
    public void atualizar() {
        System.out.println("Atualizando...");
    }

    @Override
    public void excluir() {
        System.out.println("Excluindo...");
    }
}
