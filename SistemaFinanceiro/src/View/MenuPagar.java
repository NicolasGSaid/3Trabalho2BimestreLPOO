package View;

import controller.PagarController;  
import faker.PagarFaker;

public class MenuPagar implements MenuInterface {
    
    int opcaoSecundaria = 0;
    
    PagarController pagarController = new PagarController();  

    public void menuPagar() {
        
        for (int i = 1; i <= 5; i++) {
            pagarController.incluir(PagarFaker.gerarPagar());
        }
        
        while(opcaoSecundaria != 5) {
            System.out.println("\n----- Menu de Pagamentos -----");  
            System.out.println("1. Incluir Pagamento");  
            System.out.println("2. Alterar Pagamento");  
            System.out.println("3. Consultar Posição");  
            System.out.println("4. Excluir Pagamento");  
            System.out.println("5. Voltar");
            opcaoSecundaria = scanner.nextInt();
            scanner.nextLine(); 

            switch(opcaoSecundaria) {
                case 1 -> pagarController.incluir();
                case 2 -> pagarController.alterar();
                case 3 -> pagarController.ConsultarPosicao();
                case 4 -> pagarController.excluir();
                case 5 -> System.out.println("Voltando ao menu principal.");
                default -> System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}
