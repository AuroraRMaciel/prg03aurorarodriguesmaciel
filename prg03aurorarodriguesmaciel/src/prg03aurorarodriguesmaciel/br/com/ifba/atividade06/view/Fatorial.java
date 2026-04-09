/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prg03aurorarodriguesmaciel.br.com.ifba.atividade06.view;

/**
 *
 * @author auror
 */
public class Fatorial {
    //Cria os atributos da classe fatorial
    private int num = 0;//Numero que vai calcular o fatorial
    private int fat = 1;//Resultado do fatorial
    private String formula = "";//String que guarda a formula
    
    //Métodos
    public void setValor(int n){
        num = n;//Atributo num recebe n
        int f = 1;//Inteiro que irá guardar o valor do fatorial
        String s = "";//String que vai guardar a formula
        for (int c = n; c > 1; c--){
            f = f * c;//ou f *= c
            s = s + c + " x ";//ou s += c + " x "
        }
        s = s + "1 = ";//ou s += "1 = "
        fat = f;//Resultado do fatorial recebe f
        formula = s;//Formula recebe a string s
        
    }
    
    public int getFatorial(){
        return fat;//Retorna fatorial
    }
    
    public String getFormula(){
        return formula;//Retorna a formula
    }
}
