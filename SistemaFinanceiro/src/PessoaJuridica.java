
public abstract class PessoaJuridica extends Pessoa{
    
    protected String cnpj, inscricaoEstadual, contato;
    
      public PessoaJuridica(int id) {
        super(id);  // Chama o construtor da classe mãe (Pessoa)
        this.cnpj = faker.company().name();
        this.inscricaoEstadual = faker.company().industry();  // 
        this.contato = faker.phoneNumber().cellPhone();  
      }
      
    // Getters
    public String getCnpj() {
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

    @Override
    public void mostrarDados() {
        super.mostrarDados();  // Chama o método da classe mãe
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Inscrição Estadual: " + inscricaoEstadual);
        System.out.println("Contato: " + contato);
    }
}
