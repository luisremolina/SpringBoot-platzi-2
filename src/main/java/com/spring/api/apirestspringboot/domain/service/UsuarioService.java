package com.spring.api.apirestspringboot.domain.service;

import com.spring.api.apirestspringboot.domain.repository.UsuarioRepository;
import com.spring.api.apirestspringboot.persistence.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    public List<Usuario> findAllUsuarios(){
        return usuarioRepository.findAll();
    }

    public void createUsuario(Usuario usuario){
        usuarioRepository.save(usuario);
    }

    public Optional<Usuario> getByCorreo(String correo){
        return usuarioRepository.findByCorreo(correo);
    }

    public boolean existsByCorreo(String correo){
        return usuarioRepository.existsByCorreo(correo);
    }

}
