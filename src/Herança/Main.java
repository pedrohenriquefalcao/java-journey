package Herança;

public class Main {
    public static void main(String[] args) {

        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.aldeia = "Konoha";
        Naruto.idade = 17;
        Naruto.Apresentação(); Naruto.ModoSábioAtivado();


        Uchicha Saske = new Uchicha();
        Saske.nome = "Sasuke Uchicha";
        Saske.aldeia = "Konoha";
        Saske.idade = 17;
        Saske.Apresentação(); Saske.AtivarSharingan();

        Ninja Sakura = new Ninja();
        Sakura.nome = "Sakura Haruno";
        Sakura.aldeia = "Konoha";
        Sakura.idade = 17;
        Sakura.Apresentação();


        Ninja Hinata = new Ninja();
        Hinata.nome = "Hinata Hyuuga";
        Hinata.aldeia = "Konoha";
        Hinata.idade = 17;
        Hinata.Apresentação();



    }
}
