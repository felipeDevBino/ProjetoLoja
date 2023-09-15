package ProjetoLoja.SessaoDeEletronicosEMoveis;

import java.util.Scanner;

public class AdicionaEletronicosEMoveis {
 
    Scanner scanner = new Scanner(System.in);

    private int quantidadeDeEletronicos;
    private String eletronicos[];
    private int quantidadeDeMoveis;
    private String moveis[];

    public void defineQuantidadeDeEletronico() {

        System.out.println("Digite a quantidade de eletrônicos:"); quantidadeDeEletronicos = Integer.parseInt(scanner.nextLine());
        eletronicos = new String[quantidadeDeEletronicos];

    }

    public void adicionaEletronicos() {

        for(int ae = 0; ae < quantidadeDeEletronicos; ae++) {

            System.out.println("Digite o " + (ae + 1) + " eletrônico:"); eletronicos[ae] = scanner.nextLine();

        }

    }

    public void imprimeEletronicosInseridos() {

        for(int ie = 0; ie < quantidadeDeEletronicos; ie++) {

            System.out.println((ie + 1) + " eletrônico inserido: " + eletronicos[ie]);

        }

    }

    public void defineQuantidadeDeMoveis() {

        System.out.println("Digite a quantidade de móveis:"); quantidadeDeMoveis = Integer.parseInt(scanner.nextLine());
        moveis = new String[quantidadeDeMoveis];

    }

    public void adicionaMoveis() {

        for(int am = 0; am < quantidadeDeMoveis; am++) {

            System.out.println("Digite o " + (am + 1) + " móvel:"); moveis[am] = scanner.nextLine();

        }

    }

    public void imprimeMoveisInseridos() {

        for(int im = 0; im < quantidadeDeMoveis; im++) {

            System.out.println((im + 1) + " móvel inserido: " + moveis[im]);

        }

    }

}
