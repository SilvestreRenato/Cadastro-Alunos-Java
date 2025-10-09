package app;

public class Pessoa {
    private String nome;
    private String ocupacao;

    public Pessoa (String nome, String ocupacao) {
        this.nome = nome;
        this.ocupacao = ocupacao;
    }

    public void exibirInformacoes() {
        System.out.println(
                "Pessoa: " + getNome() + "\n" +
                "Ocupação: " + getOcupacao()
        );

        System.out.println();
    }

    public String getNome() {
        return this.nome;
    }

    public String getOcupacao() {
        return this.ocupacao;
    }
}
