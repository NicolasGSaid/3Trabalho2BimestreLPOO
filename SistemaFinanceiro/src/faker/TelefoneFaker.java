package faker;

import com.github.javafaker.Faker;
import model.TelefoneModel;

import java.util.Locale;

public class TelefoneFaker {

    private static final Faker faker = new Faker(new Locale("pt-BR"));

    public static TelefoneModel gerar() {
        int ddd = faker.number().numberBetween(11, 99); 

        long numero = Long.parseLong("9" + faker.number().digits(8));

        return new TelefoneModel(ddd, numero);
    }
}
