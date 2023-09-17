package ProjetoLoja.VisaoDoCliente;

import ProjetoLoja.MenuDaLoja.ContextoParaExecucao;

public class Cliente {
    
    private String sessao = "";

    public void visaoDoCliente() {

        ContextoParaExecucao contexto = new ContextoParaExecucao();

        System.out.println("Olá, cliente! bem vindo a loja, qual sessão deseja visitar? (Comidas, Bebidas, Eletronicos, Moveis e/ou Roupas):"); sessao = contexto.scanner.nextLine();
        
        if(sessao.equalsIgnoreCase("comidas")) {

            contexto.adicionaComidasEBebidas.imprimeAlimentosInseridos();
            contexto.adicionaComidasEBebidas.imprimeValoresDosAlimentosInseridos();

        }else if(sessao.equalsIgnoreCase("bebidas")) {

            contexto.adicionaComidasEBebidas.imprimeBebidasInseridas();
            contexto.adicionaComidasEBebidas.imprimeValoresDosAlimentosInseridos();

        }else if(sessao.equalsIgnoreCase("eletronicos")) {

            contexto.adicionaEletronicosEMoveis.imprimeEletronicosInseridos();
            contexto.adicionaEletronicosEMoveis.imprimeValoresDosEletronicosInseridos();

        }else if(sessao.equalsIgnoreCase("moveis")) {

            contexto.adicionaEletronicosEMoveis.imprimeMoveisInseridos();
            contexto.adicionaEletronicosEMoveis.imprimeValoresDosMoveisInseridos();

        }else if(sessao.equalsIgnoreCase("roupas")) {

            contexto.adicionaRoupas.imprimeRoupasInseridas();
            contexto.adicionaRoupas.imprimeValoresDasRoupasInseridas();

        }

    }

}
