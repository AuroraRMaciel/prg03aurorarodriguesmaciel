/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prg03aurorarodriguesmaciel.br.com.ifba.atividade10.view;

/**
 *
 * @author auror
 */
public class Piramide extends FormaTridimensional{//Classe concreta que erda de FormaTridimensional
    //Atributos
    private Quadrado base;
    private Triangulo face;
    private double altura;
    
    //Metodo construtor
    public Piramide(Quadrado b, Triangulo f, double a){
        this.setBase(b);
        this.setFace(f);
        this.setAltura(a);
    }

    //Metodo toString
    public String toString(){
        return("Piramide [" + "base = " + this.getBase() + "face = " + this.getFace() + "altura = " + this.getAltura() + "]");
    }
    
    //Metodo obterVolume
    @Override
    public double obterVolume() {
        double volume = (this.base.obterArea() * this.getAltura()) / 3;
        return(volume);
    }

    //Metodo obterArea
    @Override
    public double obterArea() {
        double areaLateral = (this.face.obterArea() * 4);
        double areaTotal = (this.base.obterArea() + areaLateral);
        return(areaTotal);
    }
    
    //Metodos acessores e modificadores
    public Quadrado getBase(){
        return(this.base);
    }
    public void setBase(Quadrado b){
        this.base = b;
    }
    
    public Triangulo getFace(){
        return(this.face);
    }
    public void setFace(Triangulo f){
        this.face = f;
    }
    
    public double getAltura(){
        return(this.altura);
    }
    public void setAltura(double a){
        this.altura = a;
    }
    
    
}
