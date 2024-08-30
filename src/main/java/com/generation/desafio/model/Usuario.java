package com.generation.desafio.model;

import jakarta.persistence.*;

import javax.validation.constraints.NotBlank;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String idade;
    private String nt_Psem;
    private String nt_Ssem;
    private String num_Sala;
    private String nome_Professor;
    public Usuario(Long id, String nome, String idade, String nt_Psem, String nt_Ssem, String num_Sala, String nome_Professor) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.nt_Psem = nt_Psem;
        this.nt_Ssem = nt_Ssem;
        this.num_Sala = num_Sala;
        this.nome_Professor = nome_Professor;
    }

    public Usuario() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getNt_Psem() {
        return nt_Psem;
    }

    public void setNt_Psem(String nt_Psem) {
        this.nt_Psem = nt_Psem;
    }

    public String getNt_Ssem() {
        return nt_Ssem;
    }

    public void setNt_Ssem(String nt_Ssem) {
        this.nt_Ssem = nt_Ssem;
    }

    public String getNum_Sala() {
        return num_Sala;
    }

    public void setNum_Sala(String num_Sala) {
        this.num_Sala = num_Sala;
    }

    public String getNome_Professor() {
        return nome_Professor;
    }

    public void setNome_Professor(String nome_Professor) {
        this.nome_Professor = nome_Professor;
    }
}