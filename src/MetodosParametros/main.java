package MetodosParametros;

public class main {
    public static void main(String[] args) {
        ninjas naruto = new ninjas();
        naruto.nome = "Naruto Uzumaki";
        naruto.aldeia = "Aldeia da Folha";
        naruto.idade = 21;
        naruto.trauma = true;

        int tempoFalta = naruto.anosHokage(22);

        naruto.exibirFichaTecnica(tempoFalta);

        ninjas ninjaNovo = new ninjas();
        ninjaNovo.nome = "Konohamaru";
        ninjaNovo.aldeia = "Aldeia da Folha";
        ninjaNovo.idade = 12;
        ninjaNovo.trauma = false;

        ninjaNovo.exibirFichaTecnica(ninjaNovo.anosHokage(22));
    }
}