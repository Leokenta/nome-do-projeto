package org.example.EXERCICIO7;

public class Aluno extends Pessoa{

    private String matricula;



    //CRIE UM CONSTRUTOR
    public Aluno(String nome, int idade, String matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    //CRIE GETTER E SETTER
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
