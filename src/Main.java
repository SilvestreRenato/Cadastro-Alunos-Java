import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Scanner para leitura de dados do usuário.
        Scanner scanner = new Scanner(System.in);

        System.out.println("***Programa Cadastro de Alunos***");
        System.out.println();

        // Variável de controle do loop.
        int control = 0;

        while (control == 0) {

            // Exibir menu interativo.
            System.out.println("Escolha uma Opção:");
            System.out.println("1. Cadastrar Aluno.");
            System.out.println("2. Exibir Alunos.");
            System.out.println("3. Sair do programa.");

            // Variável de escolha.
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Opção 1 selecionada.");
                    break;
                case 2:
                    System.out.println("Opção 2 selecionada.");
                    break;
                case 3:
                    System.out.println("Encerrando o programa...");
                    control++;
                    break;
                default:
                    System.out.println("Opção invalida.");
            }

        }


        System.out.println("Sistema encerrado.");
    }
}