package br.senai.sp.jandira.imcAcademia.model;

import java.util.Scanner;

public class CalculoImc {
    String nome;
    double pesoEmKg;
    double altura;
    double resultado;

    public void obterDados(){
        Scanner leitor= new Scanner(System.in);

        System.out.println("----------------------------------------");
        System.out.println("*** CALCULADORA DE IMC ***");
        System.out.println("----------------------------------------");

        System.out.print("Digite o Nome do aluno: ");
        nome = leitor.nextLine();
        System.out.print("Digite o Peso(Em Kg): ");
        pesoEmKg = leitor.nextDouble();
        System.out.print("Digite a Altura(Em Metros): ");
        altura= leitor.nextDouble();
        calcularImc();
    }
    public void calcularImc(){
       resultado = pesoEmKg/ (altura*altura);

       exibirResultado();
    }
    public void exibirResultado(){

        if(resultado <18.5 ){
            System.out.println("--- RESULTADO ---");
            System.out.println("Aluno: " + nome);
            System.out.println("IMC Calculado: " + resultado);
            System.out.println("Status: Você está ABAIXO do Peso ideal!");
            System.out.println("----------------------------------------");
        } else if (resultado >=18.5 && resultado<25.0){
            System.out.println("--- RESULTADO ---");
            System.out.println("Aluno: " + nome);
            System.out.println("IMC Calculado: " + resultado);
            System.out.println("Status: Você está com o Peso Ideal! Continue Assim!!" );
            System.out.println("----------------------------------------");
        } else if (resultado >=25.0 && resultado <30.0) {
            System.out.println("--- RESULTADO ---");
            System.out.println("Aluno: " + nome);
            System.out.println("IMC Calculado: " + resultado);
            System.out.println("Status: Você está levemente acima do peso! Cuidado...");
            System.out.println("----------------------------------------");

        } else if (resultado >=30.0 && resultado <35.0) {
            System.out.println("--- RESULTADO ---");
            System.out.println("Aluno: " + nome);
            System.out.println("IMC Calculado: " + resultado);
            System.out.println("Status: Você está com Obesidade grau 1! Ajuste a sua alimentação.");
            System.out.println("----------------------------------------");
            
        }else if (resultado >=35.0 && resultado <40.0){
            System.out.println("--- RESULTADO ---");
            System.out.println("Aluno: " + nome);
            System.out.println("IMC Calculado: " + resultado);
            System.out.println("Status: Você está com Obesidade grau 2 (SEVERA)! Ajuste a sua alimentação.");
            System.out.println("----------------------------------------");
            
        } else {
            System.out.println("--- RESULTADO ---");
            System.out.println("Aluno: " + nome);
            System.out.println("IMC Calculado: " + resultado);
            System.out.println("Status: Você está com Obesidade grau 3 (Mórbida)! Ajuste a sua alimentação URGENTEMENTE!!!");
            System.out.println("----------------------------------------");


        }


    }
}
