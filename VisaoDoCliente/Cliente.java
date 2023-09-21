package ProjetoLoja.VisaoDoCliente;

import ProjetoLoja.MenuDaLoja.ContextoParaExecucao;

public class Cliente {

    //Escolhe a primeira sessão para ver sendo cliente
    private String sessao = "";
    //Escolhe outras sessões para ver sendo cliente
    private String outraSessao = "";

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

        }else {
            System.out.println("Sessão inválida e/ou inexistente / Caracter inválido!");
            System.exit(0);
        }

    }

    public void olhaOutraSessao(ContextoParaExecucao contexto) {
 
        System.out.println("Por fim, deseja olhar outra sessão da loja? digite sim ou nao:"); outraSessao = contexto.scanner.nextLine();  
           
        if(outraSessao.equalsIgnoreCase("sim")) {
            
            do {

                this.visaoDoCliente(contexto);

            }while(outraSessao.equalsIgnoreCase("sim"));

        }else if(outraSessao.equalsIgnoreCase("nao")) {
            
            System.out.println("Programa terminado.");
            System.exit(0);

        }else {

            System.out.println("Comando inválido!");
            System.exit(0);

        }

    }

}
