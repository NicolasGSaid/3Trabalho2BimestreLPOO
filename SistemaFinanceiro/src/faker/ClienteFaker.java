package faker;

import com.github.javafaker.Faker;
import java.util.Locale;
import model.ClienteModel;
import model.EnderecoModel;
import model.TelefoneModel;

public class ClienteFaker {
    
    private static final Faker faker = new Faker(new Locale("pt-BR"));
    
    public static ClienteModel gerarCliente() {
        int id = faker.number().numberBetween(1, 1000);
        String nome = faker.company().name();
        String email = faker.internet().emailAddress();

        EnderecoModel enderecoCobranca = EnderecoFaker.gerar();
        EnderecoModel endereco = EnderecoFaker.gerar();
        TelefoneModel telefone = TelefoneFaker.gerar();

        String cnpj = faker.number().digits(14);
        String inscricaoEstadual = faker.number().digits(9);
        String contato = faker.name().fullName();
        double limiteCredito = faker.number().randomDouble(2, 1000, 10000);
        
        return new ClienteModel(
            limiteCredito,
            enderecoCobranca, 
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
