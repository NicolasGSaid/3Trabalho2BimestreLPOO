public class Cliente extends PessoaJuridica {
    protected double limiteCredito;
    protected Endereco enderecoCobranca;

    public Cliente(int id) {
        super(id);  
        this.limiteCredito = faker.number().randomDouble(2, 1000, 50000);  
        this.enderecoCobranca = new Endereco();  
    }

    // Getters
    public double getLimiteCredito() {
        return limiteCredito;
    }

    public Endereco getEnderecoCobranca() {
        return enderecoCobranca;
    }

    // Setters
    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public void setEnderecoCobranca(Endereco enderecoCobranca) {
        this.enderecoCobranca = enderecoCobranca;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados(); 
        System.out.println("Limite de Crédito: " + limiteCredito);
        System.out.println("Endereço de Cobrança: ");
        enderecoCobranca.mostrarEndereco(); 
    }
}
