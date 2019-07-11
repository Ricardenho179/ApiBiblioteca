package com.fundatec.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class biblioteca {

    private List<String> livros;
    private String alunos;
    private int idade;

    public biblioteca(List<String> livros, String alunos, int idade) {
        this.livros = new ArrayList<>();
        this.alunos = alunos;
        this.idade = idade;
    }


}

