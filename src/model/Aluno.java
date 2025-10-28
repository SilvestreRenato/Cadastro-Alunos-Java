package model; // Representa entidades

public class Aluno extends Pessoa implements Comparable<Aluno>{
        private String matricula;
        private double nota1;
        private double nota2;
        private double media;

        public Aluno (String nome, String matricula, double nota1, double nota2) {
            super(nome, "Aluno");
            this.matricula = matricula;
            this.nota1 = nota1;
            this.nota2 = nota2;
            this.media = calcularMedia();
        }

        public double calcularMedia() {
            return (getNota1() + getNota2()) / 2;
        }

        @Override
        public void exibirInformacoes() {
            System.out.println(
                    "Aluno: " + getNome() + ".\n" +
                    "Matricula: " + getMatricula() + ".\n" +
                    "Nota 1: " + getNota1() + ".\n" +
                    "Nota 2: " + getNota2() + ".\n" +
                    "Média do aluno: " + getMedia()
            );
            System.out.println();
        }

    private double getMedia() {
            return this.media;
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

    @Override
    public int compareTo(Aluno o) {
        return getNome().compareTo(o.getNome());
    }
}