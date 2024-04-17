package br.com.dsampaio;

import java.util.Scanner;

public class ConverterWrapper {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Digite um número inteiro: ");
    int numero = s.nextInt();

    Integer numeroWrapper = converterParaWrapper(numero);

    System.out.println("Retornando o número em Wrapper: " + numeroWrapper);
    }

    public static Integer converterParaWrapper(int numero) {
        return Integer.valueOf(numero);
    }
}