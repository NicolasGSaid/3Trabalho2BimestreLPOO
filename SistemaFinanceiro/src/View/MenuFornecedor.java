package View;

import controller.FornecedorController; 
import faker.FornecedorFaker;

public class MenuFornecedor implements MenuInterface {
    
    int opcaoSecundaria = 0;
    
    FornecedorController fornecedorController = new FornecedorController();

    public void menuFornecedor() { 
        
        for (int i = 1; i <= 5; i++) {
            fornecedorController.incluir(FornecedorFaker.gerarFornecedor());
        }
        
        while(opcaoSecundaria != 5) {
            System.out.println("\n----- Menu de Fornecedores -----");  
            System.out.println("1. Incluir Fornecedor");  
            System.out.println("2. Alterar Fornecedor");  
            System.out.println("3. Consultar Posição");  
            System.out.println("4. Excluir Fornecedor");  
            System.out.println("5. Voltar");
            opcaoSecundaria = scanner.nextInt();
            scanner.nextLine(); 

            switch(opcaoSecundaria) {
                case 1 -> fornecedorController.incluir();
                case 2 -> fornecedorController.alterar();
                case 3 -> fornecedorController.ConsultarPosicao();
                case 4 -> fornecedorController.excluir();
                case 5 -> System.out.println("Voltando ao menu principal.");
                default -> System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}
