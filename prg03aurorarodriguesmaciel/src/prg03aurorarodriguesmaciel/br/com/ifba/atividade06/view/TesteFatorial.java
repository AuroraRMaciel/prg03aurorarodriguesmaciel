/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prg03aurorarodriguesmaciel.br.com.ifba.atividade06.view;

/**
 *
 * @author auror
 */
import java.util.Scanner;

public class TesteFatorial {
    
    public static void main (String[] args){
        Scanner leitor = new Scanner(System.in);
        Fatorial f = new Fatorial();//Cria um novo objeto chamado f da classe fatorial
        System.out.println("Digite o valor para calcular o fatorial:");
        int n = leitor.nextInt();
        f.setValor(n);//Chama o método que calcula o fatorial
        System.out.print(f.getFormula());//Imprime o resultado do método que retorna a fórmula
        System.out.println(f.getFatorial());//Imprime o resultado do método que retorna o valor do fatorial
        leitor.close();
    }
    
}
