package model; // Representa entidades

public class Professor extends Pessoa implements Comparable<Professor>{
    private String materia;
    private String id;

    public Professor(String nome, String materia, String id) {
        super(nome, "Professor");
        this.materia = materia;
        this.id = id;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println(
                "Professor: " + getNome() + "\n" +
                "ID: " + getId() + "\n" +
                "Matéria: " + getMateria()
        );
        System.out.println();
    }

    public String getMateria() {
        return this.materia;
    }

    public String getId() { return this.id; }

    @Override
    public int compareTo(Professor o) {
        return getNome().compareTo(o.getNome());
    }
}
