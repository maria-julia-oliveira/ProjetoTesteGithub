package com.mycompany.usuarios;


public class Aluno {
    public String nome;
    public Integer idade;
    
    public Aluno(String nome, Integer idade){
        this.nome = nome;
        this.idade = idade;
    }
    
    public String apresentar(){
        return "\nNome: " + this.nome + "\nIdade: " + this.idade;
    }
}

