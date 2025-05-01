package View;

import controller.ClienteController;  

public class MenuCliente implements MenuInterface {
    
    int opcaoSecundaria = 0;
    
    ClienteController clienteController = new ClienteController();  

    public void menuCliente() {  
        while(opcaoSecundaria != 5) {
            System.out.println("\n----- Menu de Clientes -----");  
            System.out.println("1. Incluir Cliente");  
            System.out.println("2. Alterar Cliente");  
            System.out.println("3. Consultar Posição");  
            System.out.println("4. Excluir Cliente");  
            System.out.println("5. Voltar");
            opcaoSecundaria = scanner.nextInt();
            scanner.nextLine(); 

            switch(opcaoSecundaria) {
                case 1 -> clienteController.incluir();
                case 2 -> clienteController.alterar();
                case 3 -> clienteController.ConsultarPosicao();
                case 4 -> clienteController.excluir();
                case 5 -> System.out.println("Voltando ao menu principal.");
                default -> System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}
