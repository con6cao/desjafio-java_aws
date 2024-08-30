package com.generation.desafio.exception;

public class NaoEncontradoException extends RuntimeException {
    public NaoEncontradoException(){
        super("Usuario ainda não encontrado. Faça o cadastro ou entre em contato com a diretoria");
    }
}
