package _quartoDesafio;

public class ninjaBasico implements ninja {

    String nome;
    int idade;
    String habilidade;

    public ninjaBasico(String nome, int idade, String habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
    }

    public void mostrarInformacoes() {
        System.out.println(nome + ", " + idade);
    }

    public void executarHabilidade() {
        System.out.println("Habilidade: "+habilidade);

    }
}
