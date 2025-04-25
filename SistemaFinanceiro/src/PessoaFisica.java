public class PessoaFisica extends Pessoa {
    protected String cpf;
    protected String rg;
    protected String emissor;

    public PessoaFisica(int id) {
        super(id);  
        this.cpf = faker.idNumber().valid();  
        this.rg = faker.idNumber().valid(); 
        this.emissor = faker.address().state();  
    }

    // Getters
    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    public String getEmissor() {
        return emissor;
    }

    // Setters
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setEmissor(String emissor) {
        this.emissor = emissor;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();  
        System.out.println("CPF: " + cpf);
        System.out.println("RG: " + rg);
        System.out.println("Emissor: " + emissor);
    }
}
