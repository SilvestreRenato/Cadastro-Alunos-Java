import java.util.*;

public class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Joao Silva", "A123", 8.5, 7.0);
        Aluno a2 = new Aluno("Maria Souza", "B723", 9.0, 9.5);
        a1.exibirInformacoes();
        System.out.println();
        a2.exibirInformacoes();
    }
}