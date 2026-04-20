/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prg03aurorarodriguesmaciel.br.com.ifba.atividade10.view;

/**
 *
 * @author auror
 */
public class Cubo extends FormaTridimensional{//Classe concreta
    //Atributos
    private Quadrado face;
    private double aresta;
    
    //Metodo construtor
    public Cubo(Quadrado face, double aresta){
        this.setFace(face);
        this.setAresta(aresta);
    }
    
    //Metodo toString
    public String toString(){
        return("Cubo [" + "face = " + this.getFace() + "aresta = " + this.getAresta() + "]");
    }
    
    //Metodo obterVolume
    @Override
    public double obterVolume() {
        double volume = (Math.pow(this.getAresta(), 3));
        return(volume);
    }

    //Metodo obterArea
    @Override
    public double obterArea() {
        double area = (6 * this.face.obterArea());
        return(area);
    }
    
    //Metodos acessores e modificadores
    public Quadrado getFace(){
        return(this.face);
    }
    public void setFace(Quadrado face){
        this.face = face;
    }
    
    public double getAresta(){
        return(this.aresta);
    }
    public void setAresta(double aresta){
        this.aresta = aresta;
    }
    
    
    
}
