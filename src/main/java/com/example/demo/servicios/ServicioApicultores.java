package com.example.demo.servicios;

import com.example.demo.entidades.Apicultor;
import com.example.demo.repositorios.RepositorioApicultores;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
public class ServicioApicultores {

    RepositorioApicultores repoApicultor;

    public ServicioApicultores(RepositorioApicultores repoApicultor){
        this.repoApicultor = repoApicultor;
    }

    @Transactional
    public Apicultor guardarNuevo(Apicultor apicultor){
        return repoApicultor.save(apicultor);
    }

}
