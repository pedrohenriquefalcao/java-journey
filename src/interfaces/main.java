package interfaces;

public class main {
    public static void main(String[] args) {

        uzumaki Naruto = new uzumaki();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.aldeia = "Konoha";
        Naruto.idade = 17;
        Naruto.apresentacao(); Naruto.modoSabioAtivado();


        uchicha Saske = new uchicha();
        Saske.nome = "Sasuke Uchicha";
        Saske.aldeia = "Konoha";
        Saske.idade = 17;
        Saske.apresentacao(); Saske.ativarSharingan();

        haruno Sakura = new haruno();
        Sakura.nome = "Sakura Haruno";
        Sakura.aldeia = "Konoha";
        Sakura.idade = 17;
        Sakura.apresentacao(); Sakura.ativarCura();


        hyuga Hinata = new hyuga();
        Hinata.nome = "Hinata Hyuuga";
        Hinata.aldeia = "Konoha";
        Hinata.idade = 17;
        Hinata.apresentacao(); Hinata.ativarByakugan();

        boruto Boruto = new boruto();
        Boruto.nome = "Boruto Hyuga Uzumaki";
        Boruto.idade = 8;
        Boruto.aldeia = "Konoha";
        Boruto.apresentacao(); Boruto.modoSabioAtivado(); Boruto.ativarJougan(); Boruto.ativarKarma();


    }
}
