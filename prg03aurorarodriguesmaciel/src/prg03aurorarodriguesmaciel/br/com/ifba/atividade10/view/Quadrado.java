/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prg03aurorarodriguesmaciel.br.com.ifba.atividade10.view;

/**
 *
 * @author auror
 */
public class Quadrado extends FormaBidimensional{//Classe concreta que erda de FormaBidimensional
    //Atributos
    private double lado;
    
    //Metodo construtor
    public Quadrado(double l){
        this.setLado(l);
    }
    
    //Metodo toString
    public String toString(){
        return("Quadrado: [" + "lado = " + this.getLado() + "]");
    }
    
    //Metodo obterArea
    @Override
    public double obterArea() {
        double area = Math.pow(this.getLado(), 2);
        //double area = (this.getLado() * this.getLado());
        return(area);
    }
    
    //Metodos acessores e modificadores
    public double getLado(){
        return(this.lado);
    }
    public void setLado(double l){
        this.lado = l;
    }
}
