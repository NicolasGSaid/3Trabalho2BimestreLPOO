package View;

public class MenuPrincipal implements MenuInterface {
    int opcao = 0;

    public int menuPrincipal(){
        System.out.println("1. Cadastro De Funcionarios");
        System.out.println("2. Cadastro De Clientes");
        System.out.println("3. Cadastro De Fornecedores");
        System.out.println("4. Cadastro De Creditos");
        System.out.println("5. Cadastro de Debitos");
        System.out.println("6. Fluxo De Caixa");
        System.out.println("7. Sair");
        opcao = scanner.nextInt();
        scanner.nextLine(); 
        return opcao;
    }
    
    public void executarMenu(){
                   
        while (opcao != 7) {
            opcao = menuPrincipal();
            
            switch(opcao) {
                case 1:
                    System.out.println("Você escolheu Cadastro de Funcionários.");
                    MenuFuncionario menuFuncionario = new MenuFuncionario();
                    menuFuncionario.executarMenuFuncionario();
                    break;
                case 2:
                    System.out.println("Você escolheu Cadastro de Clientes.");
                    MenuCliente menuCliente = new MenuCliente();
                    menuCliente.menuCliente();
                    break;
                case 3:
                    System.out.println("Você escolheu Cadastro de Fornecedores.");
                    MenuFornecedor menuFornecedor = new MenuFornecedor();
                    menuFornecedor.menuFornecedor();
                    break;
                case 4:
                    System.out.println("Cadastro de Créditos.");
                    MenuPagar menuPagar = new MenuPagar();
                    menuPagar.menuPagar();
                    break;
                case 5:
                    System.out.println("Cadastro de Débitos.");
                    MenuReceber menuReceber = new MenuReceber();
                    menuReceber.menuReceber();
                    break;
                case 6:
                    System.out.println("Fluxo de Caixa.");
                    MenuFluxoCaixa menuCaixa = new MenuFluxoCaixa(); 
                    menuCaixa.menuFluxoCaixa();
                    break;
                case 7:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }
    }
}
