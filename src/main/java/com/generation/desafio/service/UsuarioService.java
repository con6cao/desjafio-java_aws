package com.generation.desafio.service;

import com.generation.desafio.dto.UsuarioDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UsuarioService {


    UsuarioDTO inserir(UsuarioDTO usuarioDTO);

    UsuarioDTO buscarById(Long userId);

    void deletar(Long id);

    List<UsuarioDTO> buscarAll();


    UsuarioDTO atualizar(Long id, UsuarioDTO usuarioDTO);
}