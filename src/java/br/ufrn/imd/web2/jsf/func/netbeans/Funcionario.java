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
public class Funcionario {
    
    private String nome;
    private double salario;
    private Departamento lotacao;
    
    public Funcionario(){
        
    }
    
    public Funcionario(String nome, double salario){
        
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }
    
    public double getSalario(){
        return this.salario;
    }
    
    public void setLotacao(Departamento _lotacao){
        this.lotacao = _lotacao;
    }
    
    public Departamento getLotacao(){
        return this.lotacao;
    }
    
    
    
    
    
    
    
}
