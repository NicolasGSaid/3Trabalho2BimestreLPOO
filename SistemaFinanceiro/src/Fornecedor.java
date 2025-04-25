public class Fornecedor extends PessoaJuridica {
    protected double limiteCompra;
    protected String dataCadastro;
    protected String site;

    public Fornecedor(int id) {
        super(id);  // Chama o construtor da PessoaJuridica
        this.limiteCompra = faker.number().randomDouble(2, 500, 100000);
        this.dataCadastro = faker.date().birthday().toString();  
        this.site = faker.internet().url(); 
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

    @Override
    public void mostrarDados() {
        super.mostrarDados(); 
        System.out.println("Limite de Compra: " + limiteCompra);
        System.out.println("Data de Cadastro: " + dataCadastro);
        System.out.println("Site: " + site);
    }
}
