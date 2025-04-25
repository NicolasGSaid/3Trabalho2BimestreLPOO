import com.github.javafaker.Faker;

public abstract class Financeiro {
    protected int id;
    protected int numero;
    protected String emissao;
    protected String vencimento;
    protected String pagamento;
    protected double valor;
    protected double juros;
    protected double multa;
    protected double desconto;
    protected double total;

    protected static Faker faker = new Faker();

    public Financeiro(int id) {
        this.id = id;
        this.numero = faker.number().numberBetween(1000, 9999);
        this.emissao = faker.date().past(30, java.util.concurrent.TimeUnit.DAYS).toString();
        this.vencimento = faker.date().future(30, java.util.concurrent.TimeUnit.DAYS).toString();
        this.pagamento = faker.bool().bool() ? faker.date().future(15, java.util.concurrent.TimeUnit.DAYS).toString() : ""; // às vezes em aberto
        this.valor = faker.number().randomDouble(2, 100, 10000);
        this.juros = faker.number().randomDouble(2, 0, 100);
        this.multa = faker.number().randomDouble(2, 0, 50);
        this.desconto = faker.number().randomDouble(2, 0, 100);
        this.total = valor + juros + multa - desconto;
    }

    // Getters
    public int getId() {
        return id;
    }

    public int getNumero() {
        return numero;
    }

    public String getEmissao() {
        return emissao;
    }

    public String getVencimento() {
        return vencimento;
    }

    public String getPagamento() {
        return pagamento;
    }

    public double getValor() {
        return valor;
    }

    public double getJuros() {
        return juros;
    }

    public double getMulta() {
        return multa;
    }

    public double getDesconto() {
        return desconto;
    }

    public double getTotal() {
        return total;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setEmissao(String emissao) {
        this.emissao = emissao;
    }

    public void setVencimento(String vencimento) {
        this.vencimento = vencimento;
    }

    public void setPagamento(String pagamento) {
        this.pagamento = pagamento;
    }

    public void setValor(double valor) {
        this.valor = valor;
        calcularTotal();
    }

    public void setJuros(double juros) {
        this.juros = juros;
        calcularTotal();
    }

    public void setMulta(double multa) {
        this.multa = multa;
        calcularTotal();
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
        calcularTotal();
    }

    private void calcularTotal() {
        this.total = this.valor + this.juros + this.multa - this.desconto;
    }

    public void mostrarDados() {
        System.out.println("ID: " + id);
        System.out.println("Número: " + numero);
        System.out.println("Emissão: " + emissao);
        System.out.println("Vencimento: " + vencimento);
        System.out.println("Pagamento: " + (pagamento.isEmpty() ? "Em aberto" : pagamento));
        System.out.println("Valor: R$ " + valor);
        System.out.println("Juros: R$ " + juros);
        System.out.println("Multa: R$ " + multa);
        System.out.println("Desconto: R$ " + desconto);
        System.out.println("Total: R$ " + total);
    }
}
