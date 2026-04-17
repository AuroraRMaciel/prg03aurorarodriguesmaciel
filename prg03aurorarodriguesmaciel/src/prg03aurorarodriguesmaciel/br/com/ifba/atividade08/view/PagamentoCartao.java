/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prg03aurorarodriguesmaciel.br.com.ifba.atividade08.view;

import javax.swing.JOptionPane;

/**
 *
 * @author auror
 */
public class PagamentoCartao implements Pagamento{
    //Atributos
    private double valor;
    
    //Metodo construtor
    public PagamentoCartao(double d){
        this.setValor(d);
    }
    
    //Metodos acessores e modificadores
    public double getValor(){
        return(this.valor);
    }
    public void setValor(double v){
        this.valor = v;
    }

    @Override
    public double calcularTotal() {
        double taxa = (this.getValor() * 0.05);//Calcula 5% do valor
        double total = (this.getValor() + taxa);//Calcula o total a pagar somando o valor da compra a taxa
        return(total);//Retorna o total
    }

    @Override
    public void imprimirRecibo() {
        //Formata a mensagem a ser exibida na tela
        String mensagem = String.format("Valor da compra: R$ %.2f\nForma de pagamento: Cartão\nValor da taxa: R$ %.2f\nTotal a pagar: R$ %.2f\n", this.getValor(), (this.getValor() * 0.05), this.calcularTotal());
        //Exibe a mensagem
        JOptionPane.showMessageDialog(null, mensagem, "Recibo Cartão", JOptionPane.INFORMATION_MESSAGE);
    }
    
    
}
