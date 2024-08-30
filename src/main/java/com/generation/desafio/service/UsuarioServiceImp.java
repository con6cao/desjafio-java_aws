package com.generation.desafio.service;

import com.generation.desafio.components.UsuarioValidator;
import com.generation.desafio.mapper.UsuarioMapper;
import com.generation.desafio.repository.UsuarioRepository;
import com.generation.desafio.dto.UsuarioDTO;
import com.generation.desafio.model.Usuario;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UsuarioServiceImp implements UsuarioService {

    private UsuarioRepository usuarioRepository;
    private UsuarioValidator usuarioValidator;

    public UsuarioServiceImp(UsuarioRepository usuarioRepository, UsuarioValidator usuarioValidator) {
        this.usuarioRepository = usuarioRepository;
        this.usuarioValidator = usuarioValidator;
    }


    @Override
    public UsuarioDTO inserir(UsuarioDTO usuarioDTO) {
        Usuario usuario = UsuarioMapper.mapToUser(usuarioDTO);
        Usuario inserirUsuario = usuarioRepository.save(usuario);
        UsuarioDTO inseriDTO = UsuarioMapper.mapToUserDto(usuario);
        return inseriDTO;
    }

    @Override
    public UsuarioDTO buscarById(Long userId) {
        Optional<Usuario> optionalbuscar = usuarioRepository.findById(userId);
        Usuario usuario = optionalbuscar.get();
        return UsuarioMapper.mapToUserDto(usuario);
    }

    @Override
    public List<UsuarioDTO> buscarAll() {
        List<Usuario> users = usuarioRepository.findAll();
        return users.stream().map(UsuarioMapper::mapToUserDto).collect(Collectors.toList());
    }
@Override
    public UsuarioDTO atualizar(Long id, UsuarioDTO usuarioDTO) {
        Usuario usuarioUpdate = usuarioRepository.findById(usuarioDTO.id()).get();
        usuarioUpdate.setIdade(usuarioDTO.idade());
        usuarioUpdate.setIdade(usuarioDTO.nome());
        usuarioUpdate.setIdade(usuarioDTO.nt_Psem());
        usuarioUpdate.setIdade(usuarioDTO.nt_Ssem());
        usuarioUpdate.setIdade(usuarioDTO.num_Sala());
        usuarioUpdate.setIdade(usuarioDTO.nome_Professor());
        Usuario atualizarUsuario = usuarioRepository.save(usuarioUpdate);
        return UsuarioMapper.mapToUserDto(atualizarUsuario);
    }


    @Override
    public void deletar(Long id) {
        usuarioRepository.deleteById(id);
    }
}
