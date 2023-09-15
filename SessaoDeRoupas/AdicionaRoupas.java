package ProjetoLoja.SessaoDeRoupas;

import java.util.Scanner;

public class AdicionaRoupas {
    
    Scanner scanner = new Scanner(System.in);

    private int quantidadeDeRoupas;
    private String roupas[];

    public void defineQuantidadeDeRoupas() {

        System.out.println("Digite a quantidade de roupas:"); quantidadeDeRoupas = Integer.parseInt(scanner.nextLine());
        roupas = new String[quantidadeDeRoupas];

    }

    public void adicionaRoupas() {

        for(int ar = 0; ar < quantidadeDeRoupas; ar++) {

            System.out.println("Digite a " + (ar + 1) + " roupa:"); roupas[ar] = scanner.nextLine();

        }

    }

    public void imprimeRoupasInseridas() {

        for(int ir = 0; ir < quantidadeDeRoupas; ir++) {

            System.out.println((ir + 1) + " roupa inserida: " + roupas[ir]); 

        }

    }

}
