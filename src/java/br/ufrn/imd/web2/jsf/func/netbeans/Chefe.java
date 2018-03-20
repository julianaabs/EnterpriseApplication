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
public class Chefe extends Funcionario {
    
    private Departamento dept;
    
    public Chefe(){
        
    }
    
    public void setDepartamento(Departamento _dept){
        this.dept = _dept;
    }
    
    public Departamento getDepartamento(){
        return this.dept;
    }
    
    
    
}
