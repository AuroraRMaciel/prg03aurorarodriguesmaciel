/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prg03aurorarodriguesmaciel.br.com.ifba.atividade10.view;

/**
 *
 * @author auror
 */
public class Triangulo extends FormaBidimensional{//Classe concreta que erda de FormaBidimensional
    //Atributos
    private double altura;
    private double base;

    //Metodo construtor
    public Triangulo(double a, double b){
        this.setAltura(a);
        this.setBase(b);
    }
    
    //Metodo toString
    public String toString(){
        return ("Triangulo [" + "altura = " + this.getAltura() +
                "base = " + this.getBase() + "]");
    }
    
    //Metodo obterArea
    @Override
    public double obterArea() {
        double area = (this.getAltura() * this.getBase()) / 2;
        return(area);
    }
    
    //Metodos acessores e modificadores
    public double getAltura(){
        return(this.altura);
    }
    public void setAltura(double a){
        this.altura = a;
    }
    
    public double getBase(){
        return(this.base);
    }
    public void setBase(double b){
        this.base = b;
    }
    
    
}
