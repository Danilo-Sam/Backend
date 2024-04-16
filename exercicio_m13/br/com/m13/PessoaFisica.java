public class PessoaFisica extends Pessoa {

    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void imprimir() {
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        Sistem.out.println();
    }

}
