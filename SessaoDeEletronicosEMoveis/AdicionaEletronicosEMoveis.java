package ProjetoLoja.SessaoDeEletronicosEMoveis;

import java.util.Scanner;

public class AdicionaEletronicosEMoveis {
 
    Scanner scanner = new Scanner(System.in);

    private int quantidadeDeEletronicos;
    private int quantidadeDeMoveis;

    public void defineQuantidadeDeEletronico() {

        System.out.println("Digite a quantidade de eletrônicos:"); quantidadeDeEletronicos = Integer.parseInt(scanner.nextLine());

    }

    public void defineQuantidadeDeMoveis() {

        System.out.println("Digite a quantidade de eletrônicos:"); quantidadeDeMoveis = Integer.parseInt(scanner.nextLine());

    }

}
