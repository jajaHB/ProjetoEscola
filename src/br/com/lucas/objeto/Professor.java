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
public class Professor extends Pessoas {
    private List<Disciplina> Disciplina;
    private int cargaHoraria;
    private float valorHora;
    private float salario;

    public Professor(int cargaHoraria, float valorHora, float salario, String nome, String rg, String cpf, Date dataNascimento, int idade) {
        super(nome, rg, cpf, dataNascimento, idade);
        this.cargaHoraria = cargaHoraria;
        this.valorHora = valorHora;
        this.salario = salario;
  
    }
    public float calcularSalario(float valorHora, float cargaHoraria){
        return valorHora * cargaHoraria;
    }
}
    



