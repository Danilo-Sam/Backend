import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Grupo_Pessoas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Pessoa> listaPessoas = new ArrayList<>();

        // Solicita ao usuário os dados e cria objetos Pessoa
        while (true) {
            System.out.print("Digite um nome (ou 'sair' para encerrar): ");
            String nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.print("Digite o sexo (M para masculino, F para feminino): ");
            char sexo = scanner.nextLine().toUpperCase().charAt(0);

            listaPessoas.add(new Pessoa(nome, sexo));
        }

        // Separa os itens da lista com base no sexo
        List<Pessoa> masculinos = new ArrayList<>();
        List<Pessoa> femininos = new ArrayList<>();

        for (Pessoa pessoa : listaPessoas) {
            if (pessoa.getSexo() == 'M') {
                masculinos.add(pessoa);
            } else if (pessoa.getSexo() == 'F') {
                femininos.add(pessoa);
            }
        }

        // Imprime os resultados
        System.out.println("Lista de pessoas masculinas:");
        for (Pessoa pessoa : masculinos) {
            System.out.println(pessoa.getNome());
        }

        System.out.println("\nLista de pessoas femininas:");
        for (Pessoa pessoa : femininos) {
            System.out.println(pessoa.getNome());
        }

        scanner.close();
    }
}
class Pessoa {
    private String nome;
    private char sexo;

    public Pessoa(String nome, char sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public char getSexo() {
        return sexo;
    }
}


