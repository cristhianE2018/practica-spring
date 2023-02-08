package com.example.demo.controladores;


import com.example.demo.entidades.Apicultor;
import com.example.demo.repositorios.RepositorioApicultores;
import com.example.demo.servicios.ServicioApicultores;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

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

    @GetMapping("apicultores/{idApicultor}")
    public ResponseEntity<Apicultor> getPorId(
            @PathVariable("idApicultor") String id
    ){
        LOGGER.debug("GET apicultores id:{}",id);
        Optional<Apicultor> opa = this.repoApicultor.findById(id);
        if(opa.isPresent()){
            return ResponseEntity.ok(opa.get());
        }
        else{
            return ResponseEntity.notFound().build();
        }
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

    @DeleteMapping("apicultores/{idApicultor}")
    public ResponseEntity borrar(@PathVariable("idApicultor") String id){
        this.repoApicultor.deleteById(id);
        return ResponseEntity.ok().build();
    }



}
