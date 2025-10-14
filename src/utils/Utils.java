package utils;

import java.util.Random;

public class Utils {
    public static void exibirMenu() {
        // Exibir menu interativo.
        System.out.println("***Programa Cadastro Escolar***");
        System.out.println();
        System.out.println("Escolha uma Opção:");
        System.out.println("1. Realizar Cadastro.");
        System.out.println("2. Exibir cadastros");
        System.out.println("3. Sair do programa.");
        System.out.println();
    }

    public static void limparTela() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

    public static String randomString(int tamanho) {
        // Define o conjunto de caracteres a serem utilizados
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder sb = new StringBuilder(tamanho);

        for (int i = 0; i < tamanho; i++) {
            // Seleciona um índice aleatório no conjunto de caracteres
            int indiceAleatorio = random.nextInt(caracteres.length());
            // Adiciona o caractere ao StringBuilder
            sb.append(caracteres.charAt(indiceAleatorio));
        }

        return sb.toString();
    }
}
