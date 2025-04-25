
import com.github.javafaker.Faker;

public class Endereco {
    private static final Faker faker = new Faker ();
    
    private String logradouro, numero, complemento, bairro, cidade, estado;
    private int cep;
    
    public Endereco() {
        this.logradouro = faker.address().streetName();
        this.numero = faker.address().buildingNumber();
        this.complemento = faker.address().secondaryAddress();
        this.bairro = faker.address().streetName();
        this.cidade = faker.address().city();
        this.estado = faker.address().stateAbbr();
        this.cep = Integer.parseInt(faker.address().zipCode().replaceAll("[^0-9]", ""));
    }
    
      // Getters
    public String getLogradouro() {
        return logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public int getCep() {
        return cep;
    }

    // Setters
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }
    
     public void mostrarEndereco() {
        System.out.println("Logradouro: " + logradouro);
        System.out.println("Número: " + numero);
        System.out.println("Bairro: " + bairro);
        System.out.println("Cidade: " + cidade);
        System.out.println("Estado: " + estado);
        System.out.println("CEP: " + cep);
    }
}

