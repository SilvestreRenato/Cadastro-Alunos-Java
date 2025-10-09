package app;

public class Professor extends Pessoa{
    private String materia;

    public Professor(String nome, String materia) {
        super(nome, "Professor");
        this.materia = materia;
    }

    public String getMateria() {
        return this.materia;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println(
                "Professor: " + getNome() + "\n" +
                        "Matéria: " + getMateria()
        );
        System.out.println();
    }
}
