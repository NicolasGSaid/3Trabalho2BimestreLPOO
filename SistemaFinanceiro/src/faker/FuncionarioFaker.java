package faker;

import com.github.javafaker.Faker;
import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;
import model.EnderecoModel;
import model.FuncionarioModel;
import model.TelefoneModel;

public class FuncionarioFaker {

    private static final Faker faker = new Faker(new Locale("pt-BR"));

    public static FuncionarioModel gerarFuncionario(int id) {
        EnderecoModel endereco = EnderecoFaker.gerar();
        TelefoneModel telefone = TelefoneFaker.gerar();

        String nome = faker.name().fullName();
        String email = faker.internet().emailAddress();
        String cpf = faker.numerify("###.###.###-##");
        String rg = String.valueOf(faker.number().numberBetween(10000000, 99999999));
        String emissor = "SSP";

        String ctps = String.valueOf(faker.number().numberBetween(100000, 999999));
        double salario = ThreadLocalRandom.current().nextDouble(1200.0, 9000.0);

        String dataAdmissao = faker.date()
            .past(1000, java.util.concurrent.TimeUnit.DAYS)
            .toInstant().toString().substring(0, 10);

        String dataDemissao = ""; // Funcionário ativo por padrão

        return new FuncionarioModel(
            dataAdmissao,
            dataDemissao,
            ctps,
            salario,
            cpf,
            rg,
            emissor,
            id,
            nome,
            email,
            endereco,
            telefone
        );
    }
}
