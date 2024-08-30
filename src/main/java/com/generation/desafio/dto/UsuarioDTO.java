package com.generation.desafio.dto;

import com.generation.desafio.model.Usuario;

import javax.validation.constraints.NotBlank;


public record UsuarioDTO(
        Long id,
        @NotBlank String nome,
        @NotBlank String idade,
        @NotBlank String nt_Psem,
        @NotBlank String nt_Ssem,
        @NotBlank String num_Sala,
        @NotBlank String nome_Professor
      ) {

    public UsuarioDTO(Long id, String nome, String idade, String nt_Psem, String nt_Ssem, String num_Sala, String nome_Professor ) {


        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.nt_Psem = nt_Psem;
        this.nt_Ssem = nt_Ssem;
        this.num_Sala = num_Sala;
        this.nome_Professor = nome_Professor;
    }




    public Usuario toModel() {
        return new Usuario(id(),nome(),nt_Ssem(),nt_Psem(),num_Sala(),idade(),nome_Professor()
        );
    }
}

