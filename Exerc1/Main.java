package Exerc1;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static int esc;
    public static Pessoa p = new Pessoa();
    public static List<Pessoa> pessoas = new ArrayList<Pessoa>();
    public static List<Endereço> Endereços = new ArrayList<Endereço>();
 

    public static void PreencheEndereço(Endereço end){
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Digite seu logradouro");
        end.setLogradouro(sc2.next());

        System.out.println("Digite o numero de seu complemento");
        end.setNumero(sc2.nextInt());

        System.out.println("Digite qual é seu complemento");
        end.setComplemento(sc2.next());

        System.out.println("Digite seu bairro");
        end.setBairro(sc2.next());

        System.out.println("Digite o CEP");
       end.setCEP(sc2.next());

       sc2.close();
    }

    public static void main(String[] args) throws ParseException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("\n1-Criar\n");
            System.out.println("\n2-Editar");
            System.out.println("\n3-Remover");
            System.out.println("\n4-Listar\n");
            System.out.println("\n5-Sair\n");

            System.out.println("\nDigite sua Escolha");
            esc = sc.nextInt();

            switch (esc) {
                case 1:

                     System.out.println("Digite o RG: ");
                     p.setRG(sc.next());
                     System.out.println("Digite o nome:");
                     p.setNome(sc.next());
                     System.out.println("Digite a data de nascimento: ");
                     p.setDt_Nasc(p.formatter.parse(sc.next()));
                                             
                     System.out.println("Deseja digitar seu email principal ou secundário: ");
                     String tipoEmail = sc.next();
    
                     System.out.println("Digite seu email");
                     p.getEmail().put(tipoEmail,sc.next());

                     System.out.println("Deseja digitar seu telefone residencial ou comercial ou celular: ");
                     String tipoTel = sc.next();
    
                     System.out.println("Digite seu Telefone");
                     p.getTelefone().put(tipoTel,sc.next());

        

                     System.out.println("Deseja digitar seu endereço residencial ou comercial: ");
                     String tipoEnd = sc.next();

                     System.out.println("Digite seu endereço: ");;
                     Endereço end1 = new Endereço();
                     PreencheEndereço(end1);
                   

                     p.getEndereço().put(tipoEnd,end1);

          
                     pessoas.add(new Pessoa(p.getNome(), p.getRG(),p.getDt_Nasc(),p.getTelefone(),p.getEndereço()));
                     
                     
                    break;
                case 2:
                    System.out.println("Digite o nome da pessoa que você quer editar: ");
                    String Nome = sc.next();
                    for(int i = 0; i < pessoas.size(); i++)
                    {
                        Pessoa p = pessoas.get(i);

                        if(p.getNome().equals(Nome))
                        {
                            System.out.println("Digite o novo nome ");
                            String novoNome = sc.next();
                            System.out.println("Digite o novo RG ");
                            String novoRG = sc.next();
                            System.out.println("Digite o  novo telefone");
                            String novoTelefone = sc.next();
                            System.out.println("Digite o tipo do novo telefone");      
                            p.getTelefone().put(sc.next(), novoTelefone);
                            pessoas.set(i,new Pessoa(novoNome, novoRG, p.getDt_Nasc(), p.getTelefone(), p.getEndereço()));
    
                        }
                    }
                    break;
                case 3:
                System.out.println("Digite o nome da pessoa a ser excluida");
                String remove = sc.next();
                for(int i = 0; i < pessoas.size(); i++)
                    {
                        Pessoa p = pessoas.get(i);

                        if(p.getNome().equals(remove))
                        {
                            pessoas.remove(p);
                            break;
                        }
                    }
                                

                case 4:
                Collections.sort(pessoas);
                for (Pessoa p : pessoas) {
                    System.out.println(p);        
                }                
            
                default:
                sc.close();
                    break;
            }

        } while (esc !=5);
     


    }
}
