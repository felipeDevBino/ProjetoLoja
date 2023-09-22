package ProjetoLoja.loja.menudaloja;

import ProjetoLoja.loja.visaodocliente.Cliente;

public class Menu {
    
    public static void main(String[] args) {

        ContextoParaExecucao contexto = new ContextoParaExecucao();
        Cliente cliente = new Cliente();

        contexto.contexto();
        contexto.loop();

        if(contexto.editaradicionar.equalsIgnoreCase("sim")) {

            //Contexto de loop para adicionar/editar alguma sessão da loja
            do {

                contexto.contexto();
                contexto.loop();

            }while(contexto.editaradicionar.equalsIgnoreCase("sim"));

        }else if(contexto.editaradicionar.equalsIgnoreCase("nao")) {

            //.....

        }else {
            System.out.println("Comando inválido!");
            System.exit(0);
        }
        
        //Imprime todos os itens nas sessões
        contexto.verificarItensDeSessoes();

        System.out.println("Deseja visualizar sua loja na visão do cliente? digite sim ou nao:"); String opcao = contexto.scanner.nextLine();

        //Pulando uma linha
        System.out.println();
        
        if(opcao.equalsIgnoreCase("sim")) {

            cliente.visaoDoCliente(contexto); 

        }else if(opcao.equalsIgnoreCase("nao")) {

            System.out.println("Programa terminado.");
            System.exit(0);

        }else {

            System.out.println("Comando inválido!");
            System.exit(0);

        }

        //Loop do cliente para ver outras sessões antes adicionadas
        cliente.olhaOutraSessao(contexto);

        contexto.scanner.close();

    }

}