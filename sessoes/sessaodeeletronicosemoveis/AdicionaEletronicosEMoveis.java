package ProjetoLoja.sessoes.sessaodeeletronicosemoveis;

import java.util.Scanner;

public class AdicionaEletronicosEMoveis {
 
    Scanner scanner = new Scanner(System.in);

    private int quantidadeDeEletronicos;
    private String eletronicos[];
    private int valoresDosEletronicos[];
    private int quantidadeDeMoveis;
    private String moveis[];
    private int valoresDosMoveis[];

    public void defineQuantidadeDeEletronico() {

        try {

            System.out.println("Digite a quantidade de eletrônicos:"); quantidadeDeEletronicos = Integer.parseInt(scanner.nextLine());
            eletronicos = new String[quantidadeDeEletronicos];

        }catch(NumberFormatException e) {
        
            System.out.println("Tipo de caracter inválido, procure utilizar valores inteiros!");
            System.exit(0);

        }
        //Pulando uma linha
        System.out.println();
    }

    public void adicionaEletronicos() {

        for(int ae = 0; ae < quantidadeDeEletronicos; ae++) {

            System.out.println("Digite o " + (ae + 1) + " eletrônico:"); eletronicos[ae] = scanner.nextLine();

        }
        //Pulando uma linha
        System.out.println();
    }

    public void adicionaValoresDosEletronicos() {

        valoresDosEletronicos = new int[quantidadeDeEletronicos];

        for(int ve = 0; ve < quantidadeDeEletronicos; ve++) {

            try {

                System.out.println("Digite o valor do " + (ve + 1) + " eletrônico"); valoresDosEletronicos[ve] = Integer.parseInt(scanner.nextLine());

            }catch(NumberFormatException e) {
                
                System.out.println("Tipo de caracter inválido, procure utilizar valores inteiros!");
                System.exit(0);

            }

        }
        //Pulando uma linha
        System.out.println();
    }

    public void imprimeEletronicosInseridos() {

        for(int ie = 0; ie < quantidadeDeEletronicos; ie++) {

            System.out.println((ie + 1) + " eletrônico: " + eletronicos[ie]);

        }
        //Pulando uma linha
        System.out.println();
    }

    public void imprimeValoresDosEletronicosInseridos() {

        for(int ive = 0; ive < quantidadeDeEletronicos; ive++) {

            System.out.println("Valor do " + (ive + 1) + " eletrônico: " + valoresDosEletronicos[ive]); 

        }
        //Pulando uma linha
        System.out.println();
    }

    public void defineQuantidadeDeMoveis() {

        try {

            System.out.println("Digite a quantidade de móveis:"); quantidadeDeMoveis = Integer.parseInt(scanner.nextLine());
            moveis = new String[quantidadeDeMoveis];
        
        }catch(NumberFormatException e) {

            System.out.println("Tipo de caracter inválido, procure utilizar valores inteiros!");
            System.exit(0);

        }
        //Pulando uma linha
        System.out.println();
    }

    public void adicionaMoveis() {

        for(int am = 0; am < quantidadeDeMoveis; am++) {

            System.out.println("Digite o " + (am + 1) + " móvel:"); moveis[am] = scanner.nextLine();

        }
        //Pulando uma linha
        System.out.println();
    }

    public void adicionaValoresDosMoveis() {

        valoresDosMoveis = new int[quantidadeDeMoveis];

        for(int avm = 0; avm < quantidadeDeMoveis; avm++) {
            
            try {

                System.out.println("Digite o valor do " + (avm + 1) + " móvel:"); valoresDosMoveis[avm] = Integer.parseInt(scanner.nextLine());

            }catch(NumberFormatException e) {

                System.out.println("Tipo de caracter inválido, procure utilizar valores inteiros!");
                System.exit(0);

            }

        }
        //Pulando uma linha
        System.out.println();
    }

    public void imprimeMoveisInseridos() {

        for(int im = 0; im < quantidadeDeMoveis; im++) {

            System.out.println((im + 1) + " móvel: " + moveis[im]);

        }
        //Pulando uma linha
        System.out.println();
    }

    public void imprimeValoresDosMoveisInseridos() {

        for(int ivm = 0; ivm < quantidadeDeMoveis; ivm++) {

            System.out.println("Valor do " + (ivm + 1) + " móvel: " + valoresDosMoveis[ivm]);

        }
        //Pulando uma linha
        System.out.println();
    }

}
