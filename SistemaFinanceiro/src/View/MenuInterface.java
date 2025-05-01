
package View;

import java.util.ArrayList;
import model.FuncionarioModel;


import java.util.Scanner;
import model.ClienteModel;
import model.FornecedorModel;
import model.PagarModel;
import model.ReceberModel;


public interface MenuInterface {
    
    Scanner scanner = new Scanner(System.in);
    
    ArrayList<FuncionarioModel> funcionarios = new ArrayList<>();
    ArrayList<ClienteModel> clientes = new ArrayList<>();        
    ArrayList<FornecedorModel> fornecedores = new ArrayList<>();
    ArrayList<PagarModel> contasPagar = new ArrayList<>();
    ArrayList<ReceberModel> contasReceber = new ArrayList<>();
}
