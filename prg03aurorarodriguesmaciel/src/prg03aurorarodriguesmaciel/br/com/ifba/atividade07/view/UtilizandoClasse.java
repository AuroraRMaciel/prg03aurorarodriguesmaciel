/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prg03aurorarodriguesmaciel.br.com.ifba.atividade07.view;

/**
 *
 * @author auror
 */
public class UtilizandoClasse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ContaBanco c1 = new ContaBanco();//Cria um novo objeto (uma conta) da classe ContaBanco
        c1.setNumConta(111);//Modifica o numero da conta
        c1.setDono("Jubileu");//Modifica o nome do dono da conta
        c1.abrirConta("cc");//Abre a conta e define o tipo da conta
        
        ContaBanco c2 = new ContaBanco();//Cria um novo objeto a segunda conta da classe ContaBanco
        c2.setNumConta(222);//Modifica o numero da conta
        c2.setDono("Creusa");//Modifica o nome do dono da conta
        c2.abrirConta("cp");//Abre a conta e define o tipo
        
        c1.depositar(300);//Deposita R$ 300,00 em c1
        c2.depositar(500);//Deposita R$ 500,00 em c2
        
       
        c2.sacar(100);//Saca R$ 100,00 de c2
        c1.sacar(350);//Saca R$ 350,00 de c1
        c1.fecharConta();//Fecha a conta c1
        
        c1.visualizar();//Mostra os dados da conta c1
        c2.visualizar();//Mostra os dados da conta c2
    }
    
}
