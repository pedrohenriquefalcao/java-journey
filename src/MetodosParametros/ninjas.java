package MetodosParametros;

public class ninjas {
    String nome;
    String aldeia;
    int idade;
    boolean trauma;

    public String boasVindas() {
        return "Olá! Eu sou um ninja de elite.";
    }

    public int anosHokage(int idadeMinima) {
        return idadeMinima - idade;
    }

    public void sharinganAtivado() {
        System.out.println("SHARINGAN ATIVADO!");
    }

    public void exibirFichaTecnica(int tempoParaHokage) {
        System.out.println("=== DADOS DO NINJA ===");
        System.out.println(boasVindas());
        System.out.println("Nome: " + nome);
        System.out.println("Aldeia: " + aldeia);
        System.out.println("Idade: " + idade + " anos");

        if (tempoParaHokage <= 0) {
            System.out.println("Status: Já posso me tornar um Hokage!");
        } else {
            System.out.println("Status: Faltam " + tempoParaHokage + " anos para me tornar Hokage.");
        }

        if (trauma) {
            System.out.print("Habilidade Especial: ");
            sharinganAtivado();
        } else {
            System.out.println("Habilidade Especial: Sharingan bloqueado (falta trauma).");
        }
        System.out.println("-----------------------\n");
    }
}