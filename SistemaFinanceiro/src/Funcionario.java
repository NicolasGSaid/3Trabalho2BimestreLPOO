import java.util.Scanner;
import java.util.ArrayList;


public class Funcionario extends PessoaFisica {
    
    protected static ArrayList<Funcionario> funcionarios = new ArrayList<>();
    protected String dataAdmissao;
    protected String dataDemissao;
    protected String ctps;
    protected double salario;
    protected Scanner scanner = new Scanner(System.in);


    public Funcionario(int id) {
        super(id);  
        this.dataAdmissao = faker.date().birthday().toString();  
        this.dataDemissao = ""; 
        this.ctps = String.valueOf(faker.number().numberBetween(1000000, 9999999));
        this.salario = faker.number().randomDouble(2, 1500, 15000); 
    }
    
     public Funcionario(Scanner scanner) {
        super(0); 
        this.dataAdmissao = "";
        this.dataDemissao = "";
        this.ctps = "";
        this.salario = 0.0;
        this.cpf = "";
        this.rg = "";
        this.emissor = "";  
    }

     public void incluir(Scanner scanner){
        super.entrar(scanner);
        System.out.print("Digite a data de admissão:");
        this.dataAdmissao = scanner.nextLine();
        System.out.print("Digite a data de demissão:");
        this.dataDemissao = scanner.nextLine();
        System.out.print("Digite a CTPS:");
        this.ctps = scanner.nextLine();
        System.out.print("Digite o salário:");
        this.salario = scanner.nextDouble();
        scanner.nextLine();
    }
    
    public void incluir(Funcionario funcionario) {
        funcionarios.add(funcionario);
        System.out.println("Funcionário incluído com sucesso!");
    }

    public void alterarPorId(int id) {
        for (Funcionario f : funcionarios) {
            if (f.getId() == id) {
                System.out.println("Novo nome: ");
                f.setNome(scanner.nextLine());

                System.out.println("Novo salário: ");
                f.setSalario(scanner.nextDouble());
                scanner.nextLine(); // Consome o \n

                System.out.println("Funcionário alterado com sucesso!");
                return;
            }
        }
        System.out.println("Funcionário com ID não encontrado.");
    }

    public void consultarPosicao(int posicao) {
        try {
            Funcionario f = funcionarios.get(posicao);
            System.out.println(f);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Posição inválida!");
        }
    }

    public void consultarPorCpf(String cpf) {
        for (Funcionario f : funcionarios) {
            if (f.getCpf().equals(cpf)) {
                System.out.println(f);
                return;
            }
        }
        System.out.println("Funcionário com CPF não encontrado.");
    }

    public void consultarPorNome(String nome) {
        for (Funcionario f : funcionarios) {
            if (f.getNome().equalsIgnoreCase(nome)) {
                System.out.println(f);
                return;
            }
        }
        System.out.println("Funcionário com nome não encontrado.");
    }

    public void excluirPorId(int id) {
        for (Funcionario f : funcionarios) {
            if (f.getId() == id) {
                funcionarios.remove(f);
                System.out.println("Funcionário excluído com sucesso.");
                return;
            }
        }
        System.out.println("Funcionário com ID não encontrado.");
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    // Getters
    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public String getDataDemissao() {
        return dataDemissao;
    }

    public String getCtps() {
        return ctps;
    }

    public double getSalario() {
        return salario;
    }

    // Setters
    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public void setDataDemissao(String dataDemissao) {
        this.dataDemissao = dataDemissao;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
