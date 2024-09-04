package com.generation.desafio.controller;

import com.generation.desafio.dto.UsuarioDTO;
import com.generation.desafio.model.Usuario;
import com.generation.desafio.service.UsuarioService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequestMapping()
@Tag(name = "Cadastro para Aluno")
@RestController
public class UsuarioControler {
    private final UsuarioService usuarioService;

    public UsuarioControler(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping(path = "/aluno")
    @Operation(summary = "Registrar Aluno", description = "Todos os cadastro de alunos serão feitos por essa rota")
    @ApiResponses(value = {@ApiResponse(responseCode = "201", description = "Created")})
    public ResponseEntity inserir(@RequestBody @Valid UsuarioDTO usuarioDTO) {
        usuarioService.inserir(usuarioDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(usuarioDTO);
    }

    @GetMapping(path = "/aluno/{id}")
    @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "OK")})
    @Operation(summary = "Buscar o Aluno", description = "Todos os cadastro de alunos serão feitos por essa rota")
    public ResponseEntity<UsuarioDTO> buscarById(@PathVariable("id") Long id) {
        UsuarioDTO usuarioDTO = usuarioService.buscarById(id);
        return new ResponseEntity<>(usuarioDTO, HttpStatus.OK);
    }

    @GetMapping
    @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "successful operation")})
    @Operation(summary = "Buscar varios Alunos", description = "Todos os cadastro de alunos serão feitos por essa rota")
    public ResponseEntity<List<UsuarioDTO>> buscar() {
        List<UsuarioDTO> usuarios = usuarioService.buscarAll();
        return new ResponseEntity<>(usuarios, HttpStatus.OK);
    }

    @PutMapping(path = "/aluno/{id}")
    @ApiResponses(value = {@ApiResponse(responseCode = "202", description = "Accepted")})
    @Operation(summary = "Atualizar Cadastro do Alunos")
    public ResponseEntity<UsuarioDTO> atualizar(@PathVariable("id") Long id,
                                                @RequestBody UsuarioDTO usuarioDTO) {
        usuarioDTO.toModel();
        UsuarioDTO atualiarUsuario = usuarioService.atualizar(id, usuarioDTO);
        return new ResponseEntity<>(atualiarUsuario, HttpStatus.ACCEPTED);
    }

    @DeleteMapping(path = "/aluno/{id}")
    @Operation(summary = "Deletar o Aluno")
    @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "OK")})
    public ResponseEntity<List<Usuario>> deletar() {
        return ResponseEntity.status(HttpStatus.OK).build();
    }

}
