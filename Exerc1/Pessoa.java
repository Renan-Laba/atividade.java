package Exerc1;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Pessoa implements Comparable<Pessoa>{
    private String Nome;
    private String RG;
    private  Date Dt_Nasc;
    private HashMap<String, String> Email = new LinkedHashMap<String, String>();
    private  HashMap<String, String> Telefone = new LinkedHashMap<String, String>();
    private  HashMap<String, Endereço> Endereço = new LinkedHashMap<String, Endereço>();
    public SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    Endereço endereço = new Endereço();

    public Pessoa(String Nome, String RG, Date Dt_Nasc, HashMap Telefone, HashMap Endereço) throws ParseException{
        this.Nome = Nome;
        this.RG = RG;
        this.Dt_Nasc =Dt_Nasc;
        this.Telefone = Telefone;  
        this.Endereço = Endereço;      
    }

    public Pessoa(){

    }

    public void setDt_Nasc(Date dt_Nasc) {
        Dt_Nasc = dt_Nasc;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public void setRG(String rG) {
        RG = rG;
    }


    public HashMap<String, String> getEmail() {
        return Email;
    }

    public HashMap<String, Endereço> getEndereço() {
        return Endereço;
    }

    public HashMap<String, String> getTelefone() {
        return Telefone;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("Nome:%s;\n RG:%s - Data de Nascimento: %s;\n Telefone:%s\n Endereço:%s", this.Nome,this.RG,this.Dt_Nasc,this.Telefone,this.Endereço);
    }

    public String getNome() {
        return Nome;
    }

    public String getRG() {
        return RG;
    }

    public Date getDt_Nasc() {
        return Dt_Nasc;
    }

  
    

    @Override
    public int compareTo(Pessoa o) {
        int Comp = this.Nome.compareTo(o.getNome());
        if(Comp < 0) {
            return -1;
          } else if(Comp > 0) {
            return 1;
          } 
            return 0;
          
        
    }
    
    
}
