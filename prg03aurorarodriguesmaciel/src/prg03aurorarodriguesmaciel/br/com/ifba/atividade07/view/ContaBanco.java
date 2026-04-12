/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prg03aurorarodriguesmaciel.br.com.ifba.atividade07.view;

/**
 *
 * @author auror
 */
public class ContaBanco {
    //Atributos da classe ContaBanco
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    //Método Construtor que define o status como falso e o saldo como 0
    public ContaBanco(){
        this.setStatus(false);
        this.setSaldo(0);
    }
    
    //Métodos getters/acessor e setters/modificador de todos os atributos
    public int getNumConta(){
        return this.numConta;
    }
    public void setNumConta(int n){
        this.numConta = n;
    }
    
    public String getTipo(){
        return this.tipo;
    }
    public void setTipo(String t){
        this.tipo = t;
    }
    
    public String getDono(){
        return this.dono;
    }
    public void setDono(String d){
        this.dono = d;
    }
    
    public float getSaldo(){
        return this.saldo;
    }
    public void setSaldo(float s){
        this.saldo = s;
    }
    
    public boolean isStatus(){//isStatus pois retorna um boolean
        return status;
    }
    public void setStatus(boolean st){
        this.status = st;
    }
    
    //Métodos personalizados
    public void abrirConta(String t){//Método que abre a conta
        this.setStatus(true);//Modifica o status da conta para true(aberta)
        this.setTipo(t);//Modifica o tipo da conta para cc ou cp
        
        if (t.equals("cc") == true){
            this.setSaldo(50);//Modifica o saldo para R$ 50,00
            System.out.println("Voce recebeu um presente de R$ 50,00 ");
        }
        else{
            this.setSaldo(150);//Modifica o saldo para R$ 150,00
            System.out.println("Voce recebeu um presente de R$ 150,00 ");
        }
        System.out.println("Conta aberta com sucesso! ");
    }
    
    public void fecharConta(){//Metodo que fecha a conta
        if (this.isStatus() == true){//Se conta estiver aberta
            if (this.getSaldo() == 0){//Se conta estiver zerada
                this.setStatus(false);//Muda o status da conta para false
                System.out.println("Conta fechada com sucesso! ");
            }
            else{//Se a conta ainda tiver dinheiro
                System.out.println("Nao e possivel fechar a conta. O seu saldo e R$ " + this.getSaldo());
            }
        }
        else{//Se a conta ja estiver fechada
            System.out.println("A conta ja esta fechada! ");
        }
    }
    
    public void depositar(float d){//Metodo que deposita dinheiro na conta
        if (this.isStatus() == true){//Se conta estiver aberta
            this.setSaldo(this.getSaldo() + d);//Saldo sera modificado para saldo atual mais valor do deposito
            System.out.println("Deposito realizado na conta de " + this.getDono());
        }
        else {//Se a conta estiver fechada
            System.out.println("Impossivel depositar, a conta esta fechada ");
        }
    }
    
    public void sacar(float v){//Metodo que faz o saque
        if (this.isStatus() == true){//Se a conta estiver aberta
            if (this.getSaldo() >= v){//Se o saldo atual for maior ou igual ao valor do saque
                this.setSaldo(this.getSaldo() - v);//Modifica o saldo para o saldo atual menos o valor do saque
                System.out.println("Saque realizado com sucesso");
            }
            else{//Se o saldo for menor que o valor do saque
                System.out.println("Saldo insuficiente");
            }
        }
        else{//Se a conta estiver fechada
            System.out.println("A conta esta fechada");
        }
    }
    
    public void pagarMensal(){//Metodo que paga a mensalidade da conta
        float v;//Variavel que guarda o valor da mensalidade
        if (this.getTipo().equals("cc") == true){//Se a conta for do tipo conta corrente
            v = 12;//Valor da mensalidade e igual a 12
        }
        else{//Se a conta for do tipo conta poupanca
            v = 20;//Valor da mensalidade e igual a 20
        }
        if (this.getSaldo() >= v){//Se tiver dinheiro suficiente na conta
            this.setSaldo(this.getSaldo() - v);//Saldo e modificado pelo saldo atual menos o valor da mensalidade
            System.out.println("Mensalidade paga com sucesso");
        }
        else{//Se nao tiver dinheiro
            System.out.println("Saldo insuficiente");
        }
    }
    
    public void visualizar(){//Metodo que mostra o estado atual da conta
        System.out.println("-------------------------------");
        System.out.println("DADOS DA CONTA: ");
        System.out.println("Numero da conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.isStatus());
    }
        
    
    
}
