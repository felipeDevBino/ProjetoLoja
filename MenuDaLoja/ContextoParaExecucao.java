package ProjetoLoja.MenuDaLoja;

import java.util.Scanner;

import ProjetoLoja.SessaoDeComidasEBebidas.AdicionaComidasEBebidas;
import ProjetoLoja.SessaoDeEletronicosEMoveis.AdicionaEletronicosEMoveis;
import ProjetoLoja.SessaoDeRoupas.AdicionaRoupas;
import ProjetoLoja.VisaoDoCliente.Cliente;

public class ContextoParaExecucao {
    
    public Scanner scanner = new Scanner(System.in);
    
    public AdicionaComidasEBebidas adicionaComidasEBebidas = new AdicionaComidasEBebidas();
    public AdicionaEletronicosEMoveis adicionaEletronicosEMoveis = new AdicionaEletronicosEMoveis();
    public AdicionaRoupas adicionaRoupas = new AdicionaRoupas();
    public Cliente visaoDoCliente = new Cliente();
    
    public String editaradicionar = "";

    public void contexto() {

        System.out.println("\nOlá, bem vindo a loja\nAdicione itens e valores para sessões específicas de sua loja e depois os veja na visão do cliente!");
        System.out.println("Qual sessão deseja editar? (Comidas, bebidas, Eletronicos, moveis ou Roupas):"); String seletor = scanner.nextLine();

        if(seletor.equalsIgnoreCase("comidas")) {
            
            //Definição dos alimentos
            adicionaComidasEBebidas.defineQuantidadeDeAlimentos();
            adicionaComidasEBebidas.adicionaAlimentos();
            adicionaComidasEBebidas.adicionaValoresDosAlimentos();
    
            //Impressão dos alimentos inseridos
            adicionaComidasEBebidas.imprimeAlimentosInseridos();
            adicionaComidasEBebidas.imprimeValoresDosAlimentosInseridos();

        }else if(seletor.equalsIgnoreCase("bebidas")) { 

            //Definição das bebidas
            adicionaComidasEBebidas.defineQuantidadeDeBebidas();
            adicionaComidasEBebidas.adicionaBebidas();
            adicionaComidasEBebidas.adicionaValoresDasBebidas();

            //Impressão das bebidas inseridas
            adicionaComidasEBebidas.imprimeBebidasInseridas();
            adicionaComidasEBebidas.imprimeValoresDasBebidasInseridas();

        }else if(seletor.equalsIgnoreCase("eletronicos")) {

            //Definição dos eletrônicos
            adicionaEletronicosEMoveis.defineQuantidadeDeEletronico();
            adicionaEletronicosEMoveis.adicionaEletronicos();
            adicionaEletronicosEMoveis.adicionaValoresDosEletronicos();

            //Impressão dos eletrônicos inseridos
            adicionaEletronicosEMoveis.imprimeEletronicosInseridos();
            adicionaEletronicosEMoveis.imprimeValoresDosEletronicosInseridos();

        }else if(seletor.equalsIgnoreCase("moveis")) {

            //Definição dos móveis
            adicionaEletronicosEMoveis.defineQuantidadeDeMoveis();
            adicionaEletronicosEMoveis.adicionaMoveis();
            adicionaEletronicosEMoveis.adicionaValoresDosMoveis();

            //Impressão dos móveis inseridos
            adicionaEletronicosEMoveis.imprimeMoveisInseridos();
            adicionaEletronicosEMoveis.imprimeValoresDosMoveisInseridos();

        }else if(seletor.equalsIgnoreCase("roupas")) {

            //Definição das roupas
            adicionaRoupas.defineQuantidadeDeRoupas();
            adicionaRoupas.adicionaRoupas();
            adicionaRoupas.adicionaValoresDasRoupas();

            //Impressão das roupas inseridas
            adicionaRoupas.imprimeRoupasInseridas();
            adicionaRoupas.imprimeValoresDasRoupasInseridas();

        }else {
            System.out.println("Sessão inválida e/ou inexistente / Caracter inválido!");
        }

    }

    public void verificarItensDeSessoes() {

        System.out.println("Deseja verificar suas sessões para ver o que há de adicionado?"); String opcao = scanner.nextLine();

        if(opcao.equalsIgnoreCase("sim")) {

            System.out.println("Sessão de Alimentos:");
            adicionaComidasEBebidas.imprimeAlimentosInseridos();
            adicionaComidasEBebidas.imprimeValoresDosAlimentosInseridos();

            System.out.println("Sessão de Bebidas:");
            adicionaComidasEBebidas.imprimeBebidasInseridas();
            adicionaComidasEBebidas.imprimeValoresDasBebidasInseridas();

            System.out.println("Sessão de Eletrônicos:");
            adicionaEletronicosEMoveis.imprimeEletronicosInseridos();
            adicionaEletronicosEMoveis.imprimeValoresDosEletronicosInseridos();

            System.out.println("Sessão de Móveis:");
            adicionaEletronicosEMoveis.imprimeMoveisInseridos();
            adicionaEletronicosEMoveis.imprimeValoresDosMoveisInseridos();

            System.out.println("Sessão de Roupas:");
            adicionaRoupas.imprimeRoupasInseridas();
            adicionaRoupas.imprimeValoresDasRoupasInseridas();

        }else if(opcao.equalsIgnoreCase("nao")) {
            //.......
        }

    }
    
    //Contexto de loop para editar/adicionar itens em sessões
    public void loop() {

        System.out.println("Deseja adicionar/editar alguma sessão? digite sim ou nao:"); editaradicionar = scanner.nextLine();

    }

}