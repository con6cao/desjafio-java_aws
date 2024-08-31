package com.generation.desafio.controller;

import com.generation.desafio.dto.UsuarioDTO;
import com.generation.desafio.exception.NaoEncontradoException;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

public interface UsuarioControlerImp {
    @Operation(summary = "Registrar Aluno", description = "Todos os cadastro de alunos serão feitos por essa rota")
    @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "successful operation")})
    @PostMapping(path = "/aluno")
    public ResponseEntity inserir(@RequestBody @Valid UsuarioDTO usuarioDTO);

    @Operation(summary = "Buscar Aluno", description = "Todos os consulta de alunos serão feitos por essa rota")
    @ApiResponse(responseCode = "404", content = @Content(schema = @Schema(implementation = NaoEncontradoException.class)))
    @ApiResponse(responseCode = "200", content = @Content(schema = @Schema(implementation = UsuarioDTO.class)))
    public ResponseEntity<UsuarioDTO> buscarById(@PathVariable("id") Long id);
}