/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lucas.objeto;

/**
 *
 * @author lucas.159617
 */
public class Disciplina {
    private String nome1, departamento;
    private char status;

    public Disciplina(String nome1, String departamento, char status) {
        this.nome1 = nome1;
        this.departamento = departamento;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Disciplina{" + "nome1=" + nome1 + ", departamento=" + departamento + ", status=" + status + '}';
    }

    public String getNome1() {
        return nome1;
    }

    public void setNome1(String nome1) {
        this.nome1 = nome1;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }
 
    }
    
   