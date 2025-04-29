
package model;

public abstract class PessoaModel {
    
    protected int id;
    protected String nome; 
    protected String email;
    protected EnderecoModel endereco;
    protected TelefoneModel telefone;

    public PessoaModel() {
    }

    public PessoaModel(int id, String nome, String email, EnderecoModel endereco, TelefoneModel telefone) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public EnderecoModel getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoModel endereco) {
        this.endereco = endereco;
    }

    public TelefoneModel getTelefone() {
        return telefone;
    }

    public void setTelefone(TelefoneModel telefone) {
        this.telefone = telefone;
    }
    
}
