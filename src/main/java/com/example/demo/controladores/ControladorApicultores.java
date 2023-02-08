package com.example.demo.controladores;


import com.example.demo.entidades.Apicultor;
import com.example.demo.repositorios.RepositorioApicultores;
import com.example.demo.servicios.ServicioApicultores;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.util.List;

@RestController
public class ControladorApicultores {

    private static final Logger LOGGER = LoggerFactory.getLogger(ControladorEjemplo.class);

    RepositorioApicultores repoApicultor;
    ServicioApicultores servApicultores;
    public ControladorApicultores(RepositorioApicultores repoApicultor,ServicioApicultores servApicultores){
        this.repoApicultor = repoApicultor;
        this.servApicultores = servApicultores;
    }

    @GetMapping("apicultores")
    public List<Apicultor> getApicultores(){
        LOGGER.debug("getApicultores() ");

        return this.repoApicultor.findAll();
    }

    @PostMapping("apicultores")
    public ResponseEntity<Apicultor> crear(
            @RequestBody Apicultor nuevoA
    ){
        try {
            this.servApicultores.guardarNuevo(nuevoA);
            return ResponseEntity.created(new URI("apicultores/" + nuevoA.getId_apicultor()))
                    .body(nuevoA);
        }
        catch (Exception ex){
            return ResponseEntity.status(400)
                    .header("ERROR", ex.getMessage())
                    .build();
        }
    }
    /*
    @GetMapping("apicultores/id")
    public Apicultor getApicultorbyID(){

        return this.repoApicultor.findBy();
    }
     */
}
