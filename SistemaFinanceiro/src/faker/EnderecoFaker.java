package faker;

import com.github.javafaker.Faker;
import model.EnderecoModel;

import java.util.Locale;

public class EnderecoFaker {

    private static final Faker faker = new Faker(new Locale("pt-BR"));

    public static EnderecoModel gerar() {
        return new EnderecoModel(
            faker.address().streetName(),                      
            String.valueOf(faker.number().numberBetween(1, 9999)), 
            faker.address().secondaryAddress(),               
            faker.address().cityName(),                       
            faker.address().city(),                           
            faker.address().state(),                          
            faker.number().numberBetween(10000000, 99999999)  
        );
    }
}
