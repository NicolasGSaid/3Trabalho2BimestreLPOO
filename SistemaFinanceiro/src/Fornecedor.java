import java.util.Scanner;
import java.util.ArrayList;

public class Fornecedor extends PessoaJuridica {
    
    protected static ArrayList<Fornecedor> fornecedores = new ArrayList<>();

    protected double limiteCompra;
    protected String dataCadastro;
    protected String site;

    public Fornecedor(int id) {
        super(id);  
        this.limiteCompra = faker.number().randomDouble(2, 500, 100000);
        this.dataCadastro = faker.date().birthday().toString();  
        this.site = faker.internet().url(); 
    }
    
    public Fornecedor(Scanner scanner){
        super(0);
        this.limiteCompra = 0.0;
        this.dataCadastro = "";
        this.site = "";
    }
    
    public void incluir(Scanner scanner){
        super.entrar(scanner);
        System.out.print("Digite o limite de compra: ");
        this.limiteCompra = scanner.nextDouble();
        System.out.print("Digite a data de cadastro: ");
        this.dataCadastro = scanner.nextLine();
        System.out.print("Digite o Site do fornecedor: ");
        this.site = scanner.nextLine();
        System.out.print("Digite o salário:");
    }
    
    public void incluir(Fornecedor fornecedor) {
        fornecedores.add(fornecedor);
        System.out.println("Funcionário incluído com sucesso!");
    }
    
    public void alterarPorId(int id) {
    for (Fornecedor f : fornecedores) {
        if (f.getId() == id) {
            System.out.println("Novo limite de compra: ");
            f.setLimiteCompra(scanner.nextLine());

            System.out.println("Nova data de cadastro: ");
            f.setDataCadastro(scanner.nextLine());

            System.out.println("Novo site: ");
            f.setSite(scanner.nextLine());

            System.out.println("Fornecedor alterado com sucesso!");
            return;
        }
    }
    System.out.println("Fornecedor com ID não encontrado.");
}
    
    // Getters
    public double getLimiteCompra() {
        return limiteCompra;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public String getSite() {
        return site;
    }

    // Setters
    public void setLimiteCompra(double limiteCompra) {
        this.limiteCompra = limiteCompra;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public void setSite(String site) {
        this.site = site;
    }
}
