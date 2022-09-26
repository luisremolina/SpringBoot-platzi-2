package com.spring.api.apirestspringboot.persistence.entity;

import com.spring.api.apirestspringboot.persistence.enums.Role;

import javax.persistence.*;

@Entity
@Table(name = "ob_usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String correo;
    private String constrasena;
    private Role rol;

    public Usuario() {
    }

    public Usuario(Long id, String nombre, String correo, String constrasena, Role rol) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.constrasena = constrasena;
        this.rol = rol;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getConstrasena() {
        return constrasena;
    }

    public void setConstrasena(String constrasena) {
        this.constrasena = constrasena;
    }

    public Role getRol() {
        return rol;
    }

    public void setRol(Role rol) {
        this.rol = rol;
    }
}
