package heranca;

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

        ninja Sakura = new ninja();
        Sakura.nome = "Sakura Haruno";
        Sakura.aldeia = "Konoha";
        Sakura.idade = 17;
        Sakura.apresentacao();


        ninja Hinata = new ninja();
        Hinata.nome = "Hinata Hyuuga";
        Hinata.aldeia = "Konoha";
        Hinata.idade = 17;
        Hinata.apresentacao();



    }
}
