/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prg03aurorarodriguesmaciel.br.com.ifba.atividade10.view;

/**
 *
 * @author auror
 */
public class Esfera extends FormaTridimensional{//Classe concreta que erda de FormaTridimensional
    //Atributos
    private double raio;

    //Metodo Construtor
    public Esfera(double r){
        this.setRaio(r);
    }
    
    //Metodo toString
    public String toString(){
        return("Esfera [" + "raio = " + this.getRaio() + "]");
    }
    
    //Metodo obterVolume
    @Override
    public double obterVolume() {
        double pi = 3.14;
        double volume = (4 * pi * Math.pow(this.getRaio(), 3)) / 3;
        return(volume);
    }
    
    //Metodo obterArea
    @Override
    public double obterArea() {
        double pi = 3.14;
        double area = (4 * pi * Math.pow(this.getRaio(), 2));
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
