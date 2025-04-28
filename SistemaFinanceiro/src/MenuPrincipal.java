import java.util.ArrayList;
import java.util.Scanner;

public class MenuPrincipal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Fornecedor> fornecedores = new ArrayList<>();
        ArrayList<Receber> contasReceber = new ArrayList<>();
        ArrayList<Pagar> contasPagar = new ArrayList<>();
        
        gerarFuncionariosFakes(funcionarios);
        gerarClientesFakes(clientes);
        gerarFornecedoresFakes(fornecedores);
        gerarContasReceberFakes(contasReceber);
        gerarContasPagarFakes(contasPagar);
        
        int op1 = 0; 

        while (op1 != 7) {
            op1 = menu(scanner);

            switch (op1) {
                case 1:
                    acessarFuncionarios(scanner, funcionarios);
                    break;
                case 2:
                    acessarClientes(scanner, clientes);
                    break;
                case 3:
                    acessarFornecedores(scanner, fornecedores);
                    break;
                case 4:
                    acessarContasReceber(scanner, contasReceber);
                    break;
                case 5:
                    acessarContasPagar(scanner, contasPagar);
                    break;
                case 6:
                    acessarFluxoCaixa(scanner, contasReceber, contasPagar);
                    break;
                case 7:
                    System.out.println("Saindo do sistema... Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        }
    }
    
    public static void gerarFuncionariosFakes(ArrayList<Funcionario> funcionarios) {
        funcionarios.add(new Funcionario(1));
        funcionarios.add(new Funcionario(2)); 
        funcionarios.add(new Funcionario(3));    
    }
    
    public static void gerarClientesFakes(ArrayList<Cliente> clientes) {
        clientes.add(new Cliente(1));
        clientes.add(new Cliente(2));
        clientes.add(new Cliente(3));
    }

    public static void gerarFornecedoresFakes(ArrayList<Fornecedor> fornecedores) {
        fornecedores.add(new Fornecedor(1));
        fornecedores.add(new Fornecedor(2));
        fornecedores.add(new Fornecedor(3));
    }

    public static void gerarContasReceberFakes(ArrayList<Receber> contasReceber) {
        contasReceber.add(new Receber(1));
        contasReceber.add(new Receber(2));
    }

    public static void gerarContasPagarFakes(ArrayList<Pagar> contasPagar) {
        contasPagar.add(new Pagar(1));
        contasPagar.add(new Pagar(2));
    }


    public static int menu(Scanner scanner) {
        System.out.println("\n--- Sistema Financeiro Iniciado! ---");
        System.out.println("1. Acessar Funcionários");
        System.out.println("2. Acessar Clientes");
        System.out.println("3. Acessar Fornecedores");
        System.out.println("4. Acessar Contas a Receber");
        System.out.println("5. Acessar Contas a Pagar");
        System.out.println("6. Acessar Fluxo de Caixa");
        System.out.println("7. Sair");
        System.out.print("Escolha uma opção: ");
        return scanner.nextInt();
    }


    public static void acessarFuncionarios(Scanner scanner, ArrayList<Funcionario> funcionarios) {
        System.out.println("Você está acessando o menu de Funcionários.");
        System.out.println("1. Incluir Funcionário");
        System.out.println("2. Alterar Pelo ID");
        System.out.println("3. Consultar Pela Posição Na Lista");
        System.out.println("4. Consultar Pelo CPF");
        System.out.println("5. Consultar Pelo Nome");
        System.out.println("6. Excluir Pelo ID");
        System.out.println("7. Retornar ao menu Principal");
        int escolha = scanner.nextInt();
        
        switch(escolha){
            case 1:
                Funcionario funcionario = new Funcionario(scanner);  
                funcionario.incluir(scanner);  
                funcionarios.add(funcionario); 
                break;
            case 2:
                alterarFuncionarioPeloId(scanner, funcionarios);
                break;
            case 3:
                consultarFuncionarioPorPosicao(scanner, funcionarios);
                break;
            case 4:
                scanner.nextLine();
                consultarFuncionarioPorCpf(scanner, funcionarios);
                break;
            case 5:
                scanner.nextLine();
                consultarFuncionarioPorNome(scanner, funcionarios);
                break;
            case 6:
                scanner.nextLine();
                excluirFuncionarioPorId(scanner, funcionarios);
                break;
            case 7:
                break;
            default:
                System.out.println("Opção inválida, tente novamente.");
        }  
    }

    public static void acessarClientes(Scanner scanner, ArrayList<Cliente> clientes) {
        System.out.println("Você está acessando o menu de Clientes.");
    }

    public static void acessarFornecedores(Scanner scanner, ArrayList<Fornecedor> fornecedores) {
        System.out.println("Você está acessando o menu de Fornecedores.");
    }

    public static void acessarContasReceber(Scanner scanner, ArrayList<Receber> contasReceber) {
        System.out.println("Você está acessando o menu de Contas a Receber.");
    }

    public static void acessarContasPagar(Scanner scanner, ArrayList<Pagar> contasPagar) {
        System.out.println("Você está acessando o menu de Contas a Pagar.");
    }

    public static void acessarFluxoCaixa(Scanner scanner, ArrayList<Receber> contasReceber, ArrayList<Pagar> contasPagar) {
        System.out.println("Você está acessando o Fluxo de Caixa.");
    }
    
   public static void alterarFuncionarioPeloId(Scanner scanner, ArrayList<Funcionario> funcionarios) {
    System.out.println("Digite o ID (posição na lista) do funcionário que deseja alterar: ");
    int id = scanner.nextInt();
    scanner.nextLine(); 

    if (id >= 0 && id < funcionarios.size()) {
        Funcionario funcionario = funcionarios.get(id);

        System.out.println("Alterando dados do funcionário...");

        System.out.print("Digite o novo Nome: ");
        String novoNome = scanner.nextLine();
        funcionario.setNome(novoNome);

        System.out.print("Digite o novo CPF: ");
        String novoCpf = scanner.nextLine();
        funcionario.setCpf(novoCpf);

        System.out.print("Digite o novo RG: ");
        String novoRg = scanner.nextLine();
        funcionario.setRg(novoRg);

        System.out.print("Digite o novo Emissor do RG: ");
        String novoEmissorRg = scanner.nextLine();
        funcionario.setEmissor(novoEmissorRg);

        System.out.print("Digite a nova Data de Admissão: ");
        String novaDataAdmissao = scanner.nextLine();
        funcionario.setDataAdmissao(novaDataAdmissao);

        System.out.print("Digite a nova Data de Demissão: ");
        String novaDataDemissao = scanner.nextLine();
        funcionario.setDataDemissao(novaDataDemissao);

        System.out.println("Funcionário alterado com sucesso!");

    } else {
        System.out.println("ID inválido! Nenhum funcionário encontrado nessa posição.");
        }
    }
   
   public static void consultarFuncionarioPorPosicao(Scanner scanner, ArrayList<Funcionario> funcionarios) {
    System.out.println("Digite a posição do funcionário na lista:");
    int posicao = scanner.nextInt();
    scanner.nextLine(); // Limpa o buffer

    if (posicao >= 0 && posicao < funcionarios.size()) {
        Funcionario funcionario = funcionarios.get(posicao);
        System.out.println("--- Funcionário Encontrado ---");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("CPF: " + funcionario.getCpf());
        System.out.println("RG: " + funcionario.getRg());
        System.out.println("Emissor do RG: " + funcionario.getEmissor());
        System.out.println("Data de Admissão: " + funcionario.getDataAdmissao());
        System.out.println("Data de Demissão: " + funcionario.getDataDemissao());
    } else {
        System.out.println("Posição inválida! Nenhum funcionário encontrado.");
        }
    }
   public static void consultarFuncionarioPorCpf(Scanner scanner, ArrayList<Funcionario> funcionarios) {
    System.out.println("Digite o CPF do funcionário que deseja consultar:");
    String cpfProcurado = scanner.nextLine();

    boolean encontrado = false;
    for (Funcionario funcionario : funcionarios) {
        if (funcionario.getCpf().equals(cpfProcurado)) {
            System.out.println("--- Funcionário Encontrado ---");
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("CPF: " + funcionario.getCpf());
            System.out.println("RG: " + funcionario.getRg());
            System.out.println("Emissor do RG: " + funcionario.getEmissor());
            System.out.println("Data de Admissão: " + funcionario.getDataAdmissao());
            System.out.println("Data de Demissão: " + funcionario.getDataDemissao());
            encontrado = true;
            break;
        }
    }
    if (!encontrado) {
        System.out.println("Nenhum funcionário encontrado com esse CPF.");
        }
    }
   
   public static void consultarFuncionarioPorNome(Scanner scanner, ArrayList<Funcionario> funcionarios) {
    System.out.println("Digite o Nome do funcionário que deseja consultar:");
    String nomeProcurado = scanner.nextLine();

    boolean encontrado = false;
    for (Funcionario funcionario : funcionarios) {
        if (funcionario.getNome().equals(nomeProcurado)) {
            System.out.println("--- Funcionário Encontrado ---");
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("CPF: " + funcionario.getCpf());
            System.out.println("RG: " + funcionario.getRg());
            System.out.println("Emissor do RG: " + funcionario.getEmissor());
            System.out.println("Data de Admissão: " + funcionario.getDataAdmissao());
            System.out.println("Data de Demissão: " + funcionario.getDataDemissao());
            encontrado = true;
            break;
        }
    }
    if (!encontrado) {
        System.out.println("Nenhum funcionário encontrado com esse Nome.");
        }
    }
   public static void excluirFuncionarioPorId(Scanner scanner, ArrayList<Funcionario> funcionarios) {
    if (funcionarios.isEmpty()) {
        System.out.println("Não há funcionários cadastrados para excluir.");
        return;
    }

    System.out.println("Digite o ID (posição) do funcionário que deseja excluir:");
    int id = scanner.nextInt();

    if (id >= 0 && id < funcionarios.size()) {
        Funcionario funcionarioRemovido = funcionarios.remove(id);
        System.out.println("Funcionário " + funcionarioRemovido.getNome() + " removido com sucesso.");
    } else {
        System.out.println("ID inválido. Nenhum funcionário encontrado nessa posição.");
        }
    }
}


