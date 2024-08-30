package com.generation.desafio.controller;

import com.generation.desafio.dto.UsuarioDTO;
import com.generation.desafio.model.Usuario;
import com.generation.desafio.service.UsuarioService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequestMapping("/usuario")
@Api(value = "API de Cadastro de Aluno")
@RestController
public class UsuarioControler {
    private UsuarioService usuarioService;

    public UsuarioControler(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping(path = "/aluno")
    @ApiOperation(value = "Insere um novo aluno", response = Usuario[].class)
    public ResponseEntity inserir(@RequestBody @Valid UsuarioDTO usuarioDTO) {
        usuarioService.inserir(usuarioDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(usuarioDTO);
    }
    @GetMapping("{id}")
    @ApiOperation(value = "Lista um dos Alunos", response = Usuario[].class)

    public ResponseEntity<UsuarioDTO> buscarById(@PathVariable("id") Long id){
        UsuarioDTO usuarioDTO = usuarioService.buscarById(id);
        return new ResponseEntity<>(usuarioDTO, HttpStatus.OK);
    }
    @GetMapping
    @ApiOperation(value = "Lista todos dos Alunos", response = Usuario[].class)
    public ResponseEntity<List<UsuarioDTO>> buscar() {
        List<UsuarioDTO> usuarios = usuarioService.buscarAll();
        return new ResponseEntity<>(usuarios, HttpStatus.OK);
    }

    @PutMapping(path = "/aluno/{id}")
    @ApiOperation(value = "Atualizar Cadastro dos Alunos", response = Usuario[].class)
    public ResponseEntity<UsuarioDTO> atualizar(@PathVariable("id") Long id,
                                              @RequestBody UsuarioDTO usuarioDTO){
        usuarioDTO.toModel();
        UsuarioDTO atualiarUsuario = usuarioService.atualizar(id, usuarioDTO);
        return new ResponseEntity<>(atualiarUsuario, HttpStatus.OK);
    }
    @DeleteMapping(path = "/aluno/{id}")
    @ApiOperation(value = "deletar dos Aluno", response = Usuario[].class)
    public ResponseEntity<List<Usuario>> deletar() {
        return ResponseEntity.status(HttpStatus.OK).build();
    }

}
