package com.spring.api.apirestspringboot.web.controller;

import com.spring.api.apirestspringboot.domain.dto.Mensaje;
import com.spring.api.apirestspringboot.domain.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@SpringBootApplication
//@RequestMapping("/usuario")
public class UsuarioController {

//    @Autowired
//    UsuarioService usuarioService;

    @GetMapping("/hi")
    public ResponseEntity<String> saludo(){
        return new ResponseEntity(new Mensaje("HOLA PUTITA"), HttpStatus.OK);
    }

}
