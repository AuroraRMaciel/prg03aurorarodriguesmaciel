/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prg03aurorarodriguesmaciel.br.com.ifba.atividade09.view;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 *
 * @author auror
 */
public class Usuario {
    //Atributos
    private PerfilUsuario perfil;
    private String nomeUsuario;
    private String email;
    private String senha;
    private LocalDateTime ultimoLogin;
    private boolean ativo;
    
    //Metodo construtor
    public Usuario(PerfilUsuario p, String nome, String email, String s, LocalDateTime u, boolean a){
        this.setPerfil(p);
        this.setNomeUsuario(nome);
        this.setEmail(email);
        this.setSenha(s);
        this.setUltimoLogin(u);
        this.setAtivo(a);
    }
    
    //Metodo toString
    @Override
    public String toString(){
        return ("Usuario [" + "perfil = " + this.getPerfil() + 
                "\n nomeUsuario = " + this.getNomeUsuario() +
                "\n email = " + this.getEmail() + 
                "\n senha = " + this.getSenha() +
                "\n ultimoLogin = " + this.getUltimoLogin() + 
                "\n ativo = " + this.isAtivo() + "]");
    }
    
    //Metodo logar
    public void logar(String senha){
        if (senha.equals(this.getSenha()) == true){
            this.setUltimoLogin(LocalDateTime.now());
            LogAuditoria l1 = new LogAuditoria (this, "Login realizado", this.getUltimoLogin(), "001110");
            System.out.println(l1.getAcao());
        }
        else{
            LogAuditoria l1 = new LogAuditoria(this, "Falha no login", LocalDateTime.now(), "001110");
            System.out.println(l1.getAcao());
        }
            
    }
    
    //Metodo criarSessao
    public void criarSessao(){
        String token = UUID.randomUUID().toString();
        Sessao s1 = new Sessao(this, token);
    }
    
    //Metodos acessores e modificadores
    public PerfilUsuario getPerfil(){
        return(this.perfil);
    }
    public void setPerfil(PerfilUsuario p){
        this.perfil = p;
    }
    
    public String getNomeUsuario(){
        return(this.nomeUsuario);
    }
    public void setNomeUsuario(String nome){
        this.nomeUsuario = nome;
    }
    
    public String getEmail(){
        return(this.email);
    }
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getSenha(){
        return(this.senha);
    }
    public void setSenha(String s){
        this.senha = s;
    }
    
    public LocalDateTime getUltimoLogin(){
        return(this.ultimoLogin);
    }
    public void setUltimoLogin(LocalDateTime u){
        this.ultimoLogin = u;
    }
    
    public boolean isAtivo(){
        return(this.ativo);
    }
    public void setAtivo(boolean a){
        this.ativo = a;
    }
}
