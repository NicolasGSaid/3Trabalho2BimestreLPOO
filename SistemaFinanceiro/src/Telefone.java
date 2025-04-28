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
    
    public Telefone(Scanner scanner) {
        System.out.println("Digite o DDD: ");
        this.ddd = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o Numero: ");
        this.numero = scanner.nextLong();
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

