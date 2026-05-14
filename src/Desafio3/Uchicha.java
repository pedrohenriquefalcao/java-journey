package Desafio3;

public class Uchicha extends Ninja {

    String habilidadeEspecial;

    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Habilidade Especial: " + habilidadeEspecial);
    }
}