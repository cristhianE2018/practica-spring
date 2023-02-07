package com.example.demo.servicios;

import com.example.demo.repositorios.RepositorioApicultores;
import org.springframework.stereotype.Component;

@Component
public class ServicioApicultores {

    RepositorioApicultores repoApicultor;

    public ServicioApicultores(RepositorioApicultores repoApicultor){
        this.repoApicultor = repoApicultor;
    }



}
