/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lucas.objeto;

import java.util.Date;

/**
 *
 * @author lucas.159617
 */
public abstract class Pessoas {

    private String nome;
    private String rg;
    private String cpf; 
    Date dataNascimento;
    int idade;

    public Pessoas(String nome, String rg, String cpf, Date dataNascimento, int idade) {
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoas{" + "nome=" + nome + ", rg=" + rg + ", cpf=" + cpf + ", dataNascimento=" + dataNascimento + ", idade=" + idade + '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    

    
}
