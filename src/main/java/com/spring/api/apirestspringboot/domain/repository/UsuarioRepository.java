package com.spring.api.apirestspringboot.domain.repository;

import com.spring.api.apirestspringboot.persistence.entity.Usuario;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository  extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByCorreo(String nombre);
    boolean existsByCorreo(String correo);
}
