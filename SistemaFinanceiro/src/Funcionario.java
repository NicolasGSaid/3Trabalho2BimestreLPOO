public class Funcionario extends PessoaFisica {
    protected String dataAdmissao;
    protected String dataDemissao;
    protected String ctps;
    protected double salario;

    public Funcionario(int id) {
        super(id);  
        this.dataAdmissao = faker.date().birthday().toString();  
        this.dataDemissao = ""; 
        this.ctps = String.valueOf(faker.number().numberBetween(1000000, 9999999));
        this.salario = faker.number().randomDouble(2, 1500, 15000); 
    }

    // Getters
    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public String getDataDemissao() {
        return dataDemissao;
    }

    public String getCtps() {
        return ctps;
    }

    public double getSalario() {
        return salario;
    }

    // Setters
    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public void setDataDemissao(String dataDemissao) {
        this.dataDemissao = dataDemissao;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados(); 
        System.out.println("CTPS: " + ctps);
        System.out.println("Salário: R$ " + salario);
        System.out.println("Data de Admissão: " + dataAdmissao);
        System.out.println("Data de Demissão: " + (dataDemissao.isEmpty() ? "Ativo" : dataDemissao));
    }
}
