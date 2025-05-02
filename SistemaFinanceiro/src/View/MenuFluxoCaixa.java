package View;

import controller.PagarController;
import controller.ReceberController;
import faker.PagarFaker;
import faker.ReceberFaker;
import model.PagarModel;
import model.ReceberModel;

public class MenuFluxoCaixa {

    private PagarController pagarController = new PagarController();
    private ReceberController receberController = new ReceberController();

    public void menuFluxoCaixa() {
        
        for (int i = 1; i <= 5; i++) {
            pagarController.incluir(PagarFaker.gerarPagar());
        }
        
        for (int i = 1; i <= 5; i++) {
            receberController.incluir(ReceberFaker.gerarReceber());
        }
        
        if (receberController.getRecebimentos().isEmpty() && pagarController.getContasPagar().isEmpty()) {
            System.out.println("\n-----------------------------------------------");
            System.out.println("             Não há dados no fluxo de caixa.   ");
            System.out.println("-----------------------------------------------");
        } else {
            System.out.println("-----------------------------------------------");
            System.out.println("                   Fluxo de Caixa              ");
            System.out.println("-----------------------------------------------");
            System.out.println("Vencimento       | Entrada   | Saída    | Saldo");
            System.out.println("-----------------------------------------------");

            double totalReceber = 0;
            double totalPagar = 0;

            if (!receberController.getRecebimentos().isEmpty()) {
                for (ReceberModel receber : receberController.getRecebimentos()) {
                    totalReceber += receber.getTotal();
                    System.out.printf("%-17s | %-9.2f | %-8s | %-8.2f\n", receber.getVencimento(), receber.getTotal(), "0.00", totalReceber);
                }
            } else {
                System.out.printf("%-17s | %-9s | %-8s | %-8s\n", "Vazio", "0.00", "0.00", "0.00");
            }

            if (!pagarController.getContasPagar().isEmpty()) {
                for (PagarModel pagar : pagarController.getContasPagar()) {
                    totalPagar += pagar.getTotal();
                    System.out.printf("%-17s | %-9s | %-8.2f | %-8.2f\n", pagar.getVencimento(), "0.00", pagar.getTotal(), totalReceber - totalPagar);
                }
            } else {
                System.out.printf("%-17s | %-9s | %-8s | %-8s\n", "Vazio", "0.00", "0.00", "0.00");
            }

            System.out.printf("%-17s | %-9.2f | %-8.2f | %-8.2f\n", "Totais", totalReceber, totalPagar, (totalReceber - totalPagar));
            System.out.println("-----------------------------------------------");
        }
    }
}