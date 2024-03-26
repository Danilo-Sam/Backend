import java.util.Scanner;

public class CalculaMedia_m10 {
    public static void main(String args[]){

        Scanner nota = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        float notaUm = nota.nextFloat();

        System.out.println("Digite a segunda nota: ");
        float notaDois = nota.nextFloat();

        System.out.println("Digite a terceira nota: ");
        float notaTres = nota.nextFloat();

        System.out.println("Digite a quarta nota: ");
        float notaQuatro = nota.nextFloat();

        float somaNotas = notaUm + notaDois + notaTres + notaQuatro;

        float media = somaNotas / 4;

        if(media >= 7.0){
            System.out.println("O aluno foi Aprovado!");
        } else if (media >= 5.0 && media < 7.0) {
            System.out.println("O aluno está em Recuperação!");
        }else {
            System.out.println("O aluno foi Reprovado!");
        }

        System.out.println("A média do aluno foi = " + media);
    }
}
