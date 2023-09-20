package ProjetoLoja.MenuDaLoja;

import ProjetoLoja.VisaoDoCliente.Cliente;

public class Menu {

    public static void main(String[] args) {

        ContextoParaExecucao contexto = new ContextoParaExecucao();
        
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

        }
        
        //Imprime todos os itens nas sessões
        contexto.verificarItensDeSessoes();

        System.out.println("Por fim, deseja visualizar sua loja na visão do cliente? digite sim ou nao:"); String opcao = contexto.scanner.nextLine();

        //Pulando uma linha
        System.out.println();
        
        if(opcao.equalsIgnoreCase("sim")) {

            Cliente cliente = new Cliente();
            cliente.visaoDoCliente(contexto); 

        }else if(opcao.equalsIgnoreCase("nao")) {

            System.out.println("Programa terminado.");
            System.exit(0);

        }else {

            System.out.println("Comando inválido!");
            
        }

        contexto.scanner.close();

    }

}