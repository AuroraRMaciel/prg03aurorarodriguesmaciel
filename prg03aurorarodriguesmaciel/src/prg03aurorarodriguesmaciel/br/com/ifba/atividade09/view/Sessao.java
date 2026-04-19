/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prg03aurorarodriguesmaciel.br.com.ifba.atividade09.view;

/**
 *
 * @author auror
 */
public class Sessao {
    //Atributos
    private Usuario usuario;
    private String token;
    
    //Metodo construtor
    public Sessao(Usuario u, String t){
        this.setUsuario(u);
        this.setToken(t);
    }
    
    //Metodo toString
    public String toString(){
        return("Sessao [" + "Usuario = " + this.getUsuario() +
                ", token = " + this.getToken() + "]");
    }
    
    //Metodos acessores e modificadores
    public Usuario getUsuario(){
        return(this.usuario);
    }
    public void setUsuario(Usuario u){
        this.usuario = u;
    }
    
    public String getToken(){
        return(this.token);
    }
    public void setToken(String t){
        this.token = t;
    }
}
