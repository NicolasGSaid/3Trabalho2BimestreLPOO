
import java.util.Scanner;

public abstract class PessoaFisica extends Pessoa {
    protected String cpf;
    protected String rg;
    protected String emissor;

    public PessoaFisica(int id) {
        super(id);
        this.cpf = faker.number().digits(11);
        this.rg = faker.number().digits(9);
        this.emissor = faker.address().state();  
    }

    public PessoaFisica() {
        super(0);  
        this.cpf = cpf;
        this.rg = rg;
        this.emissor = emissor;
    }
    
    public void incluir(Scanner scanner){
        super.entrar(scanner);
        System.out.print("Digite o CPF:");
        this.cpf = scanner.nextLine();
        System.out.print("Digite o RG:");
        this.rg = scanner.nextLine();
        System.out.print("Digite o emissor:");
        this.emissor = scanner.nextLine();
    }

    // Getters e Setters
    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    public String getEmissor() {
        return emissor;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setEmissor(String emissor) {
        this.emissor = emissor;
    }
}