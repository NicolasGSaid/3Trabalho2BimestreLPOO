package faker;

import com.github.javafaker.Faker;
import java.util.Locale;
import model.EnderecoModel;
import model.FornecedorModel;
import model.TelefoneModel;

public class FornecedorFaker {
    
    private static final Faker faker = new Faker(new Locale("pt-BR"));
    
    public static FornecedorModel gerarFornecedor() {
        int id = faker.number().numberBetween(1, 9999);
        String nome = faker.company().name();
        String email = faker.internet().emailAddress();
        String cnpj = faker.number().digits(14);
        String inscricaoEstadual = faker.number().digits(12);
        String contato = faker.name().fullName();
        double limiteCompra = faker.number().randomDouble(2, 1000, 50000);
        String dataCadastro = faker.date().birthday().toString(); 
        String site = faker.internet().url();

        // Utilizando os fakers especializados
        EnderecoModel endereco = EnderecoFaker.gerar();
        TelefoneModel telefone = TelefoneFaker.gerar();

        return new FornecedorModel(
            limiteCompra,
            dataCadastro,
            site,
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
