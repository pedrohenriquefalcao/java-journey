package Avulso;

import java.util.Scanner;

public class Carro_MULTA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a velocidade do carro: ");
        int velocidadeCarro = scanner.nextInt();
        System.out.print("Digite a velocidade máxima da rua: ");
        int velocidadeMaxima = scanner.nextInt();

        int excesso = velocidadeCarro - velocidadeMaxima;

        if (excesso <= 10 && excesso > 0) {
            System.out.println("Multa: 50 reais");
        } else if (excesso <= 30 && excesso > 10) {
            System.out.println("Multa: 100 reais");
        } else if (excesso > 30) {
            System.out.println("Multa: 300 reais");
        } else if (excesso <= 0) {
            System.out.println("Está livre de multa!");
        }

        scanner.close();
    }
}