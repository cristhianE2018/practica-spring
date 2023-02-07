package com.example.demo.controladores;


import com.example.demo.entidades.Apicultor;
import com.example.demo.repositorios.RepositorioApicultores;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ControladorApicultores {


    RepositorioApicultores repoApicultor;

    public ControladorApicultores(){

    }

    @GetMapping("apicultores")
    public List<Apicultor> getApicultores(){
        return this.repoApicultor.findAll();
    }

    /*
    @GetMapping("apicultores/id")
    public Apicultor getApicultorbyID(){

        return this.repoApicultor.findBy();
    }
     */
}
