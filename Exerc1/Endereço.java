package Exerc1;

public class Endereço {
    
    private String Logradouro;
    private int Numero;
    private String Complemento;
    private String Bairro;
    private String CEP;
    private String Cidade;

    public Endereço(){

    }

    public Endereço(String Logradouro,int Numero, String Complemento,String Bairro,String CEP,String Cidade){
        this.Logradouro = Logradouro;
        this.Numero = Numero;
        this.Complemento = Complemento;
        this.Bairro = Bairro;
        this.CEP = CEP;
        this.Cidade = Cidade;
    }

    public void setLogradouro(String logradouro) {
        Logradouro = logradouro;
    }

    public void setNumero(int numero) {
        Numero = numero;
    }

    public void setBairro(String bairro) {
        Bairro = bairro;
    }

    public void setComplemento(String complemento) {
        Complemento = complemento;
    }

    public void setCEP(String CEP) {
        CEP = CEP;
    }
    public void setCidade(String cidade) {
        Cidade = cidade;
    }

    public String getLogradouro() {
        return Logradouro;
    }

    public int getNumero() {
        return Numero;
    }

    public String getComplemento() {
        return Complemento;
    }
    
    public String getBairro() {
        return Bairro;
    }

    public String getCEP() {
        return CEP;
    }

    public String getCidade() {
        return Cidade;
    }

    @Override
    public String toString() {
        return String.format("Logradouro:%s, Numero:%d", this.Logradouro,this.Numero);
    }
    

}
