public class PrgMain {

    public static void main(String[] args) {
		
		PessoaFisica pf = new PessoaFisica();
		
		pf.setNome("Danilo");
		pf.setCpf("999.999.999-99");
		
		PessoaJuridica pj = new PessoaJuridica();
		
		pj.setNome("Sampaio System");
		pj.setCnpj("99.999.999/9999-99");
		
		imprimir(pf);
		imprimir(pj);
		
	}
	
	public static void imprimir(Pessoa pessoa) {
		pessoa.imprimir();
	}
}
