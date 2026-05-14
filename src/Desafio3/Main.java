package Desafio3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int opc = 0;
        Scanner scanner = new Scanner(System.in);

        Uchicha Sasuke = new Uchicha();
        Sasuke.nome = "Sasuke U";
        Sasuke.idade = 17;
        Sasuke.missao = "Missão 1";
        Sasuke.NivelDificuldade = "Difícil";
        Sasuke.statusMissao = "Concluída";
        Sasuke.habilidadeEspecial = "Sharingan";

        Sasuke.mostrarInformacoes();

        Ninja Naruto = new Ninja();
        Naruto.nome = "Naruto U";
        Naruto.idade = 17;
        Naruto.missao = "Missão 2";
        Naruto.NivelDificuldade = "Média";
        Naruto.statusMissao = "Incompleta";

        Naruto.mostrarInformacoes();

        while (opc != 4) {
            System.out.println("Menu...");
            System.out.println("1 para visualizar todos os ninjas...");
            System.out.println("2 para cadastrar um novo ninja...");
            System.out.println("3 para atualizar as habilidades especiais...");
            System.out.println("4 para sair e encerrar o programa.");
            System.out.println(" ");
            System.out.println("Insira um número:");

            opc = scanner.nextInt();
            scanner.nextLine();

            if (opc == 1) {
                Naruto.mostrarInformacoes();
                Sasuke.mostrarInformacoes();
            } else if (opc == 2) {
                System.out.println("Cadastrando um novo ninja comum...");
                Ninja novoNinja = new Ninja();

                System.out.println("Digite o nome dele:");
                novoNinja.nome = scanner.nextLine();

                System.out.println("Digite a idade dele:");
                novoNinja.idade = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Digite a missão dele:");
                novoNinja.missao = scanner.nextLine();

                System.out.println("Digite o status da missão dele:");
                novoNinja.statusMissao = scanner.nextLine();

                System.out.println("Digite o nivel de dificuldade da missão:");
                novoNinja.NivelDificuldade = scanner.nextLine();
            } else if (opc == 3) {
                System.out.println("Deseja atualizar a habilidade de qual Ninja? (1 para Sasuke)");
                int escolha = scanner.nextInt();
                scanner.nextLine();

                if (escolha == 1) {
                    System.out.println("Habilidade atual: " + Sasuke.habilidadeEspecial);
                    System.out.print("Digite a nova habilidade: ");
                    Sasuke.habilidadeEspecial = scanner.nextLine();
                    System.out.println("Habilidade atualizada com sucesso!");
                } else
                    System.out.println("Opção inválida... Recomeçando...");


            }
            if (opc == 4) {
                System.out.println("Encerrando...");
            } else
                System.out.println("Opção inválida. Por favor, tente novamente!");

        }

    }
}
