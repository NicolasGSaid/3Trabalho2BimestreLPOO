public class Receber extends Financeiro {
    protected Cliente cliente;
    protected String notaFiscal;

    public Receber(int id) {
        super(id);
        this.cliente = new Cliente(faker.number().numberBetween(1, 1000)); // Exemplo de id gerado aleatoriamente
        this.notaFiscal = "NF-" + faker.number().numberBetween(100000, 999999);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getNotaFiscal() {
        return notaFiscal;
    }

    public void setNotaFiscal(String notaFiscal) {
        this.notaFiscal = notaFiscal;
    }
}
