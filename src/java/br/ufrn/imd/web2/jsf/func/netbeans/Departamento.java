/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufrn.imd.web2.jsf.func.netbeans;

/**
 *
 * @author jubss
 */
public class Departamento {
    
    private String nome;
    private Chefe chefe;
    
    public Departamento(){
        
    }
    
    public void setNome(String _nome){
        this.nome = _nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setChefe(Chefe _chefe){
        this.chefe = _chefe;
    }
    
    public Chefe getChefe(){
        return this.chefe;
    }
    
    
    
}
