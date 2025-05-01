package View;

import controller.ReceberController;  

public class MenuReceber implements MenuInterface {
    
    int opcaoSecundaria = 0;
    
    ReceberController receberController = new ReceberController();  

    public void menuReceber() {  
        while(opcaoSecundaria != 5) {
            System.out.println("\n----- Menu de Recebimentos -----");  
            System.out.println("1. Incluir Recebimento");  
            System.out.println("2. Alterar Recebimento");  
            System.out.println("3. Consultar Posição");  
            System.out.println("4. Excluir Recebimento");  
            System.out.println("5. Voltar");
            opcaoSecundaria = scanner.nextInt();
            scanner.nextLine(); 

            switch(opcaoSecundaria) {
                case 1 -> receberController.incluir();
                case 2 -> receberController.alterar();
                case 3 -> receberController.ConsultarPosicao();
                case 4 -> receberController.excluir();
                case 5 -> System.out.println("Voltando ao menu principal.");
                default -> System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}
