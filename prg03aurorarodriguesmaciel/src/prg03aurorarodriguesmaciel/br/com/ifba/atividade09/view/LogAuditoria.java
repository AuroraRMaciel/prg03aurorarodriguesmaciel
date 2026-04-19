/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prg03aurorarodriguesmaciel.br.com.ifba.atividade09.view;

import java.time.LocalDateTime;

/**
 *
 * @author auror
 */
public class LogAuditoria {
    //Atributos
    private Usuario usuario;
    private String acao;
    private LocalDateTime dataHora;
    private String ip;
    
    //Metodo construtor
    public LogAuditoria(Usuario u, String a, LocalDateTime d, String i){
        this.setUsuario(u);
        this.setAcao(a);
        this.setDataHora(d);
        this.setIp(ip);
    }
    
    //Metodo toString
    @Override
    public String toString(){
        return("LogAuditoria [" + "Usuario = " + this.getUsuario() +
                "acao = " + this.getAcao() +
                "dataHora = " + this.getDataHora() + 
                "ip = " + this.getIp() + "]");
    }
    
    //Metodos acessores e modificadores
    public Usuario getUsuario(){
        return(this.usuario);
    }
    public void setUsuario(Usuario u){
        this.usuario = u;
    }
    
    public String getAcao(){
        return(this.acao);
    }
    public void setAcao(String a){
        this.acao = a;
    }
    
    public LocalDateTime getDataHora(){
        return(this.dataHora);
    }
    public void setDataHora(LocalDateTime d){
        this.dataHora = d;
    }
    
    public String getIp(){
        return(this.ip);
    }
    public void setIp(String ip){
        this.ip = ip;
    }
    
}
