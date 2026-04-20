/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prg03aurorarodriguesmaciel.br.com.ifba.atividade10.view;

/**
 *
 * @author auror
 */
public class Circulo extends FormaBidimensional{//Classe concreta que erda de FormaBidimensional
    //Atributos
    private double raio;

    //Metodo construtor
    public Circulo(double r){
        this.setRaio(r);
    }
    
    //Metodo toString
    public String toString(){
        return ("Circulo [" + "raio = " + this.getRaio() + "]");
    }
    
    //Metodo obterArea
    @Override
    public double obterArea() {
        double pi = 3.14;
        double area = (pi * Math.pow(this.getRaio(), 2));
        //double area = pi * (this.getRaio() * this.getRaio());
        return(area);
    }
    
    //Metodo acessor e modificador
    public double getRaio(){
        return(this.raio);
    }
    public void setRaio(double r){
        this.raio = r;
    } 
    
}
