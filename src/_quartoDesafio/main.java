package _quartoDesafio;

public class main {
    public static void main(String[] args) {

        ninjaBasico Narutinho = new ninjaBasico("Naruto Uzumaki",8,tipoHabilidade.NINJUTSU);

        Narutinho.mostrarInformacoes();
        Narutinho.executarHabilidade();

        ninjaAvancado Naruto = new ninjaAvancado("Naruto Uzumaki",17,tipoHabilidade.NINJUTSU,"Rasengan");

        Naruto.mostrarInformacoes();
        Naruto.executarHabilidade();

    }
}
