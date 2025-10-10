package utils;

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
}
