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
public class PagamentoDinheiro implements Pagamento{
    //Atributos
    private double valor;
    
    //Metodo construtor
    public PagamentoDinheiro(double v){
        this.setValor(v);
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
        double desconto = (this.getValor() * 0.1);//Calcula 10% do valor da compra
        double total = (this.getValor() - desconto);//Calcula o total a pagar diminuindo o desconto do valor da compra
        return(total);//Retorna o total
    }

    @Override
    public void imprimirRecibo() {
        //Formata a string
        String mensagem = String.format("Valor da compra: R$ %.2f\nForma de pagamento: Dinheiro\nValor do desconto: R$ %.2f\nTotal a pagar: R$ %.2f\n", this.getValor(), (this.getValor() * 0.1), this.calcularTotal());
        //Imprime na tela
        JOptionPane.showMessageDialog(null, mensagem, "Recibo Dinheiro", JOptionPane.INFORMATION_MESSAGE);
    }
    
    
}
