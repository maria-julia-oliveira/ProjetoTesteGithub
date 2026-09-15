package com.mycompany.projetotestegithub;
import com.mycompany.usuarios.Aluno;

public class ProjetoTesteGithub {
    public static void main(String[] args) {
        Aluno Ana = new Aluno("Ana Barramas sixserverton", 67);
        System.out.printf("%s", Ana.apresentar());
    }
}