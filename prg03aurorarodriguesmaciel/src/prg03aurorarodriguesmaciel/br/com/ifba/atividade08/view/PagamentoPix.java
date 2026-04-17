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
public class PagamentoPix implements Pagamento{
    //Atributos
    private double valor;
    
    //Metodo construtor
    public PagamentoPix(double v){
        this.setValor(v);
    }
    
    //Metodos acessores e modificadores
    public double getValor(){
        return(this.valor);
    }
    public void setValor(double d){
        this.valor = d;
    }

    @Override
    public double calcularTotal() {
        double cashback = (this.getValor() * 0.02);//Calcula 2% do valor da compra
        double total = (this.getValor() - cashback);//Calcula o total a pagar
        return(total);//Retorna o total
    }

    @Override
    public void imprimirRecibo() {
        //Formata a mensagem
        String mensagem = String.format("Valor da compra: R$ %.2f\nForma de pagamento: Pix\nValor do cashback: R$ %.2f\nTotal a pagar: %.2f\n", this.getValor(), (this.getValor() * 0.02), this.calcularTotal());
        //Mostra na tela
        JOptionPane.showMessageDialog(null, mensagem, "Recibo pix", JOptionPane.INFORMATION_MESSAGE);
    }
    
    
}
