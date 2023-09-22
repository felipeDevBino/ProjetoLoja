package ProjetoLoja.sessoes.sessaoderoupas;

import java.util.Scanner;

public class AdicionaRoupas {
    
    Scanner scanner = new Scanner(System.in);

    private int quantidadeDeRoupas;
    private String roupas[];
    private int valoresDasRoupas[];

    public void defineQuantidadeDeRoupas() {

        try {

        System.out.println("Digite a quantidade de roupas:"); quantidadeDeRoupas = Integer.parseInt(scanner.nextLine());
        roupas = new String[quantidadeDeRoupas];   
       
        }catch(NumberFormatException e) {

            System.out.println("Tipo de caracter inválido, procure utilizar valores inteiros!");
            System.exit(0);

        }
        //Pulando uma linha
        System.out.println();
    } 

    public void adicionaRoupas() {

        for(int ar = 0; ar < quantidadeDeRoupas; ar++) {

            System.out.println("Digite a " + (ar + 1) + " roupa:"); roupas[ar] = scanner.nextLine();

        }
        //Pulando uma linha
        System.out.println();
    }

    public void adicionaValoresDasRoupas() {

        valoresDasRoupas = new int[quantidadeDeRoupas];

        for(int avr = 0; avr < quantidadeDeRoupas; avr++) {

            try {

                System.out.println("Digite o valor da " + (avr + 1) + " roupa:"); valoresDasRoupas[avr] = Integer.parseInt(scanner.nextLine());

            }catch(NumberFormatException e) {

                System.out.println("Tipo de caracter inválido, procure utilizar valores inteiros!");
                System.exit(0);

            }

        }
        //Pulando uma linha
        System.out.println();
    }

    public void imprimeRoupasInseridas() {

        for(int ir = 0; ir < quantidadeDeRoupas; ir++) {

            System.out.println((ir + 1) + " roupa: " + roupas[ir]); 

        }
        //Pulando uma linha
        System.out.println();
    }

    public void imprimeValoresDasRoupasInseridas() {

        for(int ivr = 0; ivr < quantidadeDeRoupas; ivr++) {

            System.out.println("Valor da " + (ivr + 1) + " roupa: " + valoresDasRoupas[ivr]);

        }
        //Pulando uma linha
        System.out.println();
    }

}
