package com.generation.desafio.mapper;

import com.generation.desafio.dto.UsuarioDTO;
import com.generation.desafio.model.Usuario;

public class UsuarioMapper {

    public static UsuarioDTO mapToUserDto(Usuario usuario) {
        return new UsuarioDTO(
                usuario.getId(),
                usuario.getNome(),
                usuario.getIdade(),
                usuario.getNt_Psem(),
                usuario.getNt_Ssem(),
                usuario.getNum_Sala(),
                usuario.getNome_Professor()

        );
    }

    public static Usuario mapToUser(UsuarioDTO usuarioDTO) {
        return new Usuario(
                usuarioDTO.id(),
                usuarioDTO.nome(),
                usuarioDTO.nt_Ssem(),
                usuarioDTO.nt_Psem(),
                usuarioDTO.num_Sala(),
                usuarioDTO.idade(),
                usuarioDTO.nome_Professor()
        );
    }
}
