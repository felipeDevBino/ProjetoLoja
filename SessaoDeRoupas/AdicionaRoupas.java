package ProjetoLoja.SessaoDeRoupas;

import java.util.Scanner;

public class AdicionaRoupas {
    
    Scanner scanner = new Scanner(System.in);

    private int quantidadeDeRoupas;

    public void defineQuantidadeDeRoupas() {

        System.out.println("Digite a quantidade de roupas:"); quantidadeDeRoupas = Integer.parseInt(scanner.nextLine());

    }
    
}
