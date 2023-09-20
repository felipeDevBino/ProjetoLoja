package ProjetoLoja.VisaoDoCliente;

import ProjetoLoja.MenuDaLoja.ContextoParaExecucao;

public class Cliente {
    
    private String sessao = "";

    public void visaoDoCliente(ContextoParaExecucao contexto) {

        System.out.println("Olá, cliente! bem vindo a loja, qual sessão deseja visitar? (Comidas, Bebidas, Eletronicos, Moveis e/ou Roupas):"); sessao = contexto.scanner.nextLine();

        if(sessao.equalsIgnoreCase("comidas")) {

            //Pulando uma linha
            System.out.println();
            contexto.adicionaComidasEBebidas.imprimeAlimentosInseridos();
            contexto.adicionaComidasEBebidas.imprimeValoresDosAlimentosInseridos();

        }else if(sessao.equalsIgnoreCase("bebidas")) {

            //Pulando uma linha
            System.out.println();
            contexto.adicionaComidasEBebidas.imprimeBebidasInseridas();
            contexto.adicionaComidasEBebidas.imprimeValoresDosAlimentosInseridos();

        }else if(sessao.equalsIgnoreCase("eletronicos")) {

            //Pulando uma linha
            System.out.println();
            contexto.adicionaEletronicosEMoveis.imprimeEletronicosInseridos();
            contexto.adicionaEletronicosEMoveis.imprimeValoresDosEletronicosInseridos();

        }else if(sessao.equalsIgnoreCase("moveis")) {

            //Pulando uma linha
            System.out.println();
            contexto.adicionaEletronicosEMoveis.imprimeMoveisInseridos();
            contexto.adicionaEletronicosEMoveis.imprimeValoresDosMoveisInseridos();

        }else if(sessao.equalsIgnoreCase("roupas")) {

            //Pulando uma linha
            System.out.println();
            contexto.adicionaRoupas.imprimeRoupasInseridas();
            contexto.adicionaRoupas.imprimeValoresDasRoupasInseridas();

        }

    }

}
