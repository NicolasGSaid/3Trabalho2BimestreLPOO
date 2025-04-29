import com.github.javafaker.Faker;
import java.util.Scanner;

public class Telefone {
    private static final Faker faker = new Faker();
    
    protected int ddd;
    protected long numero;
    
    public Telefone() {
        this.ddd = faker.number().numberBetween(10, 99);
        this.numero = Long.parseLong(faker.phoneNumber().subscriberNumber(8));
    }
    
    public Telefone(int ddd, long numero) {
        this.ddd = 0;
        this.numero = 0;
    }
    
    public void incluir(Scanner scanner){
        System.out.print("Digite o DDD: ");
        scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite o Número: ");
        scanner.nextLong();
        scanner.nextLine();
    
    }

    // Getters
    public int getDdd() {
        return ddd;
    }

    public long getNumero() {
        return numero;
    }

    // Setters
    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "(" + ddd + ") " + numero;
    }
}

