package ProjetoLoja.SessaoDeComidasEBebidas;

import java.util.Scanner;

public class AdicionaComidasEBebidas {

    Scanner scanner = new Scanner(System.in);

    private int quantidadeDeAlimentos;
    private String alimentos[];
    private int quantidadeDeBebidas;
    private String bebidas[];

    public void defineQuantidadeDeAlimentos() {

        System.out.println("Digite a quantidade de alimentos:"); quantidadeDeAlimentos = Integer.parseInt(scanner.nextLine());
        alimentos = new String[quantidadeDeAlimentos];

    }

    public void adicionaAlimentos() {

        for(int ada = 0; ada < quantidadeDeAlimentos; ada++) {

            System.out.println("Digite o " + (ada + 1) + " alimento:"); alimentos[ada] = scanner.nextLine();

        }

    }

    public void imprimeAlimentosInseridos() {

        for(int ia = 0; ia < quantidadeDeAlimentos; ia++) {

            System.out.println((ia + 1) + " alimento inserido: " + alimentos[ia]);

        }

    }

    public void defineQuantidadeDeBebidas() {

        System.out.println("Digite a quantidade de bebidas:"); quantidadeDeBebidas = Integer.parseInt(scanner.nextLine());
        bebidas = new String[quantidadeDeBebidas];

    }

    public void adicionaBebidas() {

        for(int ab = 0; ab < quantidadeDeBebidas; ab++) {

            System.out.println("Digite a " + (ab + 1) + " bebida:");

        }

    }

    public void imprimeBebidasInseridas() {

        for(int ib = 0; ib < quantidadeDeBebidas; ib++) {

            System.out.println((ib + 1) + " bebida inserida: " + bebidas[ib]);

        }

    }

}