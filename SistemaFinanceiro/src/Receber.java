public class Receber extends Financeiro {
    protected Cliente cliente;
    protected String notaFiscal;

    public Receber(int id) {
        super(id);
        this.cliente = new Cliente(); // Instancia com dados faker
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

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Nota Fiscal: " + notaFiscal);
        System.out.println("Cliente: ");
        cliente.mostrarDados(); // Método da classe Cliente
    }
}
