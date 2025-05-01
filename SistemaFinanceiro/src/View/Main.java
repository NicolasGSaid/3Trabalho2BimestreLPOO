package View;

import java.util.ArrayList;

import static faker.ClienteFaker.gerarCliente;
import static faker.FornecedorFaker.gerarFornecedor;
import faker.FuncionarioFaker;
import static faker.PagarFaker.gerarPagar;

import static faker.ReceberFaker.gerarReceber;

import model.ClienteModel;
import model.FornecedorModel;
import model.FuncionarioModel;
import model.PagarModel;
import model.ReceberModel;

public class Main implements MenuInterface {
    public static void main(String[] args) {
                          
        ArrayList<ClienteModel> clientes = new ArrayList<>();
        
        ArrayList<FornecedorModel> fornecedores = new ArrayList<>();
        ArrayList<PagarModel> contasPagar = new ArrayList<>();
        ArrayList<ReceberModel> contasReceber = new ArrayList<>();
        
        MenuPrincipal menuPrincipal = new MenuPrincipal();
                   
        //for (int i = 1; i <= 2; i++) {
        //    FuncionarioModel funcionario = FuncionarioFaker.gerarFuncionario(i);
        //    funcionarios.add(funcionario);
        //}
        for (int i = 1; i <= 2; i++) {
            FornecedorModel fornecedor = gerarFornecedor();
            fornecedores.add(fornecedor);
        }
        for (int i = 1; i <= 2; i++) {
            ClienteModel cliente = gerarCliente();
            clientes.add(cliente);
        }
        for (int i = 1; i <= 2; i++) {
            PagarModel pagar = gerarPagar();
            contasPagar.add(pagar);
        }
        for (int i = 1; i <= 2; i++) {
            ReceberModel receber = gerarReceber();
            contasReceber.add(receber);
        }
        
              
        menuPrincipal.executarMenu();
    } 
}


