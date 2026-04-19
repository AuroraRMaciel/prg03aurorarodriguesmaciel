/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prg03aurorarodriguesmaciel.br.com.ifba.atividade09.view;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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
        //Cria uma lista para pessar como parametro para PerfilUsuario
        List<String> listaPermissoes = new ArrayList<>();
        //Adiciona strings a lista
        listaPermissoes.add("Bloquear usuarios");
        listaPermissoes.add("Postagem profissional");
        
        //Cria um objeto do tipo PerfilUsuario
        PerfilUsuario p1 = new PerfilUsuario("Perfil profissional", listaPermissoes);
        
        //Cria um objeto do tipo usuario
        Usuario u1 = new Usuario(p1, "Aurora Maciel", "@gmail.com", "123456", LocalDateTime.now(), true);
        //Chama o metodo logar
        u1.logar("123456");
        //Chama o metodo criarSessao
        u1.criarSessao();
        
        System.out.println(u1.toString());
        System.out.println(p1.toString());
    }
    
}
