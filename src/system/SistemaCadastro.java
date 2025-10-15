package system; // Contém a lógica principal do menu e controle

import model.Aluno;
import model.Professor;
import utils.Utils;
import java.util.*;

public class SistemaCadastro {
    Scanner scanner = new Scanner(System.in);

    //ArrayList para armazenar os alunos.
    //ArrayList<Aluno> listaDeAlunos = new ArrayList <>();
    Map<String, Aluno> listaDeAlunos = new HashMap<>();


    //ArrayList para armazenar os professores
    //ArrayList<Professor> listaDeProfessores = new ArrayList<>();
    Map<String, Professor> listaDeProfessores = new HashMap<>();

    int tamanho;

    public void iniciar() {
        // Variável de controle do loop.
        int control = 0;

        while (control == 0) {

            Utils.exibirMenu();

            // Variável de escolha.
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1 -> cadastrar();
                case 2 -> listar();
                case 3 -> {
                    encerrar();
                    control++;
                }
                default -> System.out.println("Opção invalida.");
            }

        }

        System.out.println("Sistema encerrado.");
        scanner.close();
    }

    public void cadastrar() {
        // Sistema de Cadastro
        Utils.limparTela();
        System.out.println("====Cadastro Escolar====");
        System.out.println();
        System.out.println("Escreva o tipo de cadastro:");
        System.out.println("1. Professor.");
        System.out.println("2. Aluno.");
        String tipoCadastro = scanner.nextLine();

        if (tipoCadastro.equals("1")) {
            Utils.limparTela();
            System.out.println("Digite o nome do Professor: ");
            String nomeProfessor = scanner.nextLine();

            System.out.println("Digite matéria: ");
            String materiaProfessor = scanner.nextLine();

            // Gera o ID aleatoriamente
            String key = Utils.randomString(5);

            Professor professor = new Professor(nomeProfessor, materiaProfessor, key);
            listaDeProfessores.put(key, professor);
            System.out.println("Professo " + nomeProfessor + " cadastrado com sucesso!");

        } else if (tipoCadastro.equals("2")) {

            Utils.limparTela();
            System.out.println("Digite o nome do Aluno: ");
            String nomeAluno = scanner.nextLine();

            // Gera a matricula do aluno aleatoriamente
            String matriculaAluno = Utils.randomString(5);

            System.out.println("Digite a primeira nota: ");
            double nota1Aluno = scanner.nextDouble();

            System.out.println("Digite a segunda nota: ");
            double nota2Aluno = scanner.nextDouble();
            scanner.nextLine();

            Aluno aluno = new Aluno(nomeAluno, matriculaAluno, nota1Aluno, nota2Aluno);
            listaDeAlunos.put(matriculaAluno, aluno);
            System.out.println("Aluno " + nomeAluno + " cadastrado com sucesso!");

        }
    }

    public void listar() {
        Utils.limparTela();
        System.out.println("====Lista Escolar====");
        System.out.println();
        System.out.println("Qual lista deseja consultar:");
        System.out.println("1. Professor.");
        System.out.println("2. Aluno.");
        System.out.println("3. Aluno aprovados.");
        System.out.println("4. Aluno reprovados.");
        String tipoLista = scanner.nextLine();

        switch (tipoLista) {
            case "1":
                Utils.limparTela();
                System.out.println("====Lista de Professores====");
                // Percorrer todos os professores da coleção e apresentar informações
                listaDeProfessores.forEach((k, p) -> p.exibirInformacoes());
                break;
            case "2":
                Utils.limparTela();
                System.out.println("====Lista de Alunos====");
                listaDeAlunos.forEach((k, a) -> a.exibirInformacoes());
                break;
            case "3":
                Utils.listarComFiltro("Alunos aprovados", listaDeAlunos.values(), a -> a.calcularMedia() >= 7, Aluno::exibirInformacoes);
                break;
            case "4":
                Utils.listarComFiltro("Alunos reprovados", listaDeAlunos.values(), a -> a.calcularMedia() < 7, Aluno::exibirInformacoes);
                break;
            default:
                Utils.limparTela();
                System.out.println("Entrada invalida.");
        }

    }

    public void encerrar() {
        Utils.limparTela();
        System.out.println("Encerrando o programa...");
    }
}