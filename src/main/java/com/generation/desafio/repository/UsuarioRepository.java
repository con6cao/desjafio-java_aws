package com.generation.desafio.repository;


import com.generation.desafio.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {



}