/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prg03aurorarodriguesmaciel.br.com.ifba.atividade09.view;

import java.util.List;

/**
 *
 * @author auror
 */
public class PerfilUsuario {
    //Atributos
    private String descricao;
    private List<String> permissoes;
    
    //Metodo Construtor
    public PerfilUsuario(String d, List<String> p){
        this.setDescricao(d);
        this.setPermissoes(p);
    }
    
    @Override
    public String toString(){
        return("PerfilUsuario [" + "descricao = " + this.getDescricao() + "\n permissoes = " + this.getPermissoes() + "]");
    }
    //Metodos acessores e modificadores
    public String getDescricao(){
        return(this.descricao);
    }
    public void setDescricao(String d){
        this.descricao = d;
    }
    
    public List<String> getPermissoes(){
        return(this.permissoes);
    }
    public void setPermissoes(List<String> p){
        this.permissoes = p;
    }
}
