/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lucas.objeto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author lucas.159617
 */
public class Aluno extends Pessoas {
    private int Matricula;
    private Date dataMatricula;
    private List<Disciplina> Disciplina;

    public Aluno(int Matricula, Date dataMatricula, String nome, String rg, String cpf, Date dataNascimento, int idade) {
        super(nome, rg, cpf, dataNascimento, idade);
        this.Matricula = Matricula;
        this.dataMatricula = dataMatricula;
    }

    @Override
    public String toString() {
        return "Aluno{" + "Matricula=" + Matricula + ", dataMatricula=" + dataMatricula + ", Disciplina=" + Disciplina + '}';
    
    }
    }
    
    


    
    
   
    
    

