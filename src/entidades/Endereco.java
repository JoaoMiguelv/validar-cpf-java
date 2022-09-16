package entidades;

public class Endereco {
    private String logradouro;
    private String nome;
    private String numero;
    private String cep;
    private String cidade;
    private String uf;
    private String bairro;

    public Endereco(String cep) {
        setCep(cep);
    }

    // public Endereco() {}

    public Endereco(String logradouro, String nome, String numero, String cep, String cidade, String uf,
            String bairro) {
        this.setLogradouro(logradouro);
        this.setNome(nome);
        this.setNumero(numero);
        this.setCep(cep);
        this.setCidade(cidade);
        this.setUf(uf);
        this.setBairro(bairro);
    }

    // Método modificador gettters e setters
    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

}