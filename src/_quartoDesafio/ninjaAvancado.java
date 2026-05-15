package _quartoDesafio;

public class ninjaAvancado extends ninjaBasico implements ninja {

    String especialidade;

    public ninjaAvancado(String nome, int idade, tipoHabilidade habilidade, String especialidade) {
        super(nome, idade, habilidade);
        this.especialidade = especialidade;
    }

    public void mostrarInformacoes() {
        System.out.println(nome + ", " + idade);
    }

    public void executarHabilidade() {
        System.out.println("Habilidade: "+habilidade +" Especialidade: "+ especialidade);
    }


}
