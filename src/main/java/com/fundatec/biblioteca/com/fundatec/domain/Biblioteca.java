package com.fundatec.biblioteca.com.fundatec.domain;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {


    @Id
    private ObjectId _id;


    private List<String> livros;
    @NotNull
    @NotEmpty
    private String alunos;
    @NotNull
    private int idade;

    public Biblioteca(ObjectId _id, List<String> livros, String alunos, int idade) {
        this._id = _id;
        this.livros = new ArrayList<>();
        this.alunos = alunos;
        this.idade = idade;
    }

    public Biblioteca() {
    }

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public List<String> getLivros() {
        return livros;
    }

    public void setLivros(List<String> livros) {
        this.livros = livros;
    }

    public String getAlunos() {
        return alunos;
    }

    public void setAlunos(String alunos) {
        this.alunos = alunos;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

