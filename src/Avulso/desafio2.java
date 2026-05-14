package Avulso;

import java.util.Scanner;

public class desafio2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numMaximoNinja = 10;
        String[] ninjas = new String[numMaximoNinja];

        int ninjasCadastrados = 0;
        int opcao = 0;

        while (opcao != 3) {
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();
            input.nextLine();

            switch (opcao) {
                case 1:
                    if (ninjasCadastrados < numMaximoNinja) {
                        System.out.println("Digite o nome do seu ninja:");
                        String novoNinja = input.nextLine();
                        ninjas[ninjasCadastrados] = novoNinja;
                        ninjasCadastrados++;
                        System.out.println("...");
                        System.out.println("Ninja cadastrado com sucesso!");
                    } else {
                        System.out.println("Impossível cadastrar um novo ninja!");
                    }
                    break;
                case 2:
                    if (ninjasCadastrados == 0) {
                        System.out.println("Nenhum ninja encontrado!");
                    } else {
                        System.out.println("Lista de ninjas...");
                        for (int i = 0; i < ninjas.length; i++) {
                            System.out.println(ninjas[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Estamos encerrando... Obrigado por utilizar!");
                default:
                    System.out.println("Escolha uma opção válida!");


            }
        }
    }
}