
import com.github.javafaker.Faker;

public abstract class Pessoa {
    protected static final Faker faker = new Faker();
    
    protected int id;
    protected String nome; 
    protected String email;
    protected Endereco endereco;
    protected Telefone telefone;
    
    public Pessoa(int id){
        this.id = id;
        this.nome = faker.name().fullName();
        this.email = faker.internet().emailAddress();
        this.endereco = new Endereco();
        this.telefone = new Telefone();
    }
    
    public void mostrarDados(){
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Email: "+ email);
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone: " + telefone);                
    }
    
        // Getters
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
    
    public String getEmail() {
        return email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }
 
}
