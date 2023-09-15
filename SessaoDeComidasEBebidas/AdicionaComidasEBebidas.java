package ProjetoLoja.SessaoDeComidasEBebidas;

import java.util.Scanner;

public class AdicionaComidasEBebidas {

    Scanner scanner = new Scanner(System.in);

    private int quantidadeDeAlimentos;
    private int quantidadeDeBebidas;

    public void defineQuantidadeDeAlimentos() {

        System.out.println("Digite a quantidade de alimentos:"); quantidadeDeAlimentos = Integer.parseInt(scanner.nextLine());

    }

    public void defineQuantidadeDeBebidas() {

        System.out.println("Digite a quantidade de bebidas:"); quantidadeDeBebidas = Integer.parseInt(scanner.nextLine());

    }

}