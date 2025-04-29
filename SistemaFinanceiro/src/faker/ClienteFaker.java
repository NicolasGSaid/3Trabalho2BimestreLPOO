package faker;

import com.github.javafaker.Faker;
import java.util.Locale;
import model.ClienteModel;
import model.EnderecoModel;
import model.TelefoneModel;

public class ClienteFaker {
    
    private final Faker faker = new Faker(new Locale("pt-BR"));
    
    public ClienteModel gerarClienteFalso() {
        
        int id = faker.number().numberBetween(1, 1000);
        String nome = faker.company().name();
        String email = faker.internet().emailAddress();
        
        EnderecoModel endereco = new EnderecoModel(
            faker.address().streetName(),
            faker.address().buildingNumber(),
            faker.address().secondaryAddress(),
            faker.address().cityName(),
            faker.address().state(),
            faker.address().zipCode()
        );

        TelefoneModel telefone = new TelefoneModel(
            faker.phoneNumber().cellPhone(),
            faker.phoneNumber().cellPhone(),
            faker.phoneNumber().cellPhone()
        );
        
        String cnpj = faker.number().digits(14);
        String inscricaoEstadual = faker.number().digits(9);
        String contato = faker.name().fullName();
        
        double limiteCredito = faker.number().randomDouble(2, 1000, 10000);
        
        return new ClienteModel(
            limiteCredito,
            endereco, // enderecoCobranca e endereco são o mesmo
            cnpj,
            inscricaoEstadual,
            contato,
            id,
            nome,
            email,
            endereco,
            telefone
        );
    }
}
