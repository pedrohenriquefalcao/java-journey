package _quartoDesafio;

public class main {
    public static void main(String[] args) {

        ninjaBasico RockLee = new ninjaBasico("Rock Lee", 8, tipoHabilidade.TAIJUTSU);

        RockLee.mostrarInformacoes();
        RockLee.executarHabilidade();

        ninjaBasico Neji = new ninjaBasico("Neji Hyuuga", 8, tipoHabilidade.NINJUTSU);

        Neji.mostrarInformacoes();
        Neji.executarHabilidade();

        ninjaBasico Narutinho = new ninjaBasico("Naruto Uzumaki",8,tipoHabilidade.NINJUTSU);

        Narutinho.mostrarInformacoes();
        Narutinho.executarHabilidade();

        ninjaAvancado Naruto = new ninjaAvancado("Naruto Uzumaki",17,tipoHabilidade.NINJUTSU,"Rasengan");

        Naruto.mostrarInformacoes();
        Naruto.executarHabilidade();

    }
}
