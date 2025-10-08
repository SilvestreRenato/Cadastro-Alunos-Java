import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Scanner para leitura de dados do usuário.
        Scanner scanner = new Scanner(System.in);

        //ArrayList para armazenar os alunos.
        ArrayList<Aluno> listaDeAlunos = new ArrayList <>();

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
            scanner.nextLine();

            switch (option) {
                case 1:
//                  Cadastrar Aluno.
                    System.out.println("====Cadastro Do Aluno====");
                    System.out.println("Digite o nome do Aluno: ");
                    String nomeAluno = scanner.nextLine();

                    System.out.println("Digite o nro da matricula: ");
                    String matriculaAluno = scanner.nextLine();

                    System.out.println("Digite a primeira nota: ");
                    double nota1Aluno = scanner.nextDouble();

                    System.out.println("Digite a segunda nota: ");
                    double nota2Aluno = scanner.nextDouble();
                    scanner.nextLine();

                    Aluno aluno = new Aluno(nomeAluno, matriculaAluno, nota1Aluno, nota2Aluno);
                    listaDeAlunos.add(aluno);

                    break;
                case 2:
                    // Exibir Alunos
                    System.out.println("====Lista de Alunos====");
                    for (Aluno a : listaDeAlunos) {
                        a.exibirInformacoes();
                    }
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
        scanner.close();
    }
}