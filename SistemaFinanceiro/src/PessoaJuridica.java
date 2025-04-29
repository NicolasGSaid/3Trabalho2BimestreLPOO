
import java.util.Scanner;


public abstract class PessoaJuridica extends Pessoa{
    
    protected String cnpj, inscricaoEstadual, contato;
    
      public PessoaJuridica(int id) {
        super(id);  
        this.cnpj = faker.company().name();
        this.inscricaoEstadual = faker.company().industry();   
        this.contato = faker.phoneNumber().cellPhone();  
      }
      
      public PessoaJuridica(String cnpj, String inscricaoEstadual, String contato) {
        super(0);  
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
        this.contato = contato;
      }
      
      public void incluir(Scanner scanner){
          super.entrar(scanner);
          System.out.print("Digite o CNPJ: ");
          scanner.nextLine();
          System.out.print("Digite a inscrição estadual: ");
          scanner.nextLine();
          System.out.print("Digite o Contato: ");
          scanner.nextLine();
      }
      
    // Getters
    public String getCnpj(){
        return cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public String getContato() {
        return contato;
    }

    // Setters
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }
}
