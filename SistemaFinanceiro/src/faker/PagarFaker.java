package faker;

import com.github.javafaker.Faker;
import model.*;

import java.text.SimpleDateFormat;
import java.util.Locale;

public class PagarFaker {

    private static final Faker faker = new Faker(new Locale("pt-BR"));
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    public static PagarModel gerarPagar() {
        
        String emissao = sdf.format(faker.date().past(30, java.util.concurrent.TimeUnit.DAYS));
        String vencimento = sdf.format(faker.date().future(15, java.util.concurrent.TimeUnit.DAYS));
        String pagamento = sdf.format(faker.date().future(20, java.util.concurrent.TimeUnit.DAYS));

        
        double valor = faker.number().randomDouble(2, 100, 2000);
        double juros = faker.number().randomDouble(2, 0, 100);
        double multa = faker.number().randomDouble(2, 0, 100);
        double desconto = faker.number().randomDouble(2, 0, 100);
        double total = valor + juros + multa - desconto;

        return new PagarModel(
            FornecedorFaker.gerarFornecedor(),
            faker.number().digits(47), // boleto
            faker.number().numberBetween(1, 9999), // id
            faker.number().numberBetween(10000, 99999), // número
            emissao,
            vencimento,
            pagamento,
            valor,
            juros,
            multa,
            desconto,
            total
        );
    }
}
