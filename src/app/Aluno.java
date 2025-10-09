package app;

public class Aluno {
        private String nome;
        private String matricula;
        private double nota1;
        private double nota2;

        public Aluno (String nome, String matricula, double nota1, double nota2) {
            this.nome = nome;
            this.matricula = matricula;
            this.nota1 = nota1;
            this.nota2 = nota2;
        }

        public double calcularMedia() {
            return (getNota1() + getNota2()) / 2;
        }

        public void exibirInformacoes() {
            System.out.println(
                    "Aluno: " + getNome() + ".\n" +
                    "Matricula: " + getMatricula() + ".\n" +
                    "Nota 1: " + getNota1() + ".\n" +
                    "Nota 2: " + getNota2() + ".\n" +
                    "Média do aluno: " + calcularMedia()
            );
            System.out.println();
        }

        public String getNome() {
            return this.nome;
        }

        public String getMatricula() {
            return this.matricula;
        }

        public double getNota1() {
            return this.nota1;
        }

        public double getNota2() {
            return this.nota2;
        }
}