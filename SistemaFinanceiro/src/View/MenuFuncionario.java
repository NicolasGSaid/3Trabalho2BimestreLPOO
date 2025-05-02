package View;

import controller.FuncionarioController;
import faker.FuncionarioFaker;


public class MenuFuncionario implements MenuInterface {

    int opcaoSecundaria = 0;
    FuncionarioController funcionarioController = new FuncionarioController();
    
    public void executarMenuFuncionario() {
        
        for (int i = 1; i <= 5; i++) {
            funcionarioController.incluir(FuncionarioFaker.gerarFuncionario(i));
        }
              
        while (opcaoSecundaria != 5) {
            System.out.println("\n----- Menu de Funcionários -----");
            System.out.println("1. Incluir Funcionário");
            System.out.println("2. Alterar Funcionário");
            System.out.println("3. Consultar Posição");
            System.out.println("4. Excluir Funcionário");
            System.out.println("5. Voltar");
            opcaoSecundaria = scanner.nextInt();
            scanner.nextLine();  

            switch (opcaoSecundaria) {
                case 1 -> funcionarioController.incluir();
                case 2 -> funcionarioController.alterar();
                case 3 -> funcionarioController.ConsultarPosicao();
                case 4 -> funcionarioController.excluir();
                case 5 -> System.out.println("Voltando ao menu principal.");
                default -> System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}
