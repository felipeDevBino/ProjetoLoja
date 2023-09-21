package ProjetoLoja.SessaoDeComidasEBebidas;

import java.util.Scanner;

public class AdicionaComidasEBebidas {

    Scanner scanner = new Scanner(System.in);

    private int quantidadeDeAlimentos;
    private String alimentos[];
    private int valoresDosAlimentos[];
    private int quantidadeDeBebidas;
    private String bebidas[];
    private int valoresDasBebidas[];

    public void defineQuantidadeDeAlimentos() {

        try {

            System.out.println("Digite a quantidade de alimentos:"); quantidadeDeAlimentos = Integer.parseInt(scanner.nextLine());
            alimentos = new String[quantidadeDeAlimentos];

        }catch(NumberFormatException E) {

            System.out.println("Tipo de caracter inválido, procure utilizar valores inteiros!");
            System.exit(0);

        }
        //Pulando uma linha
        System.out.println();
    }

    public void adicionaAlimentos() {

        for(int ada = 0; ada < quantidadeDeAlimentos; ada++) {

            System.out.println("Digite o " + (ada + 1) + " alimento:"); alimentos[ada] = scanner.nextLine();

        }
        //Pulando uma linha
        System.out.println();
    }

    public void adicionaValoresDosAlimentos() {

        valoresDosAlimentos = new int[quantidadeDeAlimentos];

        for(int ava = 0; ava < quantidadeDeAlimentos; ava++) {

            try {

                System.out.println("Digite o valor do " + (ava + 1) + " alimento:"); valoresDosAlimentos[ava] = Integer.parseInt(scanner.nextLine());

            }catch(NumberFormatException e) {

                System.out.println("Tipo de caracter inválido, procure utilizar valores inteiros!");
                System.exit(0);

            }

        }
        //Pulando uma linha
        System.out.println();
    }

    public void imprimeAlimentosInseridos() {

        for(int ia = 0; ia < quantidadeDeAlimentos; ia++) {

            System.out.println((ia + 1) + " alimento: " + alimentos[ia]);

        }
        //Pulando uma linha
        System.out.println();
    }

    public void imprimeValoresDosAlimentosInseridos() {

        for(int iva = 0; iva < quantidadeDeAlimentos; iva++) {

            System.out.println("Valor do " + (iva + 1) + " alimento: " + valoresDosAlimentos[iva]);

        }
        //Pulando uma linha
        System.out.println();
    }

    public void defineQuantidadeDeBebidas() {

        try {

            System.out.println("Digite a quantidade de bebidas:"); quantidadeDeBebidas = Integer.parseInt(scanner.nextLine());
            bebidas = new String[quantidadeDeBebidas];

        }catch(NumberFormatException e) {

            System.out.println("Tipo de caracter inválido, procure utilizar valores inteiros!");
            System.exit(0);

        }
        //Pulando uma linha
        System.out.println();
    }

    public void adicionaBebidas() {

        for(int ab = 0; ab < quantidadeDeBebidas; ab++) {

            System.out.println("Digite a " + (ab + 1) + " bebida:"); bebidas[ab] = scanner.nextLine();

        }
        //Pulando uma linha
        System.out.println();
    }

    public void adicionaValoresDasBebidas() {

        valoresDasBebidas = new int[quantidadeDeBebidas];

        for(int vb = 0; vb < quantidadeDeBebidas; vb++) {

            try {

                System.out.println("Digite o valor da " + (vb + 1) + " bebida:"); valoresDasBebidas[vb] = Integer.parseInt(scanner.nextLine());

            }catch(NumberFormatException e) {

                System.out.println("Tipo de caracter inválido, procure utilizar valores inteiros!");
                System.exit(0);

            }

        }
        //Pulando uma linha
        System.out.println();
    }

    public void imprimeBebidasInseridas() {

        for(int ib = 0; ib < quantidadeDeBebidas; ib++) {

            System.out.println((ib + 1) + " bebida: " + bebidas[ib]);

        }
        //Pulando uma linha
        System.out.println();
    }

    public void imprimeValoresDasBebidasInseridas() {

        for(int ivb = 0; ivb < quantidadeDeBebidas; ivb++) {

            System.out.println("Valor da " + (ivb + 1) + " bebida: " + valoresDasBebidas[ivb]);

        }
        //Pulando uma linha 
        System.out.println();
    }

}