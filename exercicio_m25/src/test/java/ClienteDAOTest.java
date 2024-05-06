package exVendas;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import exVendas.DAO.ClienteDAOMock;
import exVendas.DAO.IClienteDAO;
import exVendas.domain.Cliente;

public class ClienteDAOTest {
	
	private IClienteDAO clienteDAO;
	
	private Cliente cliente;
	
	public ClienteDAOTest() {
		clienteDAO = new ClienteDAOMock();
	}
	
	@Before
	public void init() {
		cliente = new Cliente();
		cliente.setCPF(11111111111L);
		cliente.setNome("Danilo");
		cliente.setTel(99999999L);
		cliente.setEnd("teste");
		cliente.setNumero(28);
		cliente.setCidade("São Paulo");
		cliente.setUF("SP");
		
		clienteDAO.cadastrar(cliente);
	}
	
	@Test
	public void pesquisarCliente() {
		Cliente clienteConsultado = clienteDAO.consultar(cliente.getCPF());
		Assert.assertNotNull(clienteConsultado);
	}
	
	@Test
	public void salvarCliente() {
		Boolean retorno = clienteDAO.cadastrar(cliente);
		Assert.assertTrue(retorno);
	}
	
	@Test
	public void excluirCliente() {
		clienteDAO.excluir(cliente.getCPF());
	}
	
	@Test
	public void alterarCliente() {
		cliente.setNome("Danilo Sampaio");
		clienteDAO.alterar(cliente);
		
		Assert.assertEquals("Danilo Sampaio", cliente.getNome());
	}

}