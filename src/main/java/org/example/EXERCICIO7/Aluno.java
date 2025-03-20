package org.example.EXERCICIO7;

public class Aluno extends Pessoa{

    private String matricula;


    public Aluno(String nome, int idade, String matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void exibir(){
        System.out.println(nome+" com " +idade+ " anos de idade com a matricula " + matricula);
    }
}

