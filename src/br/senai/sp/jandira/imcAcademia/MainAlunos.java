package br.senai.sp.jandira.imcAcademia;

import br.senai.sp.jandira.imcAcademia.model.CalculoImc;

public class MainAlunos {
    public static void main (String[] args){

        System.out.println("Iniciando o Cálculo!");

        CalculoImc calculoImc= new CalculoImc();
        calculoImc.obterDados();

    }

}
