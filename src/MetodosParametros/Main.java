package MetodosParametros;

public class Main {
    public static void main(String[] args) {
        Ninjas naruto = new Ninjas();
        naruto.nome = "Naruto Uzumaki";
        naruto.aldeia = "Aldeia da Folha";
        naruto.idade = 21;
        naruto.trauma = true;

        int tempoFalta = naruto.anosHokage(22);

        naruto.exibirFichaTecnica(tempoFalta);

        Ninjas ninjaNovo = new Ninjas();
        ninjaNovo.nome = "Konohamaru";
        ninjaNovo.aldeia = "Aldeia da Folha";
        ninjaNovo.idade = 12;
        ninjaNovo.trauma = false;

        ninjaNovo.exibirFichaTecnica(ninjaNovo.anosHokage(22));
    }
}