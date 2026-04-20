/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prg03aurorarodriguesmaciel.br.com.ifba.atividade10.view;

/**
 *
 * @author auror
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Cria a face do cubo
        Quadrado faceCubo = new Quadrado(2);
        //Cria a base da piramide
        Quadrado basePiramide = new Quadrado(4);
        //Cria a face da piramide
        Triangulo facePiramide = new Triangulo(4,6);
        
        //Cria o vetor do tipo forma com 6 posicoes
        Forma[] listaFormas = new Forma[6];
        
        //Cria os objetos
        listaFormas[0] = new Triangulo(6, 4);
        listaFormas[1] = new Quadrado(5);
        listaFormas[2] = new Circulo(3);
        listaFormas[3] = new Esfera(3);
        listaFormas[4] = new Cubo(faceCubo, 2);
        listaFormas[5] = new Piramide(basePiramide, facePiramide, 6);
        
        //Cria um contador para formas tridimensionais
        int tridi = 0;
        //Cria o for que percorre o vetor
        for(int i = 0; i < 6; i++){
            //Se a forma for bidimensional
            if (listaFormas[i] instanceof FormaBidimensional == true){
                System.out.println("Forma Bidimensional. \n" + listaFormas[i].toString());
                System.out.println("Area: " + listaFormas[i].obterArea());
            }
            //Se for do tipo forma tridimensional
            else if(listaFormas[i] instanceof FormaTridimensional == true){
                //Imprime toString e area
                System.out.println("Forma tridimensional.\n" + listaFormas[i].toString());
                System.out.println("Area: " + listaFormas[i].obterArea());
                //Cria a lista do tipo forma tridimensional com 6 posicoes
                FormaTridimensional[] lista = new FormaTridimensional[6];
                //lista na posicao do contador de formas tridimensional recebe formas na posicao i
                lista[tridi] = (FormaTridimensional) listaFormas[i];
                //Imprime o volume lista[tride].obterVolume();
                System.out.println("Volume: " + lista[tridi].obterVolume());
                //Contabiliza mais 1 forma tridimensional
                tridi++;
            }
        }
        
    }
    
}
