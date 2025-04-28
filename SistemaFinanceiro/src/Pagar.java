public class Pagar extends Financeiro {
    protected Fornecedor fornecedor;
    protected String boleto;

    public Pagar(int id) {
        super(id);
        this.fornecedor = new Fornecedor(faker.number().numberBetween(1, 1000)); // Instancia com dados faker
        this.boleto = "BO-" + faker.number().numberBetween(100000, 999999);
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getBoleto() {
        return boleto;
    }

    public void setBoleto(String boleto) {
        this.boleto = boleto;
    }
}