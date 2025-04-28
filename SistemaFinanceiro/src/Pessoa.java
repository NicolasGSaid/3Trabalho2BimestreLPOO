
import com.github.javafaker.Faker;
import java.util.Scanner;

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
    
    public Pessoa(){
        Scanner scanner = new Scanner(System.in); 
        this.id = -1;
        this.nome = "";
        this.email = "";
        this.endereco = new Endereco("", "", "", "", "", "", 0); 
        this.telefone = new Telefone(scanner); 
    }
    
    public void entrar(Scanner input){
        System.out.print("Digite o ID:");
        this.id = input.nextInt();
        input.nextLine();
        System.out.print("Digite o nome:");
        this.nome = input.nextLine();
        System.out.print("Digite o email:");
        this.email = input.nextLine();
        this.endereco.incluir(input);
        //this.telefone.entrar(input);  
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
